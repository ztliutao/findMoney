package com.wallet.findMoneyApp.service;


import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.request.SendMsgRequest;
import com.wallet.findMoneyApp.util.MsgUril;
import com.wallet.findMoneyApp.util.StringUtil;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TelMsgService {
    private static final Logger logger = LoggerFactory.getLogger(TelMsgService.class);
    private static final String COUNT = "Count";
    private static final String TELMSG = "telMsg";
    @Value("${redis.telmsg.count.unit}")
    private String unit;
    @Autowired
    private StringRedisTemplate temp;

    public String getTelMsg(String tel) {

        return temp.opsForValue().get(tel);
    }

    /**
     * 检查缓存数量是否大于阈值
     * 发送短信验证码
     * 生成随机数
     * 放入缓存
     *
     * @param request
     * @return
     */
    public BaseResult sendMsg(SendMsgRequest request) {
        logger.info("sendMsg request:{}", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        try {
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            String msg = "";
            String tel = request.getBody().getTel();
            String telMsg = temp.opsForValue().get(tel + TELMSG);
            String sendCount = "0";
            temp.opsForValue().set(tel + COUNT, sendCount, Long.valueOf(unit), TimeUnit.DAYS);
            //有效验证码信息存在
            if (StringUtils.isNotBlank(telMsg)) {
                logger.info("sendMsg telMsg is exists telMsg:{}", telMsg);
                result.getBody().setData(telMsg);
                return result;
            }
            String count = temp.opsForValue().get(tel + COUNT);
            logger.info("sendMsg count:{}", count);
            int icount = Integer.parseInt(count);
            if (icount <= 6) {
                msg = MsgUril.createMsg();
                sendMsg(tel, msg);
                icount++;
                temp.opsForValue().set(tel + COUNT, String.valueOf(icount), Long.valueOf(unit), TimeUnit.DAYS);
                temp.opsForValue().set(tel + TELMSG, msg);
                result.getBody().setData(msg);
                return result;
            }
            logger.info("sendMsg count is more big");
            result.getBody().setData("");
            return result;


        } catch (Exception e) {
            logger.info("sendMsg error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setCode(ResultEnum._1.getMsg() + ",发送短信验证码异常");
            return result;
        }


    }

    private void sendMsg(String tel, String context) {
        //TODO:发送短信验证码
    }

}
