package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDS")
public class Creds {
	
<<<<<<< HEAD:WhatToWatch/src/main/java/com/project/beans/Credentials.java
=======
	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsSequence")
	@SequenceGenerator(allocationSize=1, name="credsSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ANSWER")
	private String answer;
	
	@OneToOne 
	@JoinColumn(name="USER_ID")
	private User user;
	
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9:WhatToWatch/src/main/java/com/project/beans/Creds.java
	//CONSTRUCTORS
	public Creds() {
		super();
	}

	public Credentials(int credsId, String username, String password) {
		super();
		this.credsId=credsId;
		this.username=username;
		this.password=password;
	}
	
<<<<<<< HEAD:WhatToWatch/src/main/java/com/project/beans/Credentials.java
	public Credentials( String username, String answer) {
=======
	public Creds(User user, String username, String answer) {
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9:WhatToWatch/src/main/java/com/project/beans/Creds.java
		super();
		this.username=username;
		this.answer=answer;
	}
	
<<<<<<< HEAD:WhatToWatch/src/main/java/com/project/beans/Credentials.java
	public Credentials(int credsId, String username, String password, String answer) {
=======
	public Creds(int credsId, User user, String username, String password) {
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9:WhatToWatch/src/main/java/com/project/beans/Creds.java
		super();
		this.credsId = credsId;
		this.username = username;
		this.password = password;
		this.answer = answer;
	}

	//VARIABLES & COLUMNS
	@Id// indecates a primary key
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsIdSequence")
	@SequenceGenerator(allocationSize=1, name="userIdSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	

	@Column(name="ANSWER")
	private String answer;

	//GETTERS AND SETTERS
	public int getCredsId() {
		return credsId;
	}

	public void setCredsId(int credsId) {
		this.credsId = credsId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD:WhatToWatch/src/main/java/com/project/beans/Credentials.java

	@Override
	public String toString() {
		return "Credentials [credsId=" + credsId + ", username=" + username + ", password=" + password + ", answer="
				+ answer + "]";
=======
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	//TO STRING METHOD
	@Override
	public String toString() {
		return "Creds [credsId=" + credsId + ", username=" + username + ", password=" + password + ", answer="
				+ answer + ", user=" + user + "]";
>>>>>>> 48f04d1e76a5f6184c9bb76a03e8e7bb6c05c9d9:WhatToWatch/src/main/java/com/project/beans/Creds.java
	}

	





}
