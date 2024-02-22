package com.hps.shortlink.admin.common.convention.errorcode;

/**
 * ���������붨��
 */
public enum BaseErrorCode implements IErrorCode {

    // ========== һ����۴����� �ͻ��˴��� ==========
    CLIENT_ERROR("A000001", "�û��˴���"),

    // ========== ������۴����� �û�ע����� ==========
    USER_REGISTER_ERROR("A000100", "�û�ע�����"),
    USER_NAME_VERIFY_ERROR("A000110", "�û���У��ʧ��"),
    USER_NAME_EXIST_ERROR("A000111", "�û����Ѵ���"),
    USER_NAME_SENSITIVE_ERROR("A000112", "�û����������д�"),
    USER_NAME_SPECIAL_CHARACTER_ERROR("A000113", "�û������������ַ�"),
    PASSWORD_VERIFY_ERROR("A000120", "����У��ʧ��"),
    PASSWORD_SHORT_ERROR("A000121", "���볤�Ȳ���"),
    PHONE_VERIFY_ERROR("A000151", "�ֻ���ʽУ��ʧ��"),

    // ========== ������۴����� ϵͳ����ȱ���ݵ�Token ==========
    IDEMPOTENT_TOKEN_NULL_ERROR("A000200", "�ݵ�TokenΪ��"),
    IDEMPOTENT_TOKEN_DELETE_ERROR("A000201", "�ݵ�Token�ѱ�ʹ�û�ʧЧ"),

    // ========== һ����۴����� ϵͳִ�г��� ==========
    SERVICE_ERROR("B000001", "ϵͳִ�г���"),
    // ========== ������۴����� ϵͳִ�г�ʱ ==========
    SERVICE_TIMEOUT_ERROR("B000100", "ϵͳִ�г�ʱ"),

    // ========== һ����۴����� ���õ������������ ==========
    REMOTE_ERROR("C000001", "���õ������������");

    private final String code;

    private final String message;

    BaseErrorCode(String code, String message) {
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