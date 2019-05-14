package com.project.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {

	
	private ConnectionUtil() {
		super();
	}
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Properties prop = new Properties();
			InputStream in = ConnectionUtil.class.getClassLoader().getResourceAsStream("config.properties");
			try {
				prop.load(in);
			} catch(IOException e1) {
				e1.printStackTrace();
			}
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				System.out.println("Error: unable to laod driver class!!!!!!!");
			}
			Configuration c = new Configuration();
			// grab credentials and url from environment variables
			c.setProperty("hibernate.connection.username", System.getenv("HIB_DB_USERNAME"));
			c.setProperty("hibernate.connection.password", System.getenv("HIB_DB_PASSWORD"));
			c.setProperty("hibernate.connection.url", System.getenv("HIB_DB_URL"));
			c.configure(); // by default, looking hibernate.cfg.xml in src/main/resources
			
			sessionFactory = c.buildSessionFactory();
		}
		return sessionFactory;
	}
}
