package com.project;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.project.beans.AccountType;
import com.project.beans.Credentials;
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
		
		Users u = new Users(1,"Sally", "Green",AccountType.ADMIN,  null);
		Credentials c = new Credentials(1, u, "sally.green", "dog1234");
		
		Users u2 = new Users(2, "Benny", "Smith", AccountType.BASIC, null);
		Users u3 = new Users(3, "Jenny", "Jones", AccountType.MODERATOR, null);
		Users u4 = new Users(4, "Sam", "Smith", AccountType.PREMIUM, null);
		
		u.setCreds(c);
		ud.createUser(u2);
		ud.createUser(u3);
		ud.createUser(u4);
		
		ud.createUser(u);
		cd.createCreds(c);
		ud.updateUser(u);
		
		List<Users> users = new ArrayList<>();
		users = ud.getAllUsers();
		
		System.out.println(users);
		
		
		
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
