package com.project.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.beans.Credentials;
import com.revature.util.ConnectionUtil;

@Repository(value="credsDAO")
@Transactional
public class CredsDAOImpl implements CredsDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	@Autowired
	public CredsDAOImpl(SessionFactory sf) {
		this.sf=sf;
	}
	

	
	@Override
	public void createCreds(Credentials creds) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.save(creds);
			tx.commit();
			s.close();
		}

	}

	@Override
	public void updateCreds(Credentials creds) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.update(creds);
			tx.commit();
			s.close();
		}

	}

}
