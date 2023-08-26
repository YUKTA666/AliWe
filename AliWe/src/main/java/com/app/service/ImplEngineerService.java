package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excceptions.ResourceNotFoundException;
import com.app.entity.Engineer;
import com.app.repository.IEngineerRepository;

@Service
@Transactional
public class ImplEngineerService implements IEngineerService {

	@Autowired
	private IEngineerRepository engineerRepo;
	
	public ImplEngineerService(IEngineerRepository engineerRepo) {
		System.out.println("in ctor " + getClass());
		this.engineerRepo = engineerRepo;
	}

	@Override
	public List<Engineer> getAllEngineers() {
		return engineerRepo.findAll();
	}

	@Override
	public Engineer createEngineer(Engineer engineer) {
		return engineerRepo.save(engineer);
	}

	@Override
	public Engineer getEngineerById(Long id) {
		return engineerRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Engineer not found"));
	}

	@Override
	public Engineer updateEngineer(Long id, Engineer engineer) {
		Engineer existingEngineer = engineerRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Engineer not found"));
		existingEngineer.setUser(engineer.getUser());
        existingEngineer.setJobTitle(engineer.getJobTitle());
        existingEngineer.setStream(engineer.getStream());
        existingEngineer.setCompany(engineer.getCompany());
        existingEngineer.setAge(engineer.getAge());
        existingEngineer.setYearsOfExperience(engineer.getYearsOfExperience());
        
		return engineerRepo.save(existingEngineer);
	}

	@Override
	public void deleteEngineer(Long id) {
		engineerRepo.deleteById(id);
	}

}
