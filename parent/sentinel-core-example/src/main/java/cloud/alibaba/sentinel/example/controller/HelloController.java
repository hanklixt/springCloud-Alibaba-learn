package cloud.alibaba.sentinel.example.controller;

import cloud.alibaba.sentinel.example.config.ExceptionUtil;
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
    @SentinelResource(value = "resource", blockHandler = "exHandler", blockHandlerClass = {ExceptionUtil.class})
    public String resource() {
        return "hello resource";
    }


}
