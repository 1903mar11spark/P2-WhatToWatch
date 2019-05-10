package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDS")
public class Credentials {
	
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
	
	@Column(name="FAV_CHILDHOOD_PET")
	private String favoriteChildhoodPet;

	private User user;
	
	//CONSTRUCTORS
	public Credentials() {
		super();
	}

	
	public Credentials(int credsId, String username, String password) {
		super();
		this.credsId=credsId;
		this.username=username;
		this.password=password;
	}
	
	public Credentials( String username, String favoriteChildhoodPet) {
		super();
		this.username=username;
		this.favoriteChildhoodPet=favoriteChildhoodPet;
	}
	
	public Credentials(int credsId, String username, String password, String favoriteChildhoodPet) {
		super();
		this.credsId = credsId;
		this.username = username;
		this.password = password;
		this.favoriteChildhoodPet = favoriteChildhoodPet;
	}

<<<<<<< HEAD
	@Id// indecates a primary key
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsIdSequence")
	@SequenceGenerator(allocationSize=1, name="userIdSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	

	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	

	@Column(name="FAV_CHILDHOOD_PET")
	private String favoriteChildhoodPet;

	
=======
	//GETTERS AND SETTERS
>>>>>>> 188ce81835753e10362237c3bdf587cf4b0ff363
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

<<<<<<< HEAD

=======
	public User getUser() {
		return user;
	}
>>>>>>> 188ce81835753e10362237c3bdf587cf4b0ff363


	
	//TO STRING METHOD
	@Override
	public String toString() {
		return "Credentials [credsId=" + credsId + ", username=" + username + ", password="
				+ password + "]";
	}


}
