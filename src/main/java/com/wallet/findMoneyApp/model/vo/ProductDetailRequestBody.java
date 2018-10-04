package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import io.swagger.annotations.ApiModel;

@ApiModel
public class ProductDetailRequestBody extends BaseBody<ProductDetailRequestBody> {
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
