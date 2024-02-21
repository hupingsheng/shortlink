package com.hps.shortlink.admin.dto.resp;


import lombok.Data;

import java.util.Date;

/**
 * �û����ز�����Ӧ
 */
@Data
public class UserRespDTO {

    /**
     * id
     */
    private Long id;

    /**
     * �û���
     */
    private String username;

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
