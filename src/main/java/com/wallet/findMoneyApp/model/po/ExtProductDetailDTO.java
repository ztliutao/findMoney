package com.wallet.findMoneyApp.model.po;

import java.io.Serializable;

public class ExtProductDetailDTO implements Serializable {
    private static final long serialVersionUID = 6785133098403589832L;
    private Integer pid;
    private String pname;
    private String amount;
    private String unit;
    private String minAmount;
    private String maxAmount;
    private String minLimit;
    private String maxLimit;
    private String rAmount;
    private String rType;
    private String Rate;
    private String fastTime;
    private String fastUnit;
    private String io;
    private String applyRemark;
    private String productRemark;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    public String getrAmount() {
        return rAmount;
    }

    public void setrAmount(String rAmount) {
        this.rAmount = rAmount;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public String getFastTime() {
        return fastTime;
    }

    public void setFastTime(String fastTime) {
        this.fastTime = fastTime;
    }

    public String getFastUnit() {
        return fastUnit;
    }

    public void setFastUnit(String fastUnit) {
        this.fastUnit = fastUnit;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    public String getApplyRemark() {
        return applyRemark;
    }

    public void setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }
}
