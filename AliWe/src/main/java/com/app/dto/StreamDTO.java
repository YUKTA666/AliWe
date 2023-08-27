package com.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class StreamDTO {
	@JsonProperty(access = Access.READ_ONLY)
    private Long id;
	
	@NotBlank(message = "Stream name cannot be blank")
	private String streamName;
	
	@NotNull(message = "Please specify qualifying marks")
	private Integer qualifyingMarksPCM;

	public StreamDTO(@NotBlank(message = "Stream name cannot be blank") String streamName,
			@NotNull(message = "Please specify qualifying marks") Integer qualifyingMarksPCM) {
		super();
		this.streamName = streamName;
		this.qualifyingMarksPCM = qualifyingMarksPCM;
	}

}
