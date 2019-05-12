package com.project;

import org.hibernate.SessionFactory;

import com.project.util.ConnectionUtil;

public class Driver {
	
	public static void main(String[] args) {
		SessionFactory sf = ConnectionUtil.getSessionFactory();
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
