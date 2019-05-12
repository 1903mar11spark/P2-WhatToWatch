package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.beans.*;
import com.project.dao.*;

@Service 
public class CredsService {

	private CredsDAO credsDAO;
	
	@Autowired
	public CredsService(CredsDAO credsDAO) {
		this.credsDAO = credsDAO;
	}
	
	public List<Creds> allCreds(){
		return credsDAO.allCreds();
	}
	public Creds getCredsById(int credsId) {
		return credsDAO.getCredsById(credsId);
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
