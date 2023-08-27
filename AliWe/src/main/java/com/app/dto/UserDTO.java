package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.entity.UserType;
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
@ToString(exclude = "password")
public class UserDTO {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;

	@NotBlank(message = "Name must be supplied")
    private String name;

	@NotBlank(message = "Email must be supplied")
	@Email(message = "Invalid email format")
    private String email;

	@NotBlank(message = "Password must be supplied")
    private String password;
    
	@NotNull(message = "Please specify a role")
    private UserType role;
	
}
