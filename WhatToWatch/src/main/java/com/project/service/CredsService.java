package com.project.service;

import org.springframework.stereotype.Service;

import com.project.beans.Credentials;
import com.project.dao.CredsDAO;

@Service
public class CredsService {

	private CredsDAO credsDAO;

	public CredsService(CredsDAO credsDAO) {
		this.credsDAO = credsDAO;
	}

	public void createCreds(Credentials creds) {
		credsDAO.createCreds(creds);
	}

	public void updateCreds(Credentials creds) {
		credsDAO.updatePassword(creds);
	}

	/*
	 * public void deleteCreds(Credentials creds) { credsDAO.deleteCreds(creds); }
	 */

}
