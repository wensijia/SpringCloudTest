package com.test.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.cloudalibaba.controller
 * @ClassName: ConfigClentMain
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 16:43
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 16:43
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class ConfigClentController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
