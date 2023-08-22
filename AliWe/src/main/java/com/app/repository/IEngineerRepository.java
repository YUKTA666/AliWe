package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Engineer;

@Repository
public interface IEngineerRepository extends JpaRepository<Engineer, Long>{
	List<Engineer> findAll();
}
