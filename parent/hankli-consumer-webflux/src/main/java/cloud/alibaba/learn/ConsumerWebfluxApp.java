package cloud.alibaba.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author lxt
 * @date 2020-01-08-14:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerWebfluxApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerWebfluxApp.class, args);
    }

    /**
     * 自己试了一下，不加@LoadBalanced是要报错的
     *
     * @return
     */
    @LoadBalanced
    @Bean(name = "webClient")
    public WebClient.Builder builder() {
        return WebClient.builder();
    }
}
