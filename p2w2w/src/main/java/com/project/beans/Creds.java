package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDS")
public class Creds {
	
	public Creds() {
		super();
	}
	
	public Creds(String username, String password) {
		super();
		this.username=username;
		this.password=password;
	}
	
	public Creds(int credId, String password, String username,  Users user) {
		super();
		this.credId = credId;
		this.user = user;
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="credentialsSequence")
	@SequenceGenerator(allocationSize=1, name="credentialsSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credId;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private Users user;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;

	public int getCredId() {
		return credId;
	}

	public void setCredId(int credId) {
		this.credId = credId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Credentials [credId=" + credId +  ", username=" + username + ", password=" + password
				+ "]";
	}

	
	
	

}
