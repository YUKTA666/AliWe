package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
	
}
