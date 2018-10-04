package com.wallet.findMoneyApp.model.vo;

public class HotCardDataModel {
    private String id;
    private String url;
    private String imgPath;
    private String name;
    private String num;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "HotCardDataModel{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
