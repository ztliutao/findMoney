package com.wallet.findMoneyApp.util.enums;

/**
 *
 */
public enum ProductTypeEnum {
    ALL("", "所有"), ID("1", "身份证贷"), BANK("2", "银行卡贷"), CARD("3", "信用卡代"), GJJ("4", "公积金贷"), SB("5", "社保贷"), ZMFD("6", "芝麻分贷");
    private String code;
    private String msg;

    ProductTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ProductTypeEnum{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
