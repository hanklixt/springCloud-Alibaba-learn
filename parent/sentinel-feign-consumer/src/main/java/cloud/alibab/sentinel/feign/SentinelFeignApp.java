package cloud.alibab.sentinel.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lxt
 * @date 2020-01-10-15:30
 */
@EnableFeignClients
@SpringCloudApplication
public class SentinelFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignApp.class, args);
    }
}
