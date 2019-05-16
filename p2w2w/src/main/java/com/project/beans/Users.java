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

	public Users(int usersId,Creds creds,String accountType, String firstname, String lastname) {
		super();
		this.usersId = usersId;
		this.creds = creds;
		this.accountType = accountType;
		this.firstname = firstname;
		this.lastname = lastname;
		
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usersSequence")
	@SequenceGenerator(allocationSize=1, name="usersSequence", sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int usersId;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@OneToOne
	@JoinColumn(name="CREDS_ID")
	private Creds creds;

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

	public String getAccountType() {
		return accountType;
	}

	public void setTier(String accountType) {
		this.accountType = accountType;
	}

	public Creds getCreds() {
		return creds;
	}

	public void setCreds(Creds creds) {
		this.creds = creds;
	}

	@Override
	public String toString() {
		return "Users [usersId=" + usersId + ", accountType=" + accountType + ", firstname=" + firstname + ", lastname="
				+ lastname + ", creds=" + creds + "]";
	}

	

	

	
	
	
}
