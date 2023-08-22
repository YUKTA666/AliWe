package com.app.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor
@Getter 
@Setter 
@ToString(exclude = "password") 
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
}
