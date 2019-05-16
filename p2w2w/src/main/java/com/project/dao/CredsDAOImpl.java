package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


import com.project.beans.Creds;
import com.project.beans.Users;
import com.revature.util.ConnectionUtil;

public class CredsDAOImpl implements CredsDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	@Autowired
	public CredsDAOImpl(SessionFactory sf) {
		this.sf=sf;
	}
	

	
	@Override
	public void createCreds(Creds creds) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.save(creds);
			tx.commit();
			s.close();
		}

	}

	@Override
	public void updateCreds(Creds creds) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.saveOrUpdate(creds);
			tx.commit();
			s.close();
		}

	}
	
	@Override
	public void deleteUser(Creds creds) {
		sf.getCurrentSession().delete(creds);

	}

}
