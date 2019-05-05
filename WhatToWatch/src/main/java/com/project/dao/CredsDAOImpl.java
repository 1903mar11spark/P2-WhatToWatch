package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Credentials;
import com.project.beans.User;
import com.revature.util.ConnectionUtil;

public class CredsDAOImpl implements CredsDAO {

	SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	//---note---//
	
	//should we add in another query to create creds based on 
	//userID, username, password, and security question/answer? 

	
	//CREATES NEW CREDENTIALS FOR AN USER
	@Override
	public void createCreds(Credentials creds) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(creds);
		tx.commit();
		session.close();	
	}

	//UPDATES THE PASSWORD FOR AN USER
	@Override
	public void updatePassword(Credentials creds) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(creds);
		tx.commit();
		session.close();
	}

	//RETRIEVES THE USERNAME FOR AN USER -- need to do 
	@Override
	public String getUsername(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
