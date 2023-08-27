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

import com.app.dto.EngineerDTO;
import com.app.entity.Engineer;
import com.app.service.IEngineerService;


@RestController
@RequestMapping("/engineer")
public class EngineerController {

	@Autowired
	private IEngineerService engineerService;
	
	public EngineerController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the Engineer Page Controller";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Engineer> getEngineerById(@PathVariable Long id){
		Engineer engineer = engineerService.getEngineerById(id);
		if(engineer != null) {
			return ResponseEntity.ok(engineer);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/AllEngineers")
	public List<Engineer> getDetails(){
		return engineerService.getAllEngineers();
	}
	
	@PostMapping("/add")
    public ResponseEntity<Engineer> saveEngineer(@RequestBody EngineerDTO engineer) {
        Engineer savedEngineer = engineerService.createEngineer(engineer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEngineer);
    }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEngineer(@PathVariable Long id){
		engineerService.deleteEngineer(id);
		return ResponseEntity.noContent().build();	}
}
