package com.hps.shortlink.admin.common.convention.result;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * ȫ�ַ��ض���
 */
@Data
@Accessors(chain = true)
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5679018624309023727L;

    /**
     * ��ȷ������
     */
    public static final String SUCCESS_CODE = "0";

    /**
     * ������
     */
    private String code;

    /**
     * ������Ϣ
     */
    private String message;

    /**
     * ��Ӧ����
     */
    private T data;

    /**
     * ����ID
     */
    private String requestId;

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }
}