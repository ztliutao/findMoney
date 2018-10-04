package com.wallet.findMoneyApp.controller;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.base.BaseRequest;
import com.wallet.findMoneyApp.model.base.BaseResult;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "欢迎来得到钱包";
    }
}
