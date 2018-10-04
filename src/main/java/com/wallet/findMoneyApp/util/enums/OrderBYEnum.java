package com.wallet.findMoneyApp.util.enums;

/**
 * 所填为数据库字段
 */
public enum OrderBYEnum {
    _DEFAULT("id","默认排序"),SUCESS_RATE("id desc","贷款成功率高"),FASTER("min_credit_time desc","放款速度快"),
    _RATE_LOW("rate","贷款利息低"),AMOUNT_BIG("max_amount desc","贷款金额大")
    ;
    private String code;
    private String desc;

    OrderBYEnum(String code, String desc) {
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

    @Override
    public String toString() {
        return "OrderBYEnum{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
