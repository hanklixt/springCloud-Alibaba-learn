package cloud.alibaba.learn.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lxt
 * @date 2020-01-08-15:31
 */
@FeignClient(name = "nacos-discovery-producer")
public interface FeginClientDemo {

    @GetMapping("/hello")
    public String helloController(@RequestParam("name") String name);


}
