package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Stream;
import com.app.service.IStreamService;

@RestController
@RequestMapping("/stream")
public class StreamController {
	@Autowired
	private IStreamService streamService;
	
	public StreamController(IStreamService streamService) {
		this.streamService = streamService;
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Stream>> getAllStreams(){
		List<Stream> streams = streamService.getAllStreams();
		return ResponseEntity.ok(streams);
	}

}
