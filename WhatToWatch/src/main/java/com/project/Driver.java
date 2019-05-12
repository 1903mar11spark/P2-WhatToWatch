package com.project;

<<<<<<< HEAD
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.UserTier;
import com.project.dao.AdminDAO;
import com.project.dao.AdminDAOImpl;
import com.project.dao.CredsDAO;
import com.project.dao.CredsDAOImpl;
import com.project.dao.TierDAO;
import com.project.dao.TierDAOImpl;
import com.revature.util.ConnectionUtil;

public class Driver {
=======
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
>>>>>>> 6101513afca62688338036967c95c9cc5a8578bb

	public static void main(String[] args) {
		
		
		  String username = System.getenv("P2_USERNAME"); 
		  String url =  System.getenv("P2_URL"); 
		  String password = System.getenv("P2_PASSWORD");
		 
		
		System.out.println(username + " " + password + " " + url);
		
		
		  SessionFactory sf = ConnectionUtil.getSessionFactory();
		  Session s = sf.openSession(); 
		  System.out.println(s.getStatistics()); 
		  s.close();
		 

		/*
		 * AdminDAO adminDAO = new AdminDAOImpl(); CredsDAO credsDAO = new
		 * CredsDAOImpl(); TierDAO tierDAO = new TierDAOImpl();
		 * 
		 * // create Admin creds Credentials shaneCreds = new Credentials(1, "shane",
		 * "dog1234", "Tigger"); Credentials shawnCreds = new Credentials(2, "shawn",
		 * "cat1234", "Spot"); Credentials pruthaCreds = new Credentials(3, "prutha",
		 * "fish1234", "Flipper"); Credentials debbieCreds = new Credentials(4,
		 * "debbie", "none1234", "Callie");
		 * 
		 * // create Admin Admin shane = new Admin(1, shaneCreds, "Shane", ""); Admin
		 * shawn = new Admin(2, shawnCreds, "Shawn", ""); Admin prutha = new Admin(3,
		 * pruthaCreds, "Prutha", ""); Admin debbie = new Admin(4, debbieCreds,
		 * "Debbie", "");
		 * 
		 * // create Tier table // BASIC, PREMIUM, MODERATOR // Tier basic = new Tier(1,
		 * userTier.BASIC); Tier premimum = new Tier(2, UserTier.PREMIUM); Tier mod =
		 * new Tier(3, UserTier.MODERATOR); Tier basic = new Tier(1, UserTier.BASIC);
		 * 
		 * // putting in table on DB basic = tierDAO.createTier(basic); premimum =
		 * tierDAO.createTier(premimum); mod = tierDAO.createTier(mod);
		 * 
		 * shane = adminDAO.createAdmin(shane); shawn = adminDAO.createAdmin(shawn);
		 * prutha = adminDAO.createAdmin(prutha); debbie = adminDAO.createAdmin(debbie);
		 * 
		 * credsDAO.createCreds(shaneCreds); credsDAO.createCreds(shawnCreds);
		 * credsDAO.createCreds(pruthaCreds); credsDAO.createCreds(debbieCreds);
		 */
	}
}
