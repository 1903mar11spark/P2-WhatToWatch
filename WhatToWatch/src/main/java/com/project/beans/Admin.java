package com.project.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="ADMIN")
public class Admin {
	
<<<<<<< HEAD
	public Admin() {
		super();
	}
	
	public Admin(int admindId, Credentials creds, String firstname, String lastname) {
		super();
		this.admindId = admindId;
		this.creds = creds;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
=======
	//VARIABLES & COLUMNS
>>>>>>> 188ce81835753e10362237c3bdf587cf4b0ff363
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="adminSequence")
	@SequenceGenerator(allocationSize=1, name="adminSequence", sequenceName="SQ_ADMIN_PK")
	
	@Column(name="ADMIN_ID")
	private int admindId;
	
	@Column(name="CREDS_ID")
	private Credentials creds;	
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;

	//CONSTRUCTORS 
	public Admin(int admindId, Credentials creds, String firstname, String lastname) {
		super();
		this.admindId = admindId;
		this.creds = creds;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Admin() {
		super();
	}

	//GETTERS AND SETTERS
	public int getAdmindId() {
		return admindId;
	}

	public void setAdmindId(int admindId) {
		this.admindId = admindId;
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
	
	//TO STRING METHOD
	@Override
	public String toString() {
		return "Admin [admindId=" + admindId + ", creds=" + creds + ", firstname=" + firstname + ", lastname=" + lastname
				+ "]";
	}
	
}
