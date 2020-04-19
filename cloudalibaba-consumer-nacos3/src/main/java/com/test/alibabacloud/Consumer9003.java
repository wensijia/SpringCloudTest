package com.test.alibabacloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: CloudTest
 * @Package: com.test.alibabacloud
 * @ClassName: consumer9003
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/19 16:15
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/19 16:15
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consumer9003 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9003.class,args);
    }
}
