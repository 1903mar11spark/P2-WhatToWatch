package com.project.dao;

import java.util.List;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;

public interface AdminDAO {
	
	//these methods will only be accessible to us as administrators 
	
	public Admin getAdminByCreds(Credentials creds);
	public List<User> getAllUser(); 
	public List<User> getAllUserByTier(Tier tier);
	public boolean deleteUser(User user);
	
	

}
