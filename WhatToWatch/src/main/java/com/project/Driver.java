package com.project;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.Tier;
import com.project.beans.UserTier;
import com.project.dao.AdminDAO;
import com.project.dao.CredsDAO;
import com.project.dao.TierDAO;

public class Driver {
	
	//create and finalized Tiers and Admin Table
	
	AdminDAO adminDAO = new AdminDAOImpl();
	CredsDAO credsDAO = new CredsDAOImpl();
	TierDAO tierDAO = new TierDAOImpl();
	
	
	Admin shane = new Admin();
	Admin shawn = new Admin();
	Admin prutha = new Admin();
	Admin debbie = new Admin();
	
	Credentials shaneCreds =  new Credentials();
	Credentials shawnCreds =  new Credentials();
	Credentials pruthaCreds = new Credentials();
	Credentials debbieCreds = new Credentials();
	
	//create Admin creds
	//public Credentials(int credsId, String username, String password, String favoriteChildhoodPet) 
	shaneCreds = new Credentials(1, "shane", "dog1234", "Tigger");
	shawnCreds = new Credentials(2, "shawn", "cat1234", "Spot");
	pruthaCreds = new Credentials(3, "prutha", "fish1234", "Flipper");
	debbieCreds = new Credentials(4, "debbie", "none1234", "Callie");
	
	//create Admin
	//public Admin(int admindId, Credentials creds, String firstname, String lastname)
	shane = new Admin(1, shaneCreds, "Shane", "");
	shawn = new Admin(2, shawnCreds, "Shawn", "" );
	prutha = new Admin(3, pruthaCreds, "Prutha", "");
	debbie = new Admin(4, debbieCreds, "Debbie", "");	
	
	//create Tier table
	//public Tier(int tierId, UserTier userTier)
	//BASIC, PREMIUM, MODERATOR
	//Tier basic = new Tier(1, userTier.BASIC);
	Tier premimum = new Tier(2, UserTier.PREMIUM);
	Tier mod = new Tier(3, UserTier.MODERATOR);
	Tier basic = new Tier(1, UserTier.BASIC);
	
	//putting Tier in table on DB
	basic = tierDAO.createTier(basic);
	premimum = tierDAO.createTier(premimum);
	mod = tierDAO.createTier(mod);
	
	/* BatDAO bd = new BatDAOImpl(); 
	 * Bat b6 = new Bat(1,"Batty McBatFace", 20.0);
	 * b.setCave(new Cave(27, "Tampa", 8));
	 *  bd.updateBat(b6);
	 */
	shane = adminDAO.createAdmin(shane);
	shawn = adminDAO.createAdmin(shawn);
	prutha = adminDAO.createAdmin(prutha);
	debbie = adminDAO.createAdmin(debbie);
	
	shaneCreds = credsDAO.createCreds(shaneCreds);
	shawnCreds = credsDAO.createCreds(shawnCreds);
	pruthaCreds = credsDAO.createCreds(pruthaCreds);
	debbieCreds = credsDAO.createCreds(debbieCreds);	
}
