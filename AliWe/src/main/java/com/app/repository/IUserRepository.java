package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
}
