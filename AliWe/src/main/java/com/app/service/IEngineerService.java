package com.app.service;

import java.util.List;

import com.app.entity.Engineer;

public interface IEngineerService {
	List<Engineer> getAllEngineers();
	Engineer createEngineer(Engineer engineer);
    Engineer getEngineerById(Long id);
    Engineer updateEngineer(Long id, Engineer engineer);
    void deleteEngineer(Long id);
}
