package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UserInfoAddBody extends BaseBody<UserInfoAddBody> {
    private String userId;//根据userId查询是否做过信息录入
    @ApiModelProperty(value = "手机", name = "tel")
    private String tel;
    @ApiModelProperty(value = "真实姓名", name = "realName")
    private String realName;
    @ApiModelProperty(value = "证件号码", name = "idNo")
    private String idNo;
    @ApiModelProperty(value = "城市", name = "city")
    private String city;
    @ApiModelProperty(value = "职业", name = "occupation")
    private String occupation;
    @ApiModelProperty(value = "借款金额", name = "amount")
    private String amount;
    @ApiModelProperty(value = "借款期限", name = "limit")
    private String limit;
    @ApiModelProperty(value = "信用卡", name = "creditCard")
    private String creditCard;
    @ApiModelProperty(value = "商业保险", name = "syx")
    private String syx;
    @ApiModelProperty(value = "社保公积金", name = "sbgjj")
    private String sbgjj;
    @ApiModelProperty(value = "产品ID", name = "pid")
    private String fccc;
    @ApiModelProperty(value = "产品ID", name = "pid")
    private String isborrowAmountWLD;
    @ApiModelProperty(value = "工作时间/工资发放", name = "workInfo")
    private String workInfo;
    @ApiModelProperty(value = "月收入", name = "income")
    private String income;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getSyx() {
        return syx;
    }

    public void setSyx(String syx) {
        this.syx = syx;
    }

    public String getSbgjj() {
        return sbgjj;
    }

    public void setSbgjj(String sbgjj) {
        this.sbgjj = sbgjj;
    }

    public String getFccc() {
        return fccc;
    }

    public void setFccc(String fccc) {
        this.fccc = fccc;
    }

    public String getIsborrowAmountWLD() {
        return isborrowAmountWLD;
    }

    public void setIsborrowAmountWLD(String isborrowAmountWLD) {
        this.isborrowAmountWLD = isborrowAmountWLD;
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserAddBody{" +
                "userId='" + userId + '\'' +
                ", tel='" + tel + '\'' +
                ", realName='" + realName + '\'' +
                ", idNo='" + idNo + '\'' +
                ", city='" + city + '\'' +
                ", occupation='" + occupation + '\'' +
                ", amount='" + amount + '\'' +
                ", limit='" + limit + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", syx='" + syx + '\'' +
                ", sbgjj='" + sbgjj + '\'' +
                ", fccc='" + fccc + '\'' +
                ", isborrowAmountWLD='" + isborrowAmountWLD + '\'' +
                ", workInfo='" + workInfo + '\'' +
                ", income='" + income + '\'' +
                '}';
    }
}


