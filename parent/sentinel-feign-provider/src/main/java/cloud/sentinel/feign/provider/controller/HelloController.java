package cloud.sentinel.feign.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-10-16:02
 */
@RestController
public class HelloController {


    @GetMapping("/feign/hello")
    public String hello() {
        return "hello provider";
    }
}
