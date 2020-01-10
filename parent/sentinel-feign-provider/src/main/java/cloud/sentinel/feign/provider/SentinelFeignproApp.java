package cloud.sentinel.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lxt
 * @date 2020-01-10-15:52
 */
@SpringCloudApplication
public class SentinelFeignproApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignproApp.class, args);
    }
}
