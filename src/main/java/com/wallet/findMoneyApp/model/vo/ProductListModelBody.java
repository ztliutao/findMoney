package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ProductListModelBody extends BaseBody<ProductListModelBody> {
    public ProductListModelBody() {
    }

    public ProductListModelBody(String amountLimit, String productType, String orderByType, String pageSize, String currentPage) {
        this.amountLimit = amountLimit;
        this.productType = productType;
        this.orderByType = orderByType;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    @ApiModelProperty(value = "贷款金额", name = "amountLimit", required = true)
    private String amountLimit;
    @ApiModelProperty(value = "产品类型", name = "productType", required = true)
    private String productType;
    @ApiModelProperty(value = "排序方式", name = "orderByType", required = true)
    private String orderByType;
    @ApiModelProperty(value = "页大小", name = "pageSize", required = true)
    private String pageSize;
    @ApiModelProperty(value = "当前页", name = "currentPage", required = true)
    private String currentPage;

    public String getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(String amountLimit) {
        this.amountLimit = amountLimit;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(String orderByType) {
        this.orderByType = orderByType;
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

    @Override
    public String toString() {
        return "ProductListModelBody{" +
                "amountLimit='" + amountLimit + '\'' +
                ", productType='" + productType + '\'' +
                ", orderByType='" + orderByType + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", currentPage='" + currentPage + '\'' +
                '}';
    }
}
