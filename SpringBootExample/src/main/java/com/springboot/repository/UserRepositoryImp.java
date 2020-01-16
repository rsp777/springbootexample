//package com.springboot.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.springboot.model.User;
//
//@Repository
//public class UserRepositoryImp implements UserRepository{
//
//	static List<User> users = new ArrayList<>();
//	static {
//		users.add(new User(1001,"Ravindra",23));
//		users.add(new User(1002,"Lokendra",29));
//		users.add(new User(1003,"Pragati",27));
//		users.add(new User(1004,"Rishabh",23));
//		users.add(new User(1005,"Akshay",22));
//		users.add(new User(1006,"Ayushi",23));
//	}
//	@Override
//	public void addUser(User user) {
//		users.add(user);
//	}
//
//	@Override
//	public List<User> getAllUsers() {
//		return users;
//	}
//
//	@Override
//	public User getUser(int userId) {
//		for(User user : users) {
//			if(user.getUserId() == userId) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public void update(User user) {
//		System.out.println("User updated");
//	}
//
//	@Override
//	public void delete(int userId) {
//		for (int i = 0; i < users.size(); i++) {
//			User user = users.get(i);
//			if(user.getUserId() == userId) {
//				users.remove(user);
//			}
//		}
//	}
//
//}
