package com.project.dao;

import com.project.beans.Credentials;
import com.project.beans.User;

public interface UserDAO {
	
	public User getUserByCreds(Credentials creds);
	public User getUserById(int userId);
	public void updateUser(User user);
	public void createUser(User user);
	public void delete(User user);
	

}
