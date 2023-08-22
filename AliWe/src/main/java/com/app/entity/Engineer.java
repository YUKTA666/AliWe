package com.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "engineers")
@NoArgsConstructor 
@AllArgsConstructor
@Getter 
@Setter 
@ToString(exclude = "password") 
public class Engineer extends User {
	
	@Column(nullable = false) 
	private String specialization;
	
	@Column(nullable = false) 
	private CurrentStatus status;
	
	@Column
	private int age;
	
}