package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	//CONSTRUCTORS	
	public Users() {
		super(); 
	}
	
	
	
	public Users(int userId, Creds creds, String accountType, String firstname, String lastname) {
		super();
		this.userId = userId;
		this.creds = creds;
		this.accountType = accountType;
		this.firstname = firstname;
		this.lastname = lastname;
	}



	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "userSequence")
	@SequenceGenerator(allocationSize=1, name="userSequence", sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int userId;
	
	@OneToOne
	@JoinColumn(name="CREDS_ID")
	private Creds creds;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	
	
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

	public String getAccountType() {
		return accountType;
	}

	public void setaccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//TO STRING METHOD
	@Override
	public String toString() {
		return "User [userId=" + userId + ", creds=" + creds + "accountType=" + accountType + 
				", firstname=" + firstname
				+ ", lastname=" + lastname +"]";
	}


}
