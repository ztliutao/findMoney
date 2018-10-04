package com.wallet.findMoneyApp.util.enums;

/**
 * 贷款金额范围
 */
public enum ProductAmountLimitEnum {
    ALL("0","", "", "所有金额"),
    _1000_2000("1","0", "1999", "2000以下"),
    _2000_5000("2","2000", "4999", "2000-5000"),
    _5000_10000("3","5000", "9999", "5000_10000"),
    _10000_30000("4","10000", "29999", "10000_30000"),
    _30000("5","30000","","30000以上");

    ProductAmountLimitEnum() {
    }

    private String code;
    private String min;
    private String max;
    private String desc;

    ProductAmountLimitEnum(String code, String min, String max, String desc) {
        this.code = code;
        this.min = min;
        this.max = max;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ProductAmountLimitEnum{" +
                "code='" + code + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static ProductAmountLimitEnum getEnumByCode(String code){
        for (ProductAmountLimitEnum enums:ProductAmountLimitEnum.values() ) {
            if(enums.getCode().equals(code)){
                return enums;
            }

        }
        return null;
    }
}
