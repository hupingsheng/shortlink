package com.hps.shortlink.admin.dto.req;


import lombok.Data;

@Data
public class UserRegisterReqDTO {

    /**
     * id
     */
    private Long id;

    /**
     * �û���
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * ��ʵ����
     */
    private String realName;

    /**
     * �ֻ���
     */
    private String phone;

    /**
     * ����
     */
    private String mail;

}
