package com.project.dao;

import com.project.beans.Credentials;
import com.project.beans.User;

public interface CredsDAO {
	
<<<<<<< HEAD
	public boolean createCreds(Credentials creds);//password is returned as a string of stars
	public boolean updatePassword(Credentials creds); //Creds(User, username, Security Question), only if they forgot their password
	//public String getUsername(User user);
	public boolean loginExsit(Credentials creds);
	public String getUsername(User user);
	
=======
	public void createCreds(Credentials creds);//password is returned as a string of stars
	public void updatePassword(Credentials creds); //Creds(User, username, Security Question), only if they forgot their password
	public String getUsername(User user);	
>>>>>>> 76e1437b3513d086ae424df705c99fadb3cd1ed0

}
