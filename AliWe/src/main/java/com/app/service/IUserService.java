package com.app.service;

import java.util.List;

import com.app.entity.User;

public interface IUserService {
	User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
