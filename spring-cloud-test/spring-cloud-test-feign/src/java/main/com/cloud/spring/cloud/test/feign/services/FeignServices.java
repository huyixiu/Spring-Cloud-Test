package com.cloud.spring.cloud.test.feign.services;

import com.cloud.spring.cloud.test.feign.services.hystrix.FeignHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName:FeignServices
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 15:40
 * @Version 1.0
 */
@FeignClient(value = "spring-cloud-test-service-admin",fallback = FeignHystrixService.class)
public interface FeignServices {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
