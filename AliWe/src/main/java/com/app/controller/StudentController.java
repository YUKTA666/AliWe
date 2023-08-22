package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	public StudentController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the Student Page Controller";
	}
	
	@GetMapping("/details")
	public List<Student> getDetails(){
		return studentService.getAllStudents();
	}
}
