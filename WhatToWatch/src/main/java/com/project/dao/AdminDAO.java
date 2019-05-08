package com.project.dao;

import java.util.List;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;

public interface AdminDAO {//us, as employees
	
	public Admin getAdminByCreds(Credentials creds);
<<<<<<< HEAD
	public List<User> getAllByTier(Tier tier);
	public boolean deleteUser(Admin admin);
	public Admin createAdmin(Admin admin);
	public List<User> getAllUser();	
	
=======
	public List<User> getAllUser();
	public List<User> getAllByTier(Tier tier);	

>>>>>>> 76e1437b3513d086ae424df705c99fadb3cd1ed0

}
