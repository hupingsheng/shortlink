package com.hps.shortlink.admin.test;


public class UserTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_user_%d` (\n" +
            "  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `username` varchar(256) DEFAULT NULL COMMENT '�û���',\n" +
            "  `password` varchar(512) DEFAULT NULL COMMENT '����',\n" +
            "  `real_name` varchar(256) DEFAULT NULL COMMENT '��ʵ����',\n" +
            "  `phone` varchar(128) DEFAULT NULL COMMENT '�ֻ���',\n" +
            "  `mail` varchar(512) DEFAULT NULL COMMENT '����',\n" +
            "  `deletion_time` bigint DEFAULT NULL COMMENT 'ע��ʱ���',\n" +
            "  `create_time` datetime DEFAULT NULL COMMENT '����ʱ��',\n" +
            "  `update_time` datetime DEFAULT NULL COMMENT '�޸�ʱ��',\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL COMMENT 'ɾ����ʶ 0:δɾ�� 1:��ɾ��',\n" +
            "  KEY `id` (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";


    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.println(String.format(SQL,i));
        }
    }
}
