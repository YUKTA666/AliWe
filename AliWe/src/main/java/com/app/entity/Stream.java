package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "streams")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "engineers")
public class Stream {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="Stream_Name")
	private String streamName;
	
	@Column(name="PCM_Marks")
	private Integer qualifyingMarksPCM;
	
	@OneToMany(mappedBy = "stream", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
    private List<Engineer> engineers = new ArrayList<>();

	public Stream(String streamName, Integer qualifyingMarksPCM, List<Engineer> engineers) {
		super();
		this.streamName = streamName;
		this.qualifyingMarksPCM = qualifyingMarksPCM;
		this.engineers = engineers;
	}

	public Stream(String streamName, Integer qualifyingMarksPCM) {
		super();
		this.streamName = streamName;
		this.qualifyingMarksPCM = qualifyingMarksPCM;
	}
}
