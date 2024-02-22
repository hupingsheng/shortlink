package com.hps.shortlink.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hps.shortlink.admin.dao.entity.UserDO;
import com.hps.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.hps.shortlink.admin.dto.resp.UserRespDTO;

/**
 * �û��ӿڲ�
 */
public interface UserService extends IService<UserDO> {

    /**
     * �����û�������ʵ��
     * @param username
     * @return
     */
    UserRespDTO getUserByUsername(String username);

    Boolean hasUsername(String username);

    void register(UserRegisterReqDTO requestParam);
}
