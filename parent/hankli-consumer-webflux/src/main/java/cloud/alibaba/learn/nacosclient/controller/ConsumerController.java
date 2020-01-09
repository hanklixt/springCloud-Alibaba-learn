package cloud.alibaba.learn.nacosclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author lxt
 * @date 2020-01-08-14:34
 */
@RestController
public class ConsumerController {

    @Resource(name = "webClient")
    private WebClient.Builder webClient;

    @GetMapping("/hello")
    public Mono<String> hello(String name) {
        return webClient.build().get()
                .uri("http://nacos-discovery-producer" + "/hello?name=" + name)
                .retrieve()
                .bodyToMono(String.class);

    }


}
