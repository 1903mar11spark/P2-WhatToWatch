package com.project;

import org.hibernate.SessionFactory;

import com.project.dao.UserDAO;
import com.project.dao.UserDAOImpl;
import com.project.util.ConnectionUtil;

public class Driver {
	UserDAO userDAO = new UserDAOImpl(null);
	
	public static void main(String[] args) {
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println(s.getStatistics());
		tx.commit();
		s.close();
		
		

	}
	
	
	
	//create and finalized Tiers and Admin Table
	/*
	 *  BatDAO bd = new BatDAOImpl(); 
	 * Bat b6 = new Bat(1,"Batty McBatFace", 20.0);
	 * b.setCave(new Cave(27, "Tampa", 8)); bd.updateBat(b6);
	 */
	
	/*
	 * AdminDAO ud = new AdminDAOImpl();
	 * Admin admin
	 * 
	 */

}
