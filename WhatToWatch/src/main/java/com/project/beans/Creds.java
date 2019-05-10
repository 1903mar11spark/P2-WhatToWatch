package com.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CREDS")
public class Creds {
	
	//CONSTRUCTORS
	public Creds() {
		super();
	}
	
	public Creds( String username, String answer) {
		super();
		this.username=username;
		this.answer=answer;
	}

	public Creds(int credsId, String username, String password, String answer) {
		super();
		this.credsId=credsId;
		this.username=username;
		this.password=password;
		this.answer=answer;
	}

	//VARIABLES & COLUMNS
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "credsSequence")
	@SequenceGenerator(allocationSize=1, name="credsSequence", sequenceName="SQ_CREDS_PK")
	@Column(name="CREDS_ID")
	private int credsId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ANSWER")
	private String answer;
	
	
	//GETTERS AND SETTERS
	public int getCredsId() {
		return credsId;
	}

	public void setCredsId(int credsId) {
		this.credsId = credsId;
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
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


	//TO STRING METHOD
	@Override
	public String toString() {
		return "Creds [credsId=" + credsId + ", username=" + username + ", password=" + password + ", answer="
				+ answer + "]";
	}

	





}
