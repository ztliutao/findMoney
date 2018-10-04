package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ProductQueryBody extends BaseBody<ProductQueryBody> {


    @ApiModelProperty(value = "用户Id", name = "userId", required = true)
    private String userId;
    @ApiModelProperty(value = "申请类型", name = "applyType", required = true)
    private String applyType;
    @ApiModelProperty(value = "页大小", name = "pageSize", example = "13543245551", required = true)
    private String pageSize;
    @ApiModelProperty(value = "当前页", name = "currentPage", example = "13543245551", required = true)
    private String currentPage;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
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

    public ProductQueryBody() {
    }

    @Override
    public String toString() {
        return "QueryModelBody{" +
                "userId='" + userId + '\'' +
                ", applyType='" + applyType + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", currentPage='" + currentPage + '\'' +
                '}';
    }


}
