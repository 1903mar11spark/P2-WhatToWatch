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
	
	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="adminSequence")
	@SequenceGenerator(allocationSize=1, name="adminSequence", sequenceName="SQ_ADMIN_PK")
	@Column(name="ADMIN_ID")
	private int admindId;
	
	@OneToOne 
	@JoinColumn(name="CREDS_ID")
	private Creds creds;	
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;

	//CONSTRUCTORS 
	public Admin(int admindId, Creds creds, String firstname, String lastname) {
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
	
	//TO STRING METHOD
	@Override
	public String toString() {
		return "Admin [admindId=" + admindId + ", creds=" + creds + ", firstname=" + firstname + ", lastname=" + lastname
				+ "]";
	}
	
}
