package com.app.dto;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
   
	@NotBlank(message = "Email can't be blank or null")
	private String email;
	@NotBlank(message = "password can't be blank or null")
	private String password;
   
	public String getEmail() {
		return email;
	}
	public String getPassword() {
			return password;
		}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginRequest() {
		super();
	}
	public LoginRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
    
}