package com.project.dao;

import java.util.List;

import com.project.beans.Creds;
import com.project.beans.Users;

public interface UserDAO {
	
	public void createUser(Users user);
	public void updateUser(Users user);
	public void deleteUser(Users user);
	public Users getUserByCreds(Creds creds);
	public List<Users> getAllUsers();

}
