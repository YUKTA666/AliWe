package com.app.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
    private IUserService userService;
    
    public UserController(IUserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
    	User user = userService.getUserById(id);
    	if(user!=null) {
    		return ResponseEntity.ok(user);
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @GetMapping("/email/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable String email){
    	User user = userService.getUserByEmail(email);
    	if(user != null) {
    		return ResponseEntity.ok(user);
    	} else {
    		return ResponseEntity.notFound().build();
    	}
    }
    
    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userdto) {
        User savedUser = userService.createUser(userdto);
        return ResponseEntity.created(URI.create("/users/" + savedUser.getId())).body(savedUser);
    }
    
    @GetMapping("/details")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}