package com.project.service;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Users;
import com.project.dao.UserDAO;

@Service
public class UserService {

	private UserDAO userDAO;

	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void createUser(Users user) {
		userDAO.createUser(user);
	}

	public void updateUser(Users user) {
		userDAO.updateUser(user);
	}

	
	 public void deleteUser(Users user) {
		 userDAO.deleteUser(user);
		 }
	 
	 public List<Users> getAllUser(){
		 return userDAO.getAllUsers();
	 }

}
