package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
