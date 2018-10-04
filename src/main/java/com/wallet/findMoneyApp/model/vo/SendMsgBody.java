package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SendMsgBody extends BaseBody<SendMsgBody> {
    @ApiModelProperty(value = "tel",name ="手机号码" )
    private String tel;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "SendMsgBody{" +
                "tel='" + tel + '\'' +
                ", data=" + data +
                '}';
    }
}
