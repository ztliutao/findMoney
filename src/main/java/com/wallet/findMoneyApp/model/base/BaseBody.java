package com.wallet.findMoneyApp.model.base;


public class BaseBody<T> {
    public BaseBody() {
    }

    protected T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseBody{" +
                "data=" + data +
                '}';
    }
}
