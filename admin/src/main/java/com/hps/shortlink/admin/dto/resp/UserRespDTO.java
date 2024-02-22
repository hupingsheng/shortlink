package com.hps.shortlink.admin.dto.resp;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hps.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
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
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * ����
     */
    private String mail;


}
