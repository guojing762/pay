package com.lemon;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: guojing
 * @Date: 2020/5/31 11:40
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliPay")
public class AliConfigs {
    private String appid;
    private String open_api_domain;
    private String mcloud_api_domain;
    private String pid;
    private String private_key;
    private String public_key;
    private String alipay_public_key;
    private String max_query_retry;
    private String query_duration;
    private String max_cancel_retry;
    private String cancel_duration;
    private String heartbeat_delay;
    private String heartbeat_duration;
}
