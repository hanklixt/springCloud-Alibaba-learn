package cloud.alibab.sentinel.feign.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lxt
 * @date 2020-01-10-15:37
 */
@Component
public class FeignClientImpl implements FeignClientDemo {
    @Override
    @GetMapping("/feign/hello")
    public String hello() {
        return "feign fallback";
    }
}
