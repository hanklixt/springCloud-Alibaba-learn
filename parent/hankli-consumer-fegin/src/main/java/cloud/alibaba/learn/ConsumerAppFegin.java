package cloud.alibaba.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lxt
 * @date 2020-01-08-14:10
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerAppFegin {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerAppFegin.class, args);
    }


}
