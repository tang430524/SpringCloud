package com.ty.client.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.client.service.CallClientService;


@RestController
public class BizController {

	@Autowired
	CallClientService callClientService;
	
    @RequestMapping("/call")
    public String home() {
        return callClientService.getClientString();
    }
}


