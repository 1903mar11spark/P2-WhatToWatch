package com.project.dao;

import java.util.List;

import com.project.beans.Admin;
import com.project.beans.Creds;
import com.project.beans.Tier;
import com.project.beans.User;


public interface AdminDAO {
	
	public List<Admin> allAdmins();
	public Admin getAdminByCreds(Creds creds);
	public void createAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public void deleteAdmin(Admin admin);
	public List<User> getAllUser();

}
