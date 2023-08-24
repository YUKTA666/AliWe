package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.custom_excceptions.BadCredentialsException;
import com.app.service.IUserService;

@RestController
@RequestMapping("/login")
public class LoginController {
//	  	@Autowired
//	    private AuthenticationManager authenticationManager;
//
//	    @Autowired
//	    private JwtTokenUtil jwtTokenUtil;

	    @Autowired
	    private IUserService userService;
	    
	public LoginController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the login Page Controller";
		
	}
//	@PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
//        } catch (BadCredentialsException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
//        }
//
//        final User user = userService.getUserByEmail(loginRequest.getEmail());
//        final String token = jwtTokenUtil.generateToken(user);
//
//        return ResponseEntity.ok(new JwtResponse(token));
//    }
}
