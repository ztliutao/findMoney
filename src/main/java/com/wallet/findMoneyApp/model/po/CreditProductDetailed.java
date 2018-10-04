package com.wallet.findMoneyApp.model.po;

import java.io.Serializable;
import java.util.Date;

public class CreditProductDetailed implements Serializable {
    private Long id;

    private Integer creditProductId;

    private String term;

    private String termUnit;

    private String applyFlow;

    private String minCreditTime;

    private String applyAptitude;

    private String productDesc;

    private String applyRequestUrl;

    private Date createTime;

    private Date updateTime;

    private String operatorId;

    private String operatorName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreditProductId() {
        return creditProductId;
    }

    public void setCreditProductId(Integer creditProductId) {
        this.creditProductId = creditProductId;
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

    public String getApplyFlow() {
        return applyFlow;
    }

    public void setApplyFlow(String applyFlow) {
        this.applyFlow = applyFlow;
    }

    public String getMinCreditTime() {
        return minCreditTime;
    }

    public void setMinCreditTime(String minCreditTime) {
        this.minCreditTime = minCreditTime;
    }

    public String getApplyAptitude() {
        return applyAptitude;
    }

    public void setApplyAptitude(String applyAptitude) {
        this.applyAptitude = applyAptitude;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getApplyRequestUrl() {
        return applyRequestUrl;
    }

    public void setApplyRequestUrl(String applyRequestUrl) {
        this.applyRequestUrl = applyRequestUrl;
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
}