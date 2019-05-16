package com.project.services;

import org.springframework.stereotype.Service;

import com.project.beans.Creds;
import com.project.dao.CredsDAO;

@Service
public class CredsService {
	
	private CredsDAO credsDAO;
	
	public void createCreds(Creds creds) {
		credsDAO.createCreds(creds);
	}
	public void updateCreds(Creds creds) {
		credsDAO.updateCreds(creds);
	}

}
