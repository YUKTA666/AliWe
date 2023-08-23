package com.app.entity;

import javax.persistence.*;

@MappedSuperclass
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100)
    private String username;
    
    @Column(nullable = false)
    private String password;
    
    @Column(length = 30, unique = true) 
    private String email;
    
    @Transient
    @Enumerated(EnumType.STRING)
    private UserType userType;
    
    public User(String username, String password, String email, UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}

	public User(String username2, String password2, String email2) {
		super();
	}
	
	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}
    
    public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", userType=" + userType + "]";
	}
    
}
