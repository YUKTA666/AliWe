package com.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "engineers")
public class Engineer extends User {
	
	@Column(nullable = false) 
	private String specialization;
	
	@Column(nullable = false) 
	private CurrentStatus status;
	
	@Column
	private int age;
	
	public Engineer(String username, String password, String email, String specialization,
			CurrentStatus status, int age) {
		super(username, password, email);
		this.specialization = specialization;
		this.status = status;
		this.age = age;
	}

	public Engineer() {
		super();
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public CurrentStatus getStatus() {
		return status;
	}

	public void setStatus(CurrentStatus status) {
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Engineer [id=" + super.getId() + ", username=" + super.getUsername() + ", email=" + super.getEmail() +", specialization=" + specialization + ", status=" + status + ", age=" + age + "]";
	}
	
}