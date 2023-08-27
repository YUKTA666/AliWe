package com.app.service;

import java.util.List;

import com.app.dto.UserDTO;
import com.app.entity.User;

public interface IUserService {
	User createUser(UserDTO user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
	
}
