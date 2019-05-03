package com.project.dao;

import com.project.beans.Credentials;
import com.project.beans.User;

public interface UserDAO {
	
	public User getUserByCreds(Credentials creds);
	public boolean updateUser(User user);
	public User createUser(User user);
	public boolean delete(User user);
	

}
