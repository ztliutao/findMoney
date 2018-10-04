package com.wallet.findMoneyApp.model.po;

import java.io.Serializable;
import java.util.Date;

public class AdvertConfig implements Serializable {
    private Long id;

    private String imgeUrl;

    private String actionUrl;

    private String top;

    private String openScreen;

    private String excellent;

    private String status;

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

    public String getImgeUrl() {
        return imgeUrl;
    }

    public void setImgeUrl(String imgeUrl) {
        this.imgeUrl = imgeUrl;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getOpenScreen() {
        return openScreen;
    }

    public void setOpenScreen(String openScreen) {
        this.openScreen = openScreen;
    }

    public String getExcellent() {
        return excellent;
    }

    public void setExcellent(String excellent) {
        this.excellent = excellent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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