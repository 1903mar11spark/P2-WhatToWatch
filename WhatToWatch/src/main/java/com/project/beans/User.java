package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	public User() {
		super();
	}
	
	public User(int userId, Credentials creds, Tier tier, String firstname, String lastname, String email) {
		super();
		this.userId = userId;
		this.creds = creds;
		this.tier=tier;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	@Id// indecates a primary key
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uIdSequence")
	@SequenceGenerator(allocationSize=1, name="uIdSequence", sequenceName="SQ_U_PK")
	@Column(name="USER_ID")
	private int userId;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CREDS_ID")
	private Credentials creds;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="TIER_ID")
	private Tier tier;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	

	@Column(name="EMAIL")
	private String email;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Credentials getCreds() {
		return creds;
	}

	public void setCreds(Credentials creds) {
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", creds=" + creds + "Tier=" + tier + 
				", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + "]";
	}

	public Tier getTier() {
		return tier;
	}

	public void setTier(Tier tier) {
		this.tier = tier;
	}
	
	
	
	
	

}
