package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excceptions.ResourceNotFoundException;
import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.repository.IUserRepository;

@Service
@Transactional
public class ImplUserService implements IUserService {
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private PasswordEncoder enc;
    
    public ImplUserService(IUserRepository userRepository, PasswordEncoder enc) {
        this.userRepository = userRepository;
        this.enc = enc;
    }
    
    @Override
    public User createUser(UserDTO userdto) {
    	User user = new User();
    	user.setName(userdto.getName());
    	user.setEmail(userdto.getEmail());
    	user.setPassword(enc.encode(userdto.getPassword()));
    	user.setRole(userdto.getRole());
        return userRepository.save(user);
    }
    
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
    
    @Override
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @Override
    public User updateUser(Long id, User user) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(enc.encode(user.getPassword()));
        existingUser.setRole(user.getRole());
        
        return userRepository.save(existingUser);
    }
    
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
