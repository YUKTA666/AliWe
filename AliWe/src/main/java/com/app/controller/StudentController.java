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

import com.app.dto.StudentDTO;
import com.app.entity.Student;
import com.app.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	public StudentController() {
		System.out.println("in ctor " + getClass());
	}
	
	@GetMapping("/hello")
	public String showMsg(){
		return "Welcome to the Student Page Controller";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id){
		Student student = studentService.getStudentById(id);
		if(student != null) {
			return ResponseEntity.ok(student);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/AllStudents")
	public ResponseEntity<List<Student>> getDetailsOfAllStuendts(){
		List<Student> students = studentService.getAllStudents();
		return ResponseEntity.ok(students);
	}
	
	@PostMapping("/add")
    public ResponseEntity<Student> saveStudent(@RequestBody StudentDTO student) {
        Student savedStudent = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
		studentService.deleteStudent(id);
		return ResponseEntity.noContent().build();	
	}
}
