package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel
public class LoginBody extends BaseBody<LoginBody> {
    @ApiModelProperty(value = "手机号", name = "tel", example = "13543245551", required = true)
    private String tel;
    @ApiModelProperty(value = "密码", name = "pwd", required = true)
    private String pwd;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "LoginBody{" +
                "tel='" + tel + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }


}
