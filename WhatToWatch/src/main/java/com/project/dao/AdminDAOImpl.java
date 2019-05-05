package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.User;
import com.revature.util.ConnectionUtil;

public class AdminDAOImpl implements AdminDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	//RETRIEVES ADMIN BY ADMIN CREDENTIALS
	@Override
	public Admin getAdminByCreds(Credentials creds) {
		Admin admin = null;
		try (Session session = sf.getCurrentSession()){
			Transaction tx = session.beginTransaction();
			String hql = "FROM Admin WHERE creds= :credsVar";
			Query query = session.createQuery(hql);
			query.setParameter("credsVar", creds);
			admin = (Admin) query.getSingleResult();
			tx.commit();
		}
		return admin;
	}

	//RETRIEVES ALL USERS 
	@Override
	public List<User> getAllUser() {
		List<User> allusers = new ArrayList<>();
		try (Session session = sf.getCurrentSession()){
			Transaction tx = session.beginTransaction();
			allusers = session.createQuery("from User").getResultList();
			tx.commit();
			session.close();
		}
		return allusers;
	}

	//RETRIEVES ALL USERS BY TIER
	@Override
	public List<User> getAllByTier(Tier tier) {
		List<User> tierusers = new ArrayList<User>();
		try (Session session = sf.getCurrentSession()){
			Transaction tx = session.beginTransaction();
			String hql = "FROM User WHERE tier = :tierVar";
			Query query = session.createQuery(hql);
			query.setParameter("tierVar", tier);
			tierusers = query.getResultList();
			tx.commit();
		}
		return tierusers;
	}

	
}
