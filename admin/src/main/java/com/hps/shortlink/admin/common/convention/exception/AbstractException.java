package com.hps.shortlink.admin.common.convention.exception;

import com.hps.shortlink.admin.common.convention.errorcode.IErrorCode;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * ������Ŀ�������쳣��ϵ���ͻ����쳣��������쳣�Լ�Զ�̷�������쳣
 *
 * ClientException
 * ServiceException
 * RemoteException
 */
@Getter
public abstract class AbstractException extends RuntimeException {

    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(StringUtils.hasLength(message) ? message : null).orElse(errorCode.message());
    }
}