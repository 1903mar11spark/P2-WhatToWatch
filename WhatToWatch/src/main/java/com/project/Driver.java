package com.project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.beans.Creds;
import com.project.beans.Tier;
import com.project.beans.User;
import com.project.dao.CredsDAO;
import com.project.dao.CredsDAOImpl;
import com.project.dao.UserDAO;
import com.project.dao.UserDAOImpl;

public class Driver {

	private static SessionFactory sf;

	public static void main(String[] args) {

			UserDAO ud = new UserDAOImpl(sf);
			CredsDAO cd = new CredsDAOImpl(sf);
			Creds creds = new Creds( "cat", "dog");
			User user = new User(1, creds, Tier.BASIC, "Cat", "Dog", "cat@dog.com");
			cd.createCreds(creds);
			ud.createUser(user);
	
	}

}
