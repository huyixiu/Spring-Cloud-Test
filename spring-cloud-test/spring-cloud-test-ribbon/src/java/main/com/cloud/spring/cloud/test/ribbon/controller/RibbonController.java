package com.cloud.spring.cloud.test.ribbon.controller;

import com.cloud.spring.cloud.test.ribbon.services.RibbonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:RibbonController
 * @Description
 * @Author:huyix
 * @Date:2019-06-25 14:55
 * @Version 1.0
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonServices ribbonServices;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String  message){
        return ribbonServices.sayHi(message);
    }
}
