package com.wallet.findMoneyApp.model.vo;

public class HotLoanDataModel {
    private String pid;
    private String pname;
    private String imgUrl;
    private String rate;
    private String rataType;
    private String remark;
    private String min;
    private String max;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRataType() {
        return rataType;
    }

    public void setRataType(String rataType) {
        this.rataType = rataType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "HotLoanDataModel{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", rate='" + rate + '\'' +
                ", rataType='" + rataType + '\'' +
                ", remark='" + remark + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                '}';
    }
}
