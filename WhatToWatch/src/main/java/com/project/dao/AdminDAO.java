package com.project.dao;

import java.util.List;

import com.project.beans.Admin;

public interface AdminDAO {
	
	public List<Admin> allAdmins();
	public Admin getAdminById(int adminId);
	public void createAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public void deleteAdmin(Admin admin);
	

}
