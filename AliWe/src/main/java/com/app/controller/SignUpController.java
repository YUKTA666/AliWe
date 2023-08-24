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
	
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationRequest) {
//        if (userService.existsByEmail(registrationRequest.getEmail())) {
//            return ResponseEntity.badRequest().body("Email is already taken");
//        }
//
//        User user = new User();
//        user.setName(registrationRequest.getName());
//        user.setEmail(registrationRequest.getEmail());
//        user.setPassword(registrationRequest.getPassword());
//        // Set other user properties as needed
//
//        userService.saveUser(user);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body("Registration successful");
//    }
}
