package com.app.dto;

public class UserDTO {
   
	private String email;
    private String password;
    // other fields and their getters/setters
	public String getEmail() {
		// TODO Auto-generated method stub
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
	public UserDTO() {
		super();
	}
	public UserDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
    
    // constructors
}