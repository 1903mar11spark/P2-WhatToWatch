package com.project.dao;

import java.util.List;

import com.project.beans.Creds;

public interface CredsDAO {
	
<<<<<<< HEAD
	public void createCreds(Credentials creds);// password is returned as a string of stars
	public void updatePassword(Credentials creds); // Creds(User, username, Security Question), only if they forgot their password
	public String getUsername(User user);
=======
	public List<Creds> allCreds();
	public Creds getCredsById(int credsId);
	public void createCreds(Creds creds);
	public void updateCreds(Creds creds);
	public void deleteCreds(Creds creds);
	
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9

}
