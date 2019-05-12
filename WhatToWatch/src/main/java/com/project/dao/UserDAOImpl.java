package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Credentials;
import com.project.beans.User;
import com.project.util.ConnectionUtil;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	//RETRIEVES USER BY CREDENTIALS -- need to do
	@Override
	public User getUserByCreds(Credentials creds) {
		return null;
	}

	//RETRIEVES USER BY USERID -- need to do
	@Override
	public User getUserById(int userId) {
		return null;
	}

	//UPDATES USER PROFILE
	@Override
	public void updateUser(User user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
		session.close();
	}

	//CREATES A NEW USER
	@Override
	public void createUser(User user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	//DELETES A USER ACCOUNT
	@Override
	public void delete(User user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
		session.close();
	}

}
