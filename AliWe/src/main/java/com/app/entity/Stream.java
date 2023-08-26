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

@Entity
@Table(name = "streams")
public class Stream {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="Stream_Name")
	private String streamName;
	
	@Column(name="PCM_Marks")
	private Integer qualifyingMarksPCM;
	
	@OneToMany(mappedBy = "stream", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Engineer> engineers = new ArrayList<>();
	
	public Stream() {
	}

	public Stream(String streamName, Integer qualifyingMarksPCM, List<Engineer> engineers) {
		super();
		this.streamName = streamName;
		this.qualifyingMarksPCM = qualifyingMarksPCM;
		this.engineers = engineers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreamName() {
		return streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	public Integer getQualifyingMarksPCM() {
		return qualifyingMarksPCM;
	}

	public void setQualifyingMarksPCM(Integer qualifyingMarksPCM) {
		this.qualifyingMarksPCM = qualifyingMarksPCM;
	}

	public List<Engineer> getEngineers() {
		return engineers;
	}

	public void setEngineers(List<Engineer> engineers) {
		this.engineers = engineers;
	}

	@Override
	public String toString() {
		return "Stream [id=" + id + ", streamName=" + streamName + ", qualifyingMarksPCM=" + qualifyingMarksPCM + "]";
	}

}
