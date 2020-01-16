package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.User;
import com.springboot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		service.addUser(user);
	}
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
	public Iterable<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@RequestMapping(value = "/users/{userId}",method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable("userId") int userId) {
		return service.getUser(userId);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	public void updateUser(User user) {
		service.updateUser(user);
	}
	
	@RequestMapping(value = "/user/{userId}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("userId") int userId) {
		service.deleteUser(userId);
	}
}
