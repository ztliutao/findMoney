package com.wallet.findMoneyApp.model.po;

import java.io.Serializable;
import java.util.Date;

public class CreditCard implements Serializable {
    private Long id;

    private String creditCardName;

    private String slogan;

    private String creditCardImage;

    private String applyPageUrl;

    private String status;

    private Integer cOrder;

    private String applySucCount;

    private Date createTime;

    private Date updateTime;

    private String operatorId;

    private String operatorName;

    private String customerServiceTel;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCreditCardImage() {
        return creditCardImage;
    }

    public void setCreditCardImage(String creditCardImage) {
        this.creditCardImage = creditCardImage;
    }

    public String getApplyPageUrl() {
        return applyPageUrl;
    }

    public void setApplyPageUrl(String applyPageUrl) {
        this.applyPageUrl = applyPageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getcOrder() {
        return cOrder;
    }

    public void setcOrder(Integer cOrder) {
        this.cOrder = cOrder;
    }

    public String getApplySucCount() {
        return applySucCount;
    }

    public void setApplySucCount(String applySucCount) {
        this.applySucCount = applySucCount;
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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getCustomerServiceTel() {
        return customerServiceTel;
    }

    public void setCustomerServiceTel(String customerServiceTel) {
        this.customerServiceTel = customerServiceTel;
    }
}