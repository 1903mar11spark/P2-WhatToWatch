package com.project.controlls;



import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.beans.Admin;
import com.project.beans.Credentials;
import com.project.beans.User;
import com.project.dao.AdminDAO;
import com.project.dao.CredsDAO;
import com.project.dao.UserDAO;

@Controller
public class LoginController {
		
	UserDAO userDAO = new UserDAOImpl();
	CredsDAO credsDAO = new CredsDAOImpl();
	AdminDAO adminDAO = new AdminDAOImpl();
	User user = new User();	
	Admin admin = new Admin();
	
	@RequestMapping("/profile")
	public String display(HttpRequest req, Model m) {
		String username = req.getParamater("username");
		String password = req.getParamater("password");
		
		Credentials creds = new Credentials(username, password);
		
		if(credsDAO.loginExsit(creds)) {
			user = new User(userDAO.getUserByCreds(creds));
			if(user == null) {
				admin = new Admin(adminDAO.getAdminByCreds(creds));
				String  msg = "Hello " + admin.getFirstname();
				m.addAttribute("message", msg);
				return "profile";
			}else {
				String  msg = "Hello " + admin.getFirstname();
				m.addAttribute("message", msg);
				return "profile";
			}
		}else {
			String msg = "Sorry " + username + ". You entered an incorrect username and/or password.";
			m.addAttribute("message", msg);
			return "errorpage";
		}
		
		
		;		
		
		
	}

}
