package com.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "engineers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stream_id")
    private Stream stream;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CurrentStatus status;

	@Column(nullable = false)
    private String jobTitle;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private Integer yearsOfExperience;
    
    @Column(nullable = false)
    private Integer age;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;
    
    public Engineer(Stream stream,CurrentStatus status, String jobTitle, String company, Integer yearsOfExperience,
			Integer age, User user) {
		super();
		this.stream = stream;
		this.status = status;
		this.jobTitle = jobTitle;
		this.company = company;
		this.yearsOfExperience = yearsOfExperience;
		this.age = age;
		this.user = user;
	}
    
}