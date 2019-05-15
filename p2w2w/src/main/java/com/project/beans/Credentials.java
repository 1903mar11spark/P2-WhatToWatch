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
@Table(name="CREDENTIALS")
public class Credentials {
	
	public Credentials() {
		super();
	}
	
	public Credentials(String username, String password) {
		super();
		this.username=username;
		this.password=password;
	}
	
	public Credentials(int credId, Users user, String username, String password) {
		super();
		this.credId = credId;
		this.user = user;
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="credentialsSequence")
	@SequenceGenerator(allocationSize=1, name="credentialsSequence", sequenceName="SQ_CRED_PK")
	@Column(name="CRED_ID")
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
