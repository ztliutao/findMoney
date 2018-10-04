package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserBody extends BaseBody<UserBody> {
    @ApiModelProperty(value = "手机号", name = "tel", example = "13543245551", required = true)
    private String tel;
    @ApiModelProperty(value = "短信验证码", name = "telMsg", example = "123456", required = true)
    private String telMsg;
    @ApiModelProperty(value = "密码", name = "pwd", required = true)
    private String pwd;
    @ApiModelProperty(value = "密码", name = "pwd1", required = true)
    private String pwd1;


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelMsg() {
        return telMsg;
    }

    public void setTelMsg(String telMsg) {
        this.telMsg = telMsg;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd1() {
        return pwd1;
    }

    public void setPwd1(String pwd1) {
        this.pwd1 = pwd1;
    }
}



