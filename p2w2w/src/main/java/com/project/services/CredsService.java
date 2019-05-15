package com.project.services;

import org.springframework.stereotype.Service;

import com.project.beans.Credentials;
import com.project.dao.CredsDAO;

@Service
public class CredsService {
	
	private CredsDAO credsDAO;
	
	public void createCreds(Credentials creds) {
		credsDAO.createCreds(creds);
	}
	public void updateCreds(Credentials creds) {
		credsDAO.updateCreds(creds);
	}

}
