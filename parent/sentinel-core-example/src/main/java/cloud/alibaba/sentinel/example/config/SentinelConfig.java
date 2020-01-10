package cloud.alibaba.sentinel.example.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author lxt
 * @date 2020-01-10-10:07
 */
@Configuration
public class SentinelConfig {
    @PostConstruct
    public void init() {
        //设置url接口熔断报文
        WebCallbackManager.setUrlBlockHandler(new MyBlockHandler());
        //设置黑白名单，提供应用方名称获取方式，这里使用的是简单获取ip方式
        WebCallbackManager.setRequestOriginParser(new IpRequestOriginParser());
    }

}
