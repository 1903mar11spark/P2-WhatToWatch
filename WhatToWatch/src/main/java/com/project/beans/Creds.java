package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDS")
public class Creds {
	
	//CONSTRUCTORS
	public Creds() {
		super();
	}
	

	
	public Creds(String username, String password) {
		super();
		this.username=username;
		this.password=password;
	}

	public Creds(int credsId, String password, String username,  Users user) {
		super();
		this.credsId=credsId;
		this.user=user;
		this.username=username;
	}


	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsSequence")
	@SequenceGenerator(allocationSize=1, name="credsSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private Users user;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;

	
	
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
	

	//TO STRING METHOD
	@Override
	public String toString() {
		return "Creds [credsId=" + credsId + ", user " + user + ", username=" + username + ", password=" + password + "]";
	}



	





}
