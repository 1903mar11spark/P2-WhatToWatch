package com.project.dao;

import java.util.List;

import com.project.beans.User;

public interface UserDAO {
	
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
		
}
