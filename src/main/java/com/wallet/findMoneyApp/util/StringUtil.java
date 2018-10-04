package com.wallet.findMoneyApp.util;

import com.wallet.findMoneyApp.model.result.UserReuslt;
import com.wallet.findMoneyApp.model.vo.ProductQueryBody;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtil {
    private static final Logger logger = LoggerFactory.getLogger(StringUtil.class);

    /**
     * 验证手机号码格式
     *
     * @param phone
     * @return
     */

    public static UserReuslt isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            return new UserReuslt(ResultEnum._1.getCode(), "手机号应为11位数");
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            if (!isMatch) {
                return new UserReuslt(ResultEnum._1.getCode(), "请填入正确的手机号");
            }
            return new UserReuslt(ResultEnum._0.getCode(), ResultEnum._0.getMsg());

        }
    }

    /**
     * 验签方法
     *
     * @param sign
     * @return
     */
    public static boolean isValidate(String param, String key, String sign) {
        try {
            logger.info("isValidate init sign:{}", sign);
            String signP = md5(param, key);
            logger.info("isValidate init signP:{}", signP);
            return !sign.equalsIgnoreCase(signP);
        } catch (Exception e) {
            logger.error("isValidate  is error");
            return false;
        }

    }

    /**
     * MD5方法
     *
     * @param param 明文
     * @param key   密钥
     * @return 密文
     * @throws Exception
     */
    public static String md5(String param, String key) {
        logger.info("md5 init param:{},key:{}", new Object[]{param, key});
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return DigestUtils.md5DigestAsHex((param + key).getBytes("utf-8"));
        } catch (Exception e) {
            logger.info("md5 is error", e.getMessage(), e);
            return "";
        }

    }


    /**
     * 获取加签原串
     *
     * @param object
     * @return
     */
    public static String getSignChar(Object object) {
        Class<?> clz = object.getClass();

        StringBuffer sb = new StringBuffer();
        String[] fileNames = getFileNames(object);
        for (String name : fileNames) {
            if (name.equals("tk") || name.equals("sign")) {
                break;
            }
            Object o = getFieldValueByName(name, object);
            sb.append(o).append("&");

        }

        logger.info("getSignChar sb", sb.substring(0, sb.length() - 1).toString());
        if (sb.length() <= 0) {
            return sb.toString();
        }
        return sb.substring(0, sb.length() - 1).toString();
    }

    /**
     * 获取所有属性名称
     *
     * @param object
     * @return
     */
    public static String[] getFileNames(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getGenericType().toString().equals("class java.lang.String")) {
                list.add(fields[i].getName());
            }
        }
        String[] fieldNames = list.stream().toArray(String[]::new);
        Arrays.sort(fieldNames);
        return fieldNames;

    }

    /**
     * 获取属性值
     *
     * @param fieldName
     * @param o
     * @return
     */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {

            return null;
        }
    }

    /**
     * 随机生成手机号码
     *
     * @return
     */
    private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    private static int getNum(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

    public static String getTel() {
        int index = getNum(0, telFirst.length - 1);
        String first = telFirst[index];
        String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
        String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
        return first + second + third;
    }


    public static void main(String[] args) {
//        System.out.println(getFileNames(new UserInfo()));

//        try {
//            MessageDigest instance = MessageDigest.getInstance("MD5");
//
//        } catch (NoSuchAlgorithmException e) {
//            logger.error("isValidate is error", e.getMessage(), e);
//        }


    }
}
