package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void addUser(User user) {
		repository.save(user);
	}
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Optional<User> getUser(int userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId);
	}
	@Override
	public void updateUser(User user) {
		 repository.save(user);
	}
	@Override
	public void deleteUser(int userId) {
		repository.deleteById(userId);;
	}

}
