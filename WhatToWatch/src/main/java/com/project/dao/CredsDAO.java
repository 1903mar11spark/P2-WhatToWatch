package com.project.dao;

import com.project.beans.Credentials;
import com.project.beans.User;

public interface CredsDAO {
	
	public boolean createCreds(Credentials creds);//password is returned as a string of stars
	public boolean updatePassword(Credentials creds); //Creds(User, username, Security Question), only if they forgot their password
	//public String getUsername(User user);
	public boolean loginExsit(Credentials creds);
	public String getUsername(User user);
	

}
