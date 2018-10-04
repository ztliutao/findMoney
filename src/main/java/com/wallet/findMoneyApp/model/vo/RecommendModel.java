package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.HanderInfo;

public class RecommendModel extends HanderInfo {
    private String pid;
    private String pname;
    private String min;
    private String max;
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return "RecommendModel{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                ", remark='" + remark + '\'' +
                ", c='" + c + '\'' +
                ", ch='" + ch + '\'' +
                ", v='" + v + '\'' +
                ", osv='" + osv + '\'' +
                ", imei='" + imei + '\'' +
                ", imsi='" + imsi + '\'' +
                ", pm='" + pm + '\'' +
                ", pf='" + pf + '\'' +
                ", t='" + t + '\'' +
                ", pi='" + pi + '\'' +
                ", ui='" + ui + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", format='" + format + '\'' +
                ", deviceIp='" + deviceIp + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
