package com.cloud.spring.cloud.test.feign.controller;

import com.cloud.spring.cloud.test.feign.services.FeignServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:FeignController
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 15:44
 * @Version 1.0
 */
@RestController
public class FeignController {

    @Resource
    private FeignServices feignServices;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String message){
        return feignServices.sayHi(message);
    }
}
