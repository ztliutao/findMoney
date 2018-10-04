package com.wallet.findMoneyApp.model.po;

import java.io.Serializable;
import java.util.Date;

public class ApplyRecord implements Serializable {
    private Long id;

    private Integer userId;

    private String mobileNo;

    private Integer applyProductId;

    private String applyProductName;

    private String applyAmount;

    private String creditAmount;

    private String rate;

    private String term;

    private String termUnit;

    private String applyProductType;

    private String source;

    private String longitude;

    private String latitude;

    private String clientIp;

    private String imei;

    private String applyRequestUrl;

    private String status;

    private String os;

    private String osVersion;

    private String appVersion;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getApplyProductId() {
        return applyProductId;
    }

    public void setApplyProductId(Integer applyProductId) {
        this.applyProductId = applyProductId;
    }

    public String getApplyProductName() {
        return applyProductName;
    }

    public void setApplyProductName(String applyProductName) {
        this.applyProductName = applyProductName;
    }

    public String getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTermUnit() {
        return termUnit;
    }

    public void setTermUnit(String termUnit) {
        this.termUnit = termUnit;
    }

    public String getApplyProductType() {
        return applyProductType;
    }

    public void setApplyProductType(String applyProductType) {
        this.applyProductType = applyProductType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getApplyRequestUrl() {
        return applyRequestUrl;
    }

    public void setApplyRequestUrl(String applyRequestUrl) {
        this.applyRequestUrl = applyRequestUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}