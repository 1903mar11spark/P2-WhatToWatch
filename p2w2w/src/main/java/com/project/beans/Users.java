package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	public Users() {
		super();
	}

	public Users(int usersId, String firstname, String lastname, AccountType accountType, Credentials creds) {
		super();
		this.usersId = usersId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountType = accountType;
		this.creds = creds;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usersSequence")
	@SequenceGenerator(allocationSize=1, name="usersSequence", sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int usersId;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	
	@Column(name="ACCOUNT_TYPE")
	private AccountType accountType;
	
	@OneToOne
	@JoinColumn(name="CRED_ID")
	private Credentials creds;

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
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

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Credentials getCreds() {
		return creds;
	}

	public void setCreds(Credentials creds) {
		this.creds = creds;
	}

	@Override
	public String toString() {
		return "Users [usersId=" + usersId + ", firstname=" + firstname + ", lastname=" + lastname + ", accountType="
				+ accountType +  "]";
	}

	

	
	
	
}
