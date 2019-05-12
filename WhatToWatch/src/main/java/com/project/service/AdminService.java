package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.*;
import com.project.beans.*;

@Service
public class AdminService {

	private AdminDAO adminDAO;
	
	@Autowired
	public AdminService(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
	
	public List<Admin> allAdmins(){
		return adminDAO.allAdmins();
	}
	
	public Admin getAdminById(int adminId) {
		return adminDAO.getAdminById(adminId);
	}
	
	public void createAdmin(Admin admin) {
		adminDAO.createAdmin(admin);
	}
	
	public void updateAdmin(Admin admin) {
		adminDAO.updateAdmin(admin);
	}
	
	public void deleteAdmin(Admin admin) {
		adminDAO.deleteAdmin(admin);
	}

}
