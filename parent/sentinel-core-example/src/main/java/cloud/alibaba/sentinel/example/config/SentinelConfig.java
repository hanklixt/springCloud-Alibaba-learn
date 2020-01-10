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
        WebCallbackManager.setUrlBlockHandler(new MyBlockHandler());
        WebCallbackManager.setRequestOriginParser(new IpRequestOriginParser());
    }

}
