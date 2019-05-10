package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Credentials;
import com.project.beans.User;
import com.project.util.ConnectionUtil;

public class CredsDAOImpl implements CredsDAO {

	SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	//---note---//
	
	//should we add in another query to create creds based on 
	
	
	//CREATES NEW CREDENTIALS FOR AN USER INCULDES SECRITY ANSWER
	@Override
	public boolean createCreds(Credentials creds) {
		if(creds != null) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(creds);
		tx.commit();
		session.close();
		return true;
		}else {
			return false;
		}
	}

	//UPDATES THE PASSWORD FOR AN USER, PASSIN USERNAME, ANSWER TO SQ
	@Override
	public boolean updatePassword(Credentials creds) {
		if(creds != null) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(creds);
		tx.commit();
		session.close();
		return true;
		}
		else {
			return false;
		}
	}

	//RETRIEVES THE USERNAME FOR AN USER -- need to do 
	@Override
	public String getUsername(User user) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		return null;
	}

}
