package com.wallet.findMoneyApp.model.base;

public class BaseRequest<T> {
    public BaseRequest() {
    }

    protected HanderInfo hander;

    protected T body;

    public HanderInfo getHander() {
        return hander;
    }

    public void setHander(HanderInfo hander) {
        this.hander = hander;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "hander=" + hander +
                ", body=" + body +
                '}';
    }
}
