package com.project;


import org.hibernate.SessionFactory;

import com.project.beans.Creds;
import com.project.beans.Users;
import com.project.dao.CredsDAO;
import com.project.dao.CredsDAOImpl;
import com.project.dao.UserDAO;
import com.project.dao.UserDAOImpl;
import com.revature.util.ConnectionUtil;



public class Test {
	public static void main(String[] args) {
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		UserDAO ud = new UserDAOImpl(sf);
		CredsDAO cd = new CredsDAOImpl(sf);
		
		
		  Users u1 = new Users(1, null, "admin","Sally", "Green"); 
		  Users u2 = new Users(2, null, "basic", "Benny", "Smith"); 
		  Users u3 = new Users(3, null, "moderator","Jenny", "Jones"); 
		  Users u4 = new Users(4, null, "premium","Sam", "Smith");
		  
		  
//		  Users u5 = new Users(8, null, "Harry", "Potter", "basic");

		  Creds c1 = new Creds(1, "dog1234", "sally", u1); 
		  Creds c2 = new Creds(2, "cat", "benny", u2); 
		  Creds c3 = new Creds(3, "fish", "jenny", u3); 
		  Creds c4 = new Creds(4, "pig", "sam", u4);
		  
		/*
		 * u1.setCreds(c1); u2.setCreds(c2); u3.setCreds(c3); u4.setCreds(c4);
		 */
		
		  cd.createCreds(c1);
		 
		  
		/*
		 * ud.createUser(u1); ud.createUser(u2); ud.createUser(u3); ud.createUser(u4);
		 */
		  
		  
		
		  
	
		
		
		
		
		//System.out.println(users);
		
		
		
	}
	
	/*
	 * static void makeUser(SessionFactory sf) { 
	 * Session s = sf.openSession();
	 * Transaction tx = s.beginTransaction(); 
	 * System.out.println(s.save(new Bat("Batty MacBatFace"))); 
	 * // System.out.println(s.save(new Bat("Batthew",90.0))); 
	 *  tx.commit(); 
	 *  s.close(); 
	 *  }
	 */

}
