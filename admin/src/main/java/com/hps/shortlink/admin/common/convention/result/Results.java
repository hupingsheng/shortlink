package com.hps.shortlink.admin.common.convention.result;


import com.hps.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.hps.shortlink.admin.common.convention.exception.AbstractException;

import java.util.Optional;

/**
 * ȫ�ַ��ض�������
 */
public final class Results {

    /**
     * ����ɹ���Ӧ
     */
    public static Result<Void> success() {
        return new Result<Void>()
                .setCode(Result.SUCCESS_CODE);
    }

    /**
     * ������������ݵĳɹ���Ӧ
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>()
                .setCode(Result.SUCCESS_CODE)
                .setData(data);
    }

    /**
     * ���������ʧ����Ӧ
     */
    public static Result<Void> failure() {
        return new Result<Void>()
                .setCode(BaseErrorCode.SERVICE_ERROR.code())
                .setMessage(BaseErrorCode.SERVICE_ERROR.message());
    }

    /**
     * ͨ�� {@link AbstractException} ����ʧ����Ӧ
     */
    public static Result<Void> failure(AbstractException abstractException) {
        String errorCode = Optional.ofNullable(abstractException.getErrorCode())
                .orElse(BaseErrorCode.SERVICE_ERROR.code());
        String errorMessage = Optional.ofNullable(abstractException.getErrorMessage())
                .orElse(BaseErrorCode.SERVICE_ERROR.message());
        return new Result<Void>()
                .setCode(errorCode)
                .setMessage(errorMessage);
    }

    /**
     * ͨ�� errorCode��errorMessage ����ʧ����Ӧ
     */
    public static Result<Void> failure(String errorCode, String errorMessage) {
        return new Result<Void>()
                .setCode(errorCode)
                .setMessage(errorMessage);
    }
}