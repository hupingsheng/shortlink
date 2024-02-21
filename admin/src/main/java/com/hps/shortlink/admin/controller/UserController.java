package com.hps.shortlink.admin.controller;

import com.hps.shortlink.admin.dto.resp.UserRespDTO;
import com.hps.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username){
        UserRespDTO userRespDTO = userService.getUserByUsername("hps");
        return userRespDTO;
    }
}
