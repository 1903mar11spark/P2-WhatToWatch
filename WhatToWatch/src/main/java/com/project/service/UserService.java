package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.beans.User;
import com.project.dao.UserDAO;

public class UserService {
	
	private UserDAO userDAO;
	
	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public List<User> allUsers(){
		return userDAO.allUsers();
	}
	public User getUserById(int userId) {
		return userDAO.getUserById(userId);
	}
	public void createUser(User user) {
		userDAO.createUser(user);
	}
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
	}
	
	
	
	

}
