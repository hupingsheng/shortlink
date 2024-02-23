package com.hps.shortlink.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hps.shortlink.admin.dao.entity.UserDO;
import com.hps.shortlink.admin.dto.req.UserLoginReqDTO;
import com.hps.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.hps.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.hps.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.hps.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {



    /**
     * 根据用户名返回实体
     * @param username
     * @return
     */
    UserRespDTO getUserByUsername(String username);

    Boolean hasUsername(String username);

    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     * @param requestParam
     */
    void update(UserUpdateReqDTO requestParam);

    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param token
     * @return
     */
    Boolean checkLogin(String username, String token);
}
