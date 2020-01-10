package cloud.alibaba.sentinel.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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

    @GetMapping("/param")
    @SentinelResource(value = "param", blockHandler = "exHandler")
    public String param(String type) {
        return "hello param";
    }

    public String exHandler(String type, BlockException ex) {
        return "热点参数限流";
    }

}
