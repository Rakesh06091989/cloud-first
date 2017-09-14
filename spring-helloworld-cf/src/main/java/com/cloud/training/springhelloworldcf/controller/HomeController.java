package com.cloud.training.springhelloworldcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.training.springhelloworldcf.model.GlobalProperties;



@RestController
public class HomeController {
	
	private GlobalProperties global;
	
    @Autowired
    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }
    
	@RequestMapping("/")
	public String home() {
		return "Das Boot, reporting for duty!"+ global.toString();
	}

}
