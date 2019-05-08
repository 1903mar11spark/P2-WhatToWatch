package com.project.dao;

import java.util.List;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;

public interface AdminDAO {//us, as employees
	
	public Admin getAdminByCreds(Credentials creds);
	public List<User> getAllByTier(Tier tier);
	public boolean deleteUser(Admin admin);
	public Admin createAdmin(Admin admin);
	public List<User> getAllUser();	
	

}
