package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();
	public Optional<User> getUser(int userId);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int userId);
	
}
