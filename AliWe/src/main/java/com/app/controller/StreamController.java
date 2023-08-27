package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StreamDTO;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Stream> getStreamById(@PathVariable Long id){
		Stream stream = streamService.getStreamById(id);
		if(stream != null) {
			return ResponseEntity.ok(stream);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/add")
    public ResponseEntity<Stream> saveStream(@RequestBody StreamDTO stream) {
        Stream savedStream = streamService.createStream(stream);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStream);
    }
	
	@GetMapping("/viewAll")
	public ResponseEntity<List<Stream>> getAllStreams(){
		List<Stream> streams = streamService.getAllStreams();
		return ResponseEntity.ok(streams);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStream(@PathVariable Long id){
		streamService.deleteStream(id);
		return ResponseEntity.noContent().build();	
	}

}
