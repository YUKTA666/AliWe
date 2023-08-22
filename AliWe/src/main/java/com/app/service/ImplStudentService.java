package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Student;
import com.app.repository.IStudentRepository;

@Service
@Transactional
public class ImplStudentService implements IStudentService {

	@Autowired
	private IStudentRepository studentRepo;
	
	public ImplStudentService() {
		System.out.println("in ctor " + getClass());
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

}
