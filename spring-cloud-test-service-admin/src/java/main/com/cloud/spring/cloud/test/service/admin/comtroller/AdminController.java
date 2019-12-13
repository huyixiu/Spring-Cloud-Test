package com.cloud.spring.cloud.test.service.admin.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:AdminController
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 11:13
 * @Version 1.0
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message){
        return String.format("Hi,your message is : %s i am from port : %s",message,port);
    }
}
