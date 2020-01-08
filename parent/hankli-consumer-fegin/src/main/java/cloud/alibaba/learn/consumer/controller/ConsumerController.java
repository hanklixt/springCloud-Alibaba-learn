package cloud.alibaba.learn.consumer.controller;

import cloud.alibaba.learn.consumer.client.FeginClientDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-08-14:34
 */
@RestController
public class ConsumerController {


    @Autowired
    private FeginClientDemo feignClient;

    @GetMapping("/hello")
    public String hello(String name) {
        return feignClient.helloController(name);
    }


}
