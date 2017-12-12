package com.ty.client.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BizController {

    @Value("${server.port}")
    String port;
	
    @RequestMapping("/hi")
    public String home() {
        return "hi,i am from port:" +port;
    }
    
}
