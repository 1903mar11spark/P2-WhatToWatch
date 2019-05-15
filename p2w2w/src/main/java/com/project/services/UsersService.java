package com.project.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.beans.Credentials;
import com.project.beans.Users;
import com.project.dao.UserDAO;
import com.project.dao.UserDAOImpl;

@Service
public class UsersService {
	
	private UserDAO userDAO;
	
	@Autowired
	public UsersService(UserDAOImpl ud) {
		this.userDAO = ud;
	}
	
	public List<Users> getAllUsers(){
		return userDAO.getAllUsers();
	}
	
	public void updateUser(Users user) {
		userDAO.updateUser(user);
	}
	
	public Users getUserByCreds(Credentials creds) {
		return userDAO.getUserByCreds(creds);
	}
	
	public void deleteUser(Users user) {
		userDAO.deleteUser(user);
	}
	
	
	
	

}
