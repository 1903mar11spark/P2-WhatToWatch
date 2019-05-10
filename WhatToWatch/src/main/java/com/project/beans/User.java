package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "userSequence")
	@SequenceGenerator(allocationSize=1, name="userSequence", sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int userId;
	
	@OneToOne
	@JoinColumn(name="CREDS_ID")
	private Creds creds;
	
	@Column(name="TIER")
	@Enumerated(EnumType.STRING)
	private Tier tier;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="EMAIL")
	private String email;
	
	
	//CONSTRUCTORS
	public User() {
		super();
	}
	
	public User(int userId, Creds creds, Tier tier, String firstname, String lastname, String email) {
		super();
		this.userId = userId;
		this.creds = creds;
		this.tier= tier;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	//GETTERS AND SETTERS
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Creds getCreds() {
		return creds;
	}

	public void setCreds(Creds creds) {
		this.creds = creds;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}
	
	//TO STRING METHOD
	@Override
	public String toString() {
		return "User [userId=" + userId + ", creds=" + creds + "Tier=" + tier + 
				", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + "]";
	}


}
