package com.project.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.User;
import com.project.dao.UserDAO;

@Service
public class UserService {

	private UserDAO userDAO;

	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
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
