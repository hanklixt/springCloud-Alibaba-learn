package cloud.alibab.sentinel.feign.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lxt
 * @date 2020-01-10-15:32
 */
@FeignClient(value = "sentinel-feign-provider", fallback = FeignClientImpl.class)
public interface FeignClientDemo {

    @GetMapping("/feign/hello")
    public String hello();
}
