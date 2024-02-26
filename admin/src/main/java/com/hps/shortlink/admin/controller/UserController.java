package com.hps.shortlink.admin.controller;

import com.hps.shortlink.admin.common.convention.result.Result;
import com.hps.shortlink.admin.common.convention.result.Results;
import com.hps.shortlink.admin.dto.req.UserLoginReqDTO;
import com.hps.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.hps.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.hps.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.hps.shortlink.admin.dto.resp.UserRespDTO;
import com.hps.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     *根据用户名查询用户
     * @param username
     * @return
     */
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username){
        UserRespDTO result = userService.getUserByUsername(username);
        //controller
        return Results.success(result);
    }

    /**
     * 根据用户名查询用户是否存在
     * @param username
     * @return
     */
    @GetMapping("/api/short-link/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username){
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     * @param requestParam
     * @return
     */
    @PostMapping("/api/short-link/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam){
        userService.register(requestParam);
        return Results.success();
    }

    @PutMapping("/api/short-link/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam){
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录
     * @param
     * @return
     */
    @PostMapping("/api/short-link/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam){
        System.out.println("测试");
        return Results.success(userService.login(requestParam));
    }

    /**
     * 检查用户是否登录
     */
    @GetMapping("/api/short-link/v1/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("token") String token, @RequestParam("username") String username){
        return Results.success(userService.checkLogin(username,token));
    }

    @DeleteMapping("/api/short-link/v1/user/logout")
    public Result<Void> logout(@RequestParam("token") String token, @RequestParam("username") String username){
        userService.logout(username, token);
        return Results.success();
    }


}
