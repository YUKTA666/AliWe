package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.Engineer;
import com.app.repository.IEngineerRepository;

@Service
@Transactional
public class ImplEngineerService implements IEngineerService {

	@Autowired
	private IEngineerRepository engineerRepo;
	
	public ImplEngineerService() {
		System.out.println("in ctor " + getClass());
	}

	@Override
	public List<Engineer> getAllEngineers() {
		return engineerRepo.findAll();
	}

}
