package com.wallet.findMoneyApp.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 日志MDC
 */
@Component
public class LogInterceptor implements HandlerInterceptor {
    private static final String REQUEST_ID="traceNo";
    private static final Logger LOGGER = LoggerFactory.getLogger(LogInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        int requestId = (int)((Math.random()*9+1)*100000);
        MDC.put(REQUEST_ID, String.valueOf(requestId));
        return true;
    }

//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        String uuid = MDC.get(REQUEST_ID);
//        LOGGER.info("remove requestId ({}) from logger", uuid);
//        MDC.remove(REQUEST_ID);
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//
//    }


}
