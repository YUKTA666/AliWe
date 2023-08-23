package com.app.entity;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends User{

	public Student() {
		super();
	}

	public Student(String username, String password, String email) {
		super(username, password, email);
	}

	@Override
	public String toString() {
		return "Student [id = " +super.getId()+ ", Name = "+ super.getUsername()+", Email = "+ super.getEmail()+"]";
	}
	
}
