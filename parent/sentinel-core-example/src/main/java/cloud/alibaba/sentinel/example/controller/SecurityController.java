package cloud.alibaba.sentinel.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-10-10:52
 */
@RestController
public class SecurityController {

    @GetMapping("/white")
    public String white() {
        return "white";
    }

    @GetMapping("/black")
    public String black() {
        return "black";
    }
}
