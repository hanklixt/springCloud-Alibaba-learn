package cloud.alibaba.learn.nacosclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @date 2020-01-08-14:34
 */
@RefreshScope      //刷新配置项
@RestController
public class TestController {

    @Value("${test:空test}")
    private String str;


    @GetMapping("/test/config")
    public String hello() {

        return str;
    }


}
