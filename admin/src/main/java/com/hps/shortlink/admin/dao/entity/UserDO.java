package com.hps.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hps.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * �û��־ò�ʵ��
 */

@Data
@TableName("t_user")
@Accessors(chain = true)
public class UserDO {

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

    /**
     * ע��ʱ���
     */
    private Long deletionTime;

    /**
     * ����ʱ��
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * �޸�ʱ��
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * ɾ����ʶ 0:δɾ�� 1:��ɾ��
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;

}
