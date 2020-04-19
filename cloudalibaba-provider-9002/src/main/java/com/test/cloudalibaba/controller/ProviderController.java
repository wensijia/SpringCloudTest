package com.test.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.cloudalibaba.controller
 * @ClassName: ProviderController
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 15:34
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 15:34
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry,serverPort: "+ serverPort+"\t id:-"+id;
    }
}
