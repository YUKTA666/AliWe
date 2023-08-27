package com.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.CurrentStatus;
import com.app.entity.Stream;
import com.app.entity.User;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EngineerDTO {
	@JsonProperty(access = Access.READ_ONLY)
    private Long id;
    
    @NotNull(message = "Please specify your stream")
    private Stream stream;
    
    @NotNull(message = "Status cannot be null")
    private CurrentStatus status;

	@NotBlank(message = "Job Title cannot be blank")
    private String jobTitle;

	@NotBlank(message = "Please specify your company")
    private String company;

	@NotNull(message = "Please specify your years of experience")
    private Integer yearsOfExperience;
    
	@NotNull(message = "Please specify your age")
    private Integer age;

	@NotNull(message = "User cannot be null")
    private User user;
}
