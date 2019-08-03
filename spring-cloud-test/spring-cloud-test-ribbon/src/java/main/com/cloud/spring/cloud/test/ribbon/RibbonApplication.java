package com.cloud.spring.cloud.test.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName:RibbonApplication
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 14:36
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class RibbonApplication {
    public static void main(String[] args){
        SpringApplication.run(RibbonApplication.class,args);
    }
}
