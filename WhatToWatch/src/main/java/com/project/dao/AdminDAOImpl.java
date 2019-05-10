package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Admin;
import com.project.beans.Creds;
import com.project.beans.Tier;
import com.project.beans.User;
import com.project.util.ConnectionUtil;

public class AdminDAOImpl implements AdminDAO {

	private SessionFactory sessionFactory;

	//CONSTRUCTOR INJECTION
	@Autowired 
	public AdminDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
	@Override
	public List<Admin> allAdmins() {
		List<Admin> admins = new ArrayList<>();
		Session session = sessionFactory.getCurrentSession();
		admins = session.createQuery("from Admin").getResultList();
		return admins;
	}

	@Override
	public Admin getAdminById(int adminId) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Admin.class, adminId);
	}

	@Override
<<<<<<< HEAD
	public List<User> getAllByTier(Tier tier) {
		List<User> tierUsers = new ArrayList<User>();
		try (Session session = sf.getCurrentSession()){
			Transaction tx = session.beginTransaction();
			String hql = "FROM User WHERE tier = :tierVar";
			Query query = session.createQuery(hql);
			query.setParameter("tierVar", tier);
			tierUsers = query.getResultList();
			tx.commit();
		}
		return tierUsers;
	}

/*	@Override
	public boolean deleteUser(Admin admin) {
		if(admin !=null) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(admin);
		tx.commit();
		session.close();
		return true;
		}else {
			return false;
		}
	}*/

/*	@Override
	public Admin createAdmin(Admin admin) {
		if(admin != null) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(admin);
		tx.commit();
		session.close();
		return admin;
		}else {
			return null;
		}*/
=======
	public void createAdmin(Admin admin) {
		sessionFactory.getCurrentSession().persist(admin);		
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9
	}

	@Override
	public void updateAdmin(Admin admin) {
		sessionFactory.getCurrentSession().saveOrUpdate(admin);				
	}

	@Override
	public void deleteAdmin(Admin admin) {
		sessionFactory.getCurrentSession().delete(admin);						
	}
	
	
	
	
	
<<<<<<< HEAD
=======
}
	
//	//RETRIEVES ADMIN BY ADMIN CREDENTIALS
//	@Override
//	public Admin getAdminByCreds(Credentials creds) {
//		Admin admin = null;
//		try (Session session = sf.getCurrentSession()){
//			Transaction tx = session.beginTransaction();
//			String hql = "FROM Admin WHERE creds= :credsVar";
//			Query query = session.createQuery(hql);
//			query.setParameter("credsVar", creds);
//			admin = (Admin) query.getSingleResult();
//			tx.commit();
//		}
//		return admin;
//	}
//
//	//RETRIEVES ALL USERS 
//	@Override
//	public List<User> getAllUser() {
//		List<User> allusers = new ArrayList<>();
//		try (Session session = sf.getCurrentSession()){
//			Transaction tx = session.beginTransaction();
//			allusers = session.createQuery("from User").getResultList();
//			tx.commit();
//			session.close();
//		}
//		return allusers;
//	}
//
//	//RETRIEVES ALL USERS BY TIER
//	@Override
//	public List<User> getAllByTier(Tier tier) {
//		List<User> tierusers = new ArrayList<User>();
//		try (Session session = sf.getCurrentSession()){
//			Transaction tx = session.beginTransaction();
//			String hql = "FROM User WHERE tier = :tierVar";
//			Query query = session.createQuery(hql);
//			query.setParameter("tierVar", tier);
//			tierusers = query.getResultList();
//			tx.commit();
//		}
//		return tierusers;
//	}
//
//	
//}
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9
