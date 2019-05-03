package com.project.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;
import com.project.util.ConnectionUtil;

public class AdminDAOImpl implements AdminDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public Admin getAdminByCreds(Credentials creds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUserByTier(Tier tier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
}
