package com.princy.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@PostMapping("/")
	public gitHub(){
		return "Git hub is successfully running";
	}
	
	@PostMapping("/")
	public String jenkinsIntegration(){
		return "jenkins job are successfully running";
	}
}

