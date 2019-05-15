package com.project.dao;

import java.util.List;

import com.project.beans.Credentials;
import com.project.beans.Users;

public interface UserDAO {
	
	public void createUser(Users user);
	public void updateUser(Users user);
	public void deleteUser(Users user);
	public Users getUserByCreds(Credentials creds);
	public List<Users> getAllUsers();

}
