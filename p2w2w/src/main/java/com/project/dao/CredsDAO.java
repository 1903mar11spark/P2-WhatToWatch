package com.project.dao;

import com.project.beans.Creds;

public interface CredsDAO {
	
	public void createCreds(Creds creds);
	public void updateCreds(Creds creds);
	void deleteUser(Creds creds);

}
