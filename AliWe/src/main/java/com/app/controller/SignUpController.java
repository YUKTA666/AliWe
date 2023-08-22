package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SignUp")
public class SignUpController {

	public SignUpController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the Registration Page Controller";
		
	}
}
