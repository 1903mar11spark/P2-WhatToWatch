package com.project.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.beans.Creds;

@Repository(value = "credsDAO")
@Transactional
public class CredsDAOImpl implements CredsDAO {

	private SessionFactory sessionFactory;

	// CONSTRUCTOR INJECTION
	@Autowired
	public CredsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void createCreds(Creds creds) {
		sessionFactory.getCurrentSession().persist(creds);
	}

	@Override
	public void updateCreds(Creds creds) {
		sessionFactory.getCurrentSession().saveOrUpdate(creds);

	}

	@Override
	public void deleteCreds(Creds creds) {
		sessionFactory.getCurrentSession().delete(creds);
	}
}

//	HIBERNATE DAO IMPLS BELOW

//	//CREATES NEW CREDENTIALS FOR AN USER
//	@Override
//	public void createCreds(Creds creds) {
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(creds);
//		tx.commit();
//		session.close();	
//	}
//}
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
