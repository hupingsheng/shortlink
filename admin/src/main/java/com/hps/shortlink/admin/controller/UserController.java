package com.hps.shortlink.admin.controller;

import com.hps.shortlink.admin.dto.resp.UserRespDTO;
import com.hps.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * �û�������Ʋ�
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * �����û�����ѯ�û���Ϣ
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
