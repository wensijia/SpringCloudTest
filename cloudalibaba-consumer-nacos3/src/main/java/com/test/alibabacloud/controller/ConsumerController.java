package com.test.alibabacloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.alibabacloud.config
 * @ClassName: ConsumerController
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 16:19
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 16:19
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@RestController
public class ConsumerController {

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Value("${service-url.nacos-config-service}")
    private String configURL;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject(serverURL+"/provider/nacos/",String.class);
    }

    @GetMapping("/consumer/nacosConfig/{id}")
    public String paymentConfigInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject(configURL+"/config/info",String.class);
    }
}
