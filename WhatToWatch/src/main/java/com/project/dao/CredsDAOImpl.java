package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.beans.Creds;
import com.project.beans.User;

@Repository(value="credsDAO")
@Transactional

public class CredsDAOImpl implements CredsDAO {

<<<<<<< HEAD
	SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public void createCreds(Credentials creds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePassword(Credentials creds) {
		// TODO Auto-generated method stub
		
=======
	private SessionFactory sessionFactory;

	//CONSTRUCTOR INJECTION
	@Autowired 
	public CredsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Creds> allCreds() {
		List<Creds> creds = new ArrayList<>();
		Session session = sessionFactory.getCurrentSession();
		creds = session.createQuery("from Creds").getResultList();
		return creds;
	}

	@Override
	public Creds getCredsById(int credsId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Creds.class, credsId);
	}

	@Override
	public void createCreds(Creds creds) {
		sessionFactory.getCurrentSession().persist(creds);		
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9
	}

	@Override
	public void updateCreds(Creds creds) {
		sessionFactory.getCurrentSession().saveOrUpdate(creds);		
		
	}
<<<<<<< HEAD
	
=======

	@Override
	public void deleteCreds(Creds creds) {
		sessionFactory.getCurrentSession().delete(creds);		
		
	}
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9
}
	
	
	
//	HIBERNATE DAO IMPLS BELOW
	
//	//CREATES NEW CREDENTIALS FOR AN USER
//	@Override
//	public void createCreds(Credentials creds) {
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(creds);
//		tx.commit();
//		session.close();	
//	}
//
//	//UPDATES THE PASSWORD FOR AN USER
//	@Override
//	public void updatePassword(Credentials creds) {
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(creds);
//		tx.commit();
//		session.close();
//	}
//
//	//RETRIEVES THE USERNAME FOR AN USER -- need to do 
//	@Override
//	public String getUsername(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}

