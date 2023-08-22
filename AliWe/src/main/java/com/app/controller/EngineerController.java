package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Engineer;
import com.app.service.IEngineerService;


@RestController
@RequestMapping("/engineer")
public class EngineerController {

	@Autowired
	private IEngineerService engineerService;
	
	public EngineerController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the Engineer Page Controller";
	}
	
	@GetMapping("/details")
	public List<Engineer> getDetails(){
		return engineerService.getAllEngineers();
	}
}
