package com.cloud.spring.cloud.test.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName:FeignApplication
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 15:36
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrixDashboard
public class FeignApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignApplication.class,args);
    }
}
