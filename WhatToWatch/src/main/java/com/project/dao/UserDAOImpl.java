package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.beans.Users;


@Repository(value="userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	private SessionFactory sf;

	// CONSTRUCTOR INJECTION
	@Autowired
	public UserDAOImpl(SessionFactory sf) {
		this.sf = sf;
	}


	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		Session session = sf.getCurrentSession();
		users = session.createQuery("from Users").getResultList();
		return users;
	}

	@Override
	public Users getUserById(int userId) {
		Session session = sf.getCurrentSession();
		return session.get(Users.class, userId);
	}

	@Override
	public void createUser(Users user) {
		sf.getCurrentSession().persist(user);
	}

	@Override
	public void updateUser(Users user) {
		sf.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public void deleteUser(Users user) {
		sf.getCurrentSession().delete(user);
	}
	
}

// HIBERNATE DAO IMPLS BELOW
	
	
//	//RETRIEVES USER BY CREDENTIALS -- need to do
//	@Override
//	public User getUserByCreds(Credentials creds) {
//		return null;
//	}
//
//	//RETRIEVES USER BY USERID -- need to do
//	@Override
//	public User getUserById(int userId) {
//		return null;
//	}
//
//	//UPDATES USER PROFILE
//	@Override
//	public void updateUser(User user) {
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(user);
//		tx.commit();
//		session.close();
//	}
//
//	//CREATES A NEW USER
//	@Override
//	public void createUser(User user) {
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(user);
//		tx.commit();
//		session.close();
//	}
//	
//	//DELETES A USER ACCOUNT
//	@Override
//	public void delete(User user) {
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(user);
//		tx.commit();
//		session.close();
//	}

