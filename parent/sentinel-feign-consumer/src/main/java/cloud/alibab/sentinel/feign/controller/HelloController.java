package cloud.alibab.sentinel.feign.controller;

import cloud.alibab.sentinel.feign.config.FeignClientDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-10-15:39
 */
@RestController
public class HelloController {

    @Autowired
    FeignClientDemo feignClientDemo;

    @GetMapping("/hello")
    public String hello() {
        return feignClientDemo.hello();
    }

}
