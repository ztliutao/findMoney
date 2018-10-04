package com.wallet.findMoneyApp.util;

import java.util.Random;

/**
 * 短信发送
 */
public class MsgUril {
    private static  final String SOURCES="0123456789";
    /**
     * 生成随机数
     */
    public static String createMsg() {
        String sources =SOURCES; // 加上一些字母，就可以生成pc站的验证码了
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 6; j++) {
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }
        return flag.toString();
    }
}
