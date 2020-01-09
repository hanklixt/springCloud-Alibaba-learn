package cloud.alibaba.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lxt
 * @date 2020-01-08-14:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApp.class, args);
    }

}
