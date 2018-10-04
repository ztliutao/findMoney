package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SaveApplyBody extends BaseBody<SaveApplyBody> {
    public SaveApplyBody() {
    }

    public SaveApplyBody(String userID, String productId, String type) {
        this.userID = userID;
        this.productId = productId;
        this.type = type;
    }

    @ApiModelProperty(value = "用户ID", name = "userID", required = true)
    private String userID;
    @ApiModelProperty(value = "产品ID", name = "productId", required = true)
    private String productId;
    @ApiModelProperty(value = "1-信用卡 2-贷款产品", name = "type", required = true)
    private String type;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SaveApplyBody{" +
                "userID='" + userID + '\'' +
                ", productId='" + productId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
