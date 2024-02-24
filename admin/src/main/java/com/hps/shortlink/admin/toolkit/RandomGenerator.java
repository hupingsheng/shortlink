package com.hps.shortlink.admin.toolkit;


import java.util.Random;

/**
 *  分组ID随机生成器
 */
public final class RandomGenerator {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateRandom(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public static String generateRandom() {
        return generateRandom(6);
    }

}
