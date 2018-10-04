package com.wallet.findMoneyApp.model.result;

import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.base.HanderInfo;

public class UserReuslt extends BaseResult {
    public UserReuslt() {
    }

    public UserReuslt(String code, String msg) {
        this.getBody().setCode(code);
        this.getBody().setMsg(msg);
    }

}
