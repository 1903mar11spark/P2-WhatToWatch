package com.project;

import org.hibernate.SessionFactory;

import com.project.util.ConnectionUtil;

public class Driver {
	
	public static void main(String[] args) {
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		
	}
}




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
