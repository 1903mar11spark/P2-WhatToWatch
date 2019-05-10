package com.project.dao;

import java.util.List;

import com.project.beans.Admin;

<<<<<<< HEAD
public interface AdminDAO {//us, as employees

	public Admin getAdminByCreds(Credentials creds);
	public List<User> getAllUser();
   public List<User> getAllByTier(Tier tier); 
=======
public interface AdminDAO {
	
	public List<Admin> allAdmins();
	public Admin getAdminById(int adminId);
	public void createAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public void deleteAdmin(Admin admin);
	
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9

}
