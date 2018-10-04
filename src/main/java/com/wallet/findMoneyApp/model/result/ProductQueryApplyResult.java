package com.wallet.findMoneyApp.model.result;

import com.wallet.findMoneyApp.model.base.BaseResult;

public class ProductQueryApplyResult extends BaseResult {

    private String userId;
    private String currentPage;
    private String pageSize;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public ProductQueryApplyResult() {
    }

    public ProductQueryApplyResult(String code, String msg) {
        this.getBody().setCode(code);
        this.getBody().setMsg(msg);
    }


}
