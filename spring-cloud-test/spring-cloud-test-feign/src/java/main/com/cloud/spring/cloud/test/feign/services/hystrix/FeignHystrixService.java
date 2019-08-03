package com.cloud.spring.cloud.test.feign.services.hystrix;

import com.cloud.spring.cloud.test.feign.services.FeignServices;
import org.springframework.stereotype.Component;

/**
 * @ClassName:FeignHystrixService
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 16:04
 * @Version 1.0
 */
@Component
public class FeignHystrixService implements FeignServices {

    @Override
    public String sayHi(String message){
        return "Hi,your message is :\"" + message +"\" but request error.";
    }
}
