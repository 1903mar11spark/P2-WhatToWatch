package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Credentials;
import com.project.beans.User;
import com.project.util.ConnectionUtil;

public class CredsDAOImpl implements CredsDAO {

	SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public void createCreds(Credentials creds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassword(Credentials creds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUsername(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
