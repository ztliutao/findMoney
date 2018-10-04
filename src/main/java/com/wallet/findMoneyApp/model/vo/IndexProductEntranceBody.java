package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class IndexProductEntranceBody extends BaseBody<IndexProductEntranceBody> {
    @ApiModelProperty(value = "页大小", name = "pageSize", required = true)
    private String pageSize;
    @ApiModelProperty(value = "当前页", name = "currentPage", required = true)
    private String currentPage;
    @ApiModelProperty(value = "入口类型", name = "entryType", required = true)
    private String entryType;


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

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    @Override
    public String toString() {
        return "EntranceModelBody{" +
                "pageSize='" + pageSize + '\'' +
                ", currentPage='" + currentPage + '\'' +
                ", entryType='" + entryType + '\'' +
                '}';
    }


}
