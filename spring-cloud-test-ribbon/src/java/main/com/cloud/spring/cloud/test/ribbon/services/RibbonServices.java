package com.cloud.spring.cloud.test.ribbon.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:RibbonServices
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 14:51
 * @Version 1.0
 */
@Service
public class RibbonServices {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://SPRING-CLOUD-TEST-SERVICE-ADMIN/hi?message=" + message, String.class);
    }

    public String hiError(String message){
        return "Hi,your message id :\"" + message + "\" but request error.";
    }
}
