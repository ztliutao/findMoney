package com.wallet.findMoneyApp.model.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class BaseResult {
    @ApiModelProperty(value = "hander")
    protected HanderInfo hander;
    @ApiModelProperty(value = "body")
    protected BaseResultBody body;

    public BaseResult() {
        hander = new HanderInfo();
        body = new BaseResultBody();
    }

    public BaseResult(HanderInfo hander, BaseResultBody body) {
        this.hander = hander;
        this.body = body;
    }

    public HanderInfo getHander() {
        return hander;
    }

    public void setHander(HanderInfo hander) {
        this.hander = hander;
    }

    public BaseResultBody getBody() {
        return body;
    }

    public void setBody(BaseResultBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "hander=" + hander +
                ", body=" + body +
                '}';
    }
}
