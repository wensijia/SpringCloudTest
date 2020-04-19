package com.test.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.alibabacloud
 * @ClassName: NacosConfig
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 16:41
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 16:41
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain.class,args);
    }
}
