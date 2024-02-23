package com.hps.shortlink.admin.controller;

import com.hps.shortlink.admin.common.convention.result.Result;
import com.hps.shortlink.admin.common.convention.result.Results;
import com.hps.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.hps.shortlink.admin.dto.resp.UserRespDTO;
import com.hps.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * ???????????
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * ??????????????????
     *
     * @param username
     * @return
     */
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username){
        UserRespDTO result = userService.getUserByUsername(username);
        //controller??????????????ж????
        return Results.success(result);
    }

    @GetMapping("/api/short-link/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username){
        return Results.success(userService.hasUsername(username));
    }

    @PostMapping("/api/short-link/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam){
        userService.register(requestParam);
        return Results.success();
    }
}
