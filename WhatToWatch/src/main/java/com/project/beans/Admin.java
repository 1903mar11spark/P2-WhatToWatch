package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADMID")
public class Admin {
	
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
	
	@Id
	@Column(name="ADMID_ID")
	private int admindId;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CREDS_ID")
	private Credentials creds;	
	
	@Column(name="FIRSTNAME")
	private String firstname;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	
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
	public void setUsername(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Admin [admindId=" + admindId + ", creds=" + creds + ", firstname=" + firstname + ", lastname=" + lastname
				+ "]";
	}
	
	
	

}
