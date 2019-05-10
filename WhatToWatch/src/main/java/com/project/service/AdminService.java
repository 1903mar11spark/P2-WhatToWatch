package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;
import com.project.dao.AdminDAO;

public class AdminService {
	
	private AdminDAO adminDAO;
	
	@Autowired
	public AdminService(AdminDAO adminDAO) {
		this.adminDAO=adminDAO;
	}
	
	/*
	 * public List<User> allUsers() { return adminDAO.allUsers(); }
	 * 
	 * public User getUserById(int id) { return adminDAO.getUserById(id); }
	 */
	
	public List<User> getAllUsersByTier(Tier tier){
		return adminDAO.getAllByTier(tier);
	}
	
	public List<User> getAllUsers(){
		return adminDAO.getAllUser();
	}
	
	public Admin getAdminByCreds(Credentials creds) {
		return adminDAO.getAdminByCreds(creds);
	}
	
	
	

}
