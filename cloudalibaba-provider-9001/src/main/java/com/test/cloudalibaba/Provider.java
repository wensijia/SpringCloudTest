package com.test.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.cloudalibaba
 * @ClassName: Provider
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 15:32
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 15:32
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class,args);
    }
}
