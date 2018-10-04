package com.wallet.findMoneyApp.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ApplyInfoPO {
    private String id;
    @ApiModelProperty(value="产品ID",name="pid")
    private String pid;
    @ApiModelProperty(value="产品名称",name="pname")
    private String pname;
    @ApiModelProperty(value="素材地址",name="imgUrl")
    private String imgUrl;
    @ApiModelProperty(value="申请时间",name="applyTime")
    private String applyTime;
    @ApiModelProperty(value="手机号",name="customServiceTel")
    private String customServiceTel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getCustomServiceTel() {
        return customServiceTel;
    }

    public void setCustomServiceTel(String customServiceTel) {
        this.customServiceTel = customServiceTel;
    }

    @Override
    public String toString() {
        return "ApplyInfoModel{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", customServiceTel='" + customServiceTel + '\'' +
                '}';
    }
}
