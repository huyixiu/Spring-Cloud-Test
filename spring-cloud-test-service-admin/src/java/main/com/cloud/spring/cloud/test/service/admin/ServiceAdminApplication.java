package com.cloud.spring.cloud.test.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:ServiceAdminApplication
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 10:35
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {
    public static void main(String[] args){
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
