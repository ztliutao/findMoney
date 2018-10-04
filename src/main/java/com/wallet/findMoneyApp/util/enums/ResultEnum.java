package com.wallet.findMoneyApp.util.enums;

public enum ResultEnum {
    _0("0","成功"),_1("1","失败")
    ;
    private String code;
    private String msg;

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

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
