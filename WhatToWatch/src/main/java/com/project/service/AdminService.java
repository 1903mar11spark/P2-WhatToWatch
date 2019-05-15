package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.beans.Admin;
import com.project.beans.Creds;
import com.project.beans.User;
import com.project.dao.AdminDAO;

public class AdminService {
	
	private AdminDAO adminDAO;
	
	@Autowired
	public AdminService(AdminDAO adminDAO) {
		this.adminDAO=adminDAO;
	}
	
	public List<Admin> allAdmins(){
		return adminDAO.allAdmins();
	}
	
	 public List<User> getAllUsers() { 
		 return adminDAO.getAllUser();
		 }

	
	public Admin getAdminByCreds(Creds creds) {
		return adminDAO.getAdminByCreds(creds);
	}
	
	public void createAdmin(Admin admin) {
		adminDAO.createAdmin(admin);
	}
	
	public void updateAdmin(Admin admin) {
		adminDAO.updateAdmin(admin);
	}
	
	public void deleteAdmin(Admin admin) {
		adminDAO.updateAdmin(admin);
	}

	
	
	

}
