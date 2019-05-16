package com.project.dao;

import java.util.List;

import com.project.beans.Users;

public interface UserDAO {
	
	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public void createUser(Users user);
	public void updateUser(Users user);
	public void deleteUser(Users user);
		
}
