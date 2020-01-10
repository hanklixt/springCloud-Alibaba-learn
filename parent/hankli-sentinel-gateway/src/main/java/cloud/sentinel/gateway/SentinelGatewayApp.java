package cloud.sentinel.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author lxt
 * @date 2020-01-10-17:07
 */
@SpringCloudApplication
public class SentinelGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(SentinelGatewayApp.class, args);
    }
}
