package com.zeroleung.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {
	private static Logger log=LoggerFactory.getLogger(HelloController.class);


	
	
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        log.info("测试 log配置");
        return "hello world";
    }
   
	
}
