package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excceptions.ResourceNotFoundException;
import com.app.entity.Student;
import com.app.repository.IStudentRepository;

@Service
@Transactional
public class ImplStudentService implements IStudentService {

	@Autowired
	private IStudentRepository studentRepo;
	
	public ImplStudentService(IStudentRepository studentRepo) {
		System.out.println("in ctor " + getClass());
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found"));
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		Student existingStudent = studentRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
		existingStudent.setDob(student.getDob());
		existingStudent.setPercentage(student.getPercentage());
		existingStudent.setUser(student.getUser());
		return studentRepo.save(existingStudent);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}

}
