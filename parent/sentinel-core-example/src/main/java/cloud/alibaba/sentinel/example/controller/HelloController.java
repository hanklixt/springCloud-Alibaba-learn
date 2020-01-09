package cloud.alibaba.sentinel.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-09-17:05
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }


    @GetMapping("/resource")
    @SentinelResource(value = "hello2", blockHandler = "exHandler")
    public String resource() {
        return "hello resource";
    }

    public String exHandler() {
        return "hello exHandler";
    }

}
