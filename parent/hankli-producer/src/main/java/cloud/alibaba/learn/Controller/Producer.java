package cloud.alibaba.learn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-08-14:36
 */
@RestController
public class Producer {

    @GetMapping("/hello")
    public String helloController(String name) {
        return "hello!" + name;
    }

}
