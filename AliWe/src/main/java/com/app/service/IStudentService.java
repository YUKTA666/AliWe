package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface IStudentService {
	List<Student> getAllStudents();
	Student createStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
