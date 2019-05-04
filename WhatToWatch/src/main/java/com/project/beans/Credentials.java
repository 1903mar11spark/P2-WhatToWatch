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
@Table(name="USER")
public class Credentials {

	public Credentials() {
		super();
	}
	
	public Credentials(User user, String username, String favoriteChildhoodPet) {
		super();
		this.user=user;
		this.username=username;
		this.favoriteChildhoodPet=favoriteChildhoodPet;
	}
	
	public Credentials(int credsId, User user, String username, String password) {
		super();
		this.credsId = credsId;
		this.user=user;
		this.username = username;
		this.password = password;
	}

	@Id// indecates a primary key
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsIdSequence")
	@SequenceGenerator(allocationSize=1, name="userIdSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CREDS_ID")
	private User user;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	

	@Column(name="FAV_CHILDHOOD_PET")
	private String favoriteChildhoodPet;

	
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


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	@Override
	public String toString() {
		return "Credentials [credsId=" + credsId + ", user=" + user + ", username=" + username + ", password="
				+ password + "]";
	}

	




}
