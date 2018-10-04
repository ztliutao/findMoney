package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.HanderInfo;

/**
 * 下喇叭
 */
public class HornModel extends HanderInfo {
    private String tel;
    private String channel;
    private String amount;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "HornModel{" +
                "tel='" + tel + '\'' +
                ", channel='" + channel + '\'' +
                ", amount='" + amount + '\'' +
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
