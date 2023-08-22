package com.app.entity;



import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@NoArgsConstructor 
@AllArgsConstructor
@Getter 
@Setter 
@ToString(exclude = "password")
public class Student extends User{
	
}
