package com.wallet.findMoneyApp.model.result;

import com.wallet.findMoneyApp.model.base.BaseResult;
import io.swagger.annotations.ApiModel;

@ApiModel
public class LoginResult extends BaseResult {
    public LoginResult() {
    }
    public LoginResult(String code,String desc) {
        super();
        this.getBody().setCode(code);

    }

}
