package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class CardProductListBody extends BaseBody<CardProductListBody> {

    @ApiModelProperty(value = "页大小", name = "pageSize", required = true)
    private String pageSize;
    @ApiModelProperty(value = "当前页", name = "currentPage", required = true)
    private String currentPage;


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

    @Override
    public String toString() {
        return "CardProductListBody{" +
                "pageSize='" + pageSize + '\'' +
                ", currentPage='" + currentPage + '\'' +
                ", data=" + data +
                '}';
    }
}
