package com.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "engineers")
public class Engineer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String Specialization;

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
    
    public Engineer(Long id, String specialization, String jobTitle, String company, Integer yearsOfExperience,
			Integer age, User user) {
		super();
		this.id = id;
		Specialization = specialization;
		this.jobTitle = jobTitle;
		this.company = company;
		this.yearsOfExperience = yearsOfExperience;
		this.age = age;
		this.user = user;
	}
    
    public Engineer() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Engineer [id=" + id + ", Specialization=" + Specialization + ", jobTitle=" + jobTitle + ", company="
				+ company + ", yearsOfExperience=" + yearsOfExperience + ", age=" + age + ", user=" + user + "]";
	}

}
//@Entity
//@Table(name = "engineers")
//public class Engineer extends User {
//	
//	@Column(nullable = false) 
//	private String specialization;
//	
//	@Column(nullable = false) 
//	private CurrentStatus status;
//	
//	@Column
//	private int age;
//	
//	public Engineer(String username, String password, String email, String specialization,
//			CurrentStatus status, int age) {
//		super(username, password, email);
//		this.specialization = specialization;
//		this.status = status;
//		this.age = age;
//	}
//
//	public Engineer() {
//		super();
//	}
//
//	public String getSpecialization() {
//		return specialization;
//	}
//
//	public void setSpecialization(String specialization) {
//		this.specialization = specialization;
//	}
//
//	public CurrentStatus getStatus() {
//		return status;
//	}
//
//	public void setStatus(CurrentStatus status) {
//		this.status = status;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Engineer [id=" + super.getId() + ", username=" + super.getUsername() + ", email=" + super.getEmail() +", specialization=" + specialization + ", status=" + status + ", age=" + age + "]";
//	}
//	
//}