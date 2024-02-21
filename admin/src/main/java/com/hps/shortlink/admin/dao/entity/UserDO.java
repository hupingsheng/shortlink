package com.hps.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * �û��־ò�ʵ��
 */

@Data
@TableName("t_user")
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
    private Date createTime;

    /**
     * �޸�ʱ��
     */
    private Date updateTime;

    /**
     * ɾ����ʶ 0:δɾ�� 1:��ɾ��
     */
    private Integer delFlag;

}
