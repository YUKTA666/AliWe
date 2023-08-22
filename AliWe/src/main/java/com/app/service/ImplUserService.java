package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.User;
import com.app.repository.IUserRepository;

@Service
@Transactional
public class ImplUserService implements IUserService {

	@Autowired
	private IUserRepository userRepo;
	
	public ImplUserService() {
		System.out.println("in ctor " + getClass());
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
