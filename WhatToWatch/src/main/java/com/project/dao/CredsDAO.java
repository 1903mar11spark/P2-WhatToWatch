package com.project.dao;

import java.util.List;

import com.project.beans.Creds;

public interface CredsDAO {
	
	public List<Creds> allCreds();
	public Creds getCredsById(int credsId);
//	public int getUserId(String userName, String password);
	public void createCreds(Creds creds);
	public void updateCreds(Creds creds);
	public void deleteCreds(Creds creds);
	

	
}
