package com.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	
	@GetMapping("/")
	public String userDashe() {
		
		return "home";
	}
	
	
	
	@GetMapping("/user")
	public String aadityasop() {
		System.out.println("hey its some change");
		return "home";
	}
	
	

}
