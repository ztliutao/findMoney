package com.wallet.findMoneyApp.util.enums;

/**
 * 入口类型
 */
public enum EntrTypeEnum {
    NEW_ARRIVAL("1", "新口子"),
    RAPIDLY_SEC_CREDIT("2", "急速秒贷"),
    CREDIT_SCORE("3", "芝麻分借"),
    BIG_AMOUNT_CREDIT("4", "大额信贷");
    private String code;
    private String desc;

     EntrTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
