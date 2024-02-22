package com.hps.shortlink.admin.common.enums;

import com.hps.shortlink.admin.common.convention.errorcode.IErrorCode;

public enum UserErrorCodeEnum implements IErrorCode {

    USER_NULL("B000200", "�û���¼������"),

    USER_NAME_EXIST("B000201", "�û����Ѵ���"),

    USER_EXIST("B000202", "�û���¼�Ѵ���"),

    USER_SAVE_EXIST("B000203", "�û���¼����ʧ��");


    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
