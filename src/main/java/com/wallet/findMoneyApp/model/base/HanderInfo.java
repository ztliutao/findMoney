package com.wallet.findMoneyApp.model.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 头部信息
 */
@ApiModel
public class HanderInfo {
    public HanderInfo() {
    }

    @ApiModelProperty(value = "c", name = "c")
    public String c;
    @ApiModelProperty(value = "ch", name = "ch")
    public String ch;
    @ApiModelProperty(value = "v", name = "v")
    public String v;
    @ApiModelProperty(value = "osv", name = "osv")
    public String osv;
    @ApiModelProperty(value = "imei", name = "imei")
    public String imei;
    @ApiModelProperty(value = "imsi", name = "imsi")
    public String imsi;
    @ApiModelProperty(value = "pm", name = "pm")
    public String pm;
    @ApiModelProperty(value = "pf", name = "pf")
    public String pf;
    @ApiModelProperty(value = "t", name = "t")
    public String t;
    @ApiModelProperty(value = "c", name = "c")
    public String pi;
    @ApiModelProperty(value = "ui", name = "ui")
    public String ui;
    @ApiModelProperty(value = "lat", name = "lat")
    public String lat;
    @ApiModelProperty(value = "lng", name = "lng")
    public String lng;
    @ApiModelProperty(value = "格式", name = "format")
    public String format;
    @ApiModelProperty(value = "访问Id", name = "deviceIp")
    public String deviceIp;
    @ApiModelProperty(value = "签名信息", name = "sign")
    public String sign;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getOsv() {
        return osv;
    }

    public void setOsv(String osv) {
        this.osv = osv;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getUi() {
        return ui;
    }

    public void setUi(String ui) {
        this.ui = ui;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "HanderInfo{" +
                "c='" + c + '\'' +
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
