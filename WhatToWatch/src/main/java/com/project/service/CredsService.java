package com.project.service;

import org.springframework.stereotype.Service;

import com.project.beans.Creds;
import com.project.dao.CredsDAO;

@Service
public class CredsService {
	
	/*
	 * 	public void createCreds(Creds creds);
	public void updateCreds(Creds creds);
	public void deleteCreds(Creds creds);
	 */

	private CredsDAO credsDAO;

	public CredsService(CredsDAO credsDAO) {
		this.credsDAO = credsDAO;
	}

	public void createCreds(Creds creds) {
		credsDAO.createCreds(creds);
	}

	public void updateCreds(Creds creds) {
		credsDAO.updateCreds(creds);
	}
	
	public void deleteCreds(Creds creds) {
		credsDAO.deleteCreds(creds);
	}



}
