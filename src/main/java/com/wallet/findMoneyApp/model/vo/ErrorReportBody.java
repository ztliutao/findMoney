package com.wallet.findMoneyApp.model.vo;

import com.wallet.findMoneyApp.model.base.BaseBody;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import io.swagger.annotations.ApiModel;

@ApiModel
public class ErrorReportBody extends BaseBody<ErrorReportBody> {
    private String pkg;
    private String sign;
    private String did;
    private String osvc;
    private String osvn;
    private String version;
    private String model;
    private String brand;
    private String errors;

    public ErrorReportBody() {
    }

    public ErrorReportBody(String pkg, String sign, String did, String osvc, String osvn, String version, String model, String brand, String errors) {
        this.pkg = pkg;
        this.sign = sign;
        this.did = did;
        this.osvc = osvc;
        this.osvn = osvn;
        this.version = version;
        this.model = model;
        this.brand = brand;
        this.errors = errors;
    }

    public String getPkg() {
        return pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getOsvc() {
        return osvc;
    }

    public void setOsvc(String osvc) {
        this.osvc = osvc;
    }

    public String getOsvn() {
        return osvn;
    }

    public void setOsvn(String osvn) {
        this.osvn = osvn;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ErrorReportBody{" +
                "pkg='" + pkg + '\'' +
                ", sign='" + sign + '\'' +
                ", did='" + did + '\'' +
                ", osvc='" + osvc + '\'' +
                ", osvn='" + osvn + '\'' +
                ", version='" + version + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", errors='" + errors + '\'' +
                '}';
    }
}
