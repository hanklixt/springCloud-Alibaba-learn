package cloud.alibaba.learn.nacosclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxt
 * @date 2020-01-08-14:34
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/hello")
    public String hello(String name) {
//        final ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-producer");
//        final URI uri = serviceInstance.getUri();
        //注入restTemplate 时使用@LoadBalanced，可以直接使用负载均衡
        return restTemplate.getForObject("http://nacos-discovery-producer" + "/hello?name=" + name, String.class);

//        return restTemplate.getForObject(uri + "/hello?name=" + name, String.class);
    }


}
