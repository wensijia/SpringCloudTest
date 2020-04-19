package com.test.alibabacloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.alibabacloud.config
 * @ClassName: ApplicationContext
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 16:17
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 16:17
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
