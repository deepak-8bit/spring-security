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
	public String userDash() {
		
		return "home";
	}
	
	@GetMapping("/admin")
	public String adminDash() {
		
		return "adminhome";
	}

}
