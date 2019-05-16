package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.beans.Creds;
import com.project.beans.Users;
import com.revature.util.ConnectionUtil;


public class UserDAOImpl implements UserDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	@Autowired
	public UserDAOImpl(SessionFactory sf) {
		this.sf=sf;
	}
	
	

	@Override
	public void createUser(Users user) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.save(user);
			tx.commit();
			s.close();
		}

	}

	@Override
	public void updateUser(Users user) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			tx.commit();
			s.update(user);

		}

	}

	@Override
	public void deleteUser(Users user) {
		sf.getCurrentSession().delete(user);

	}

	@Override
	public Users getUserByCreds(Creds creds) {
		Users user = new Users();
		int id = creds.getUser().getUsersId();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			user = sf.getCurrentSession().get(Users.class, id);
			tx.commit();
			s.close();
		}
		return user;
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			users = s.createQuery("from Users").getResultList();
			tx.commit();
			s.close();
		}
		return users;
	}

}
