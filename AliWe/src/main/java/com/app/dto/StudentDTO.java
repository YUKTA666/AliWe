package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.app.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

	@JsonProperty(access = Access.READ_ONLY)
    private Long id;

    @NotNull(message = "Please specify your date of birth")
    private LocalDate dob;

    @NotNull(message = "Please specify your 10th percentage")
    private Double percentage;

    @NotNull(message = "User cannot be null")
    private User user;
}
