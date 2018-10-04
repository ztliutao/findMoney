package com.wallet.findMoneyApp.util.enums;

public enum ApplyTypeEnum {
    CREDIT_PRODUCT("1","信用卡"),CREDIT_CARD("2","贷款")
    ;
    private String code;
    private String desc;

    ApplyTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ApplyTypeEnum{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
