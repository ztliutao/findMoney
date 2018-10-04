package com.wallet.findMoneyApp.model.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回说明")
public class BaseResultBody {
    public BaseResultBody() {
    }

    @ApiModelProperty(value = "返回数据")
    protected Object data;
    @ApiModelProperty(value = "1-失败 0-成功")
    protected String code;
    @ApiModelProperty(value = "返回信息描述")
    protected String msg;
    @ApiModelProperty(value = "页大小")
    protected String pageSize;
    @ApiModelProperty(value = "当前页")
    protected String currentPage;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }
}
