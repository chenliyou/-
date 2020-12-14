package com.cly.ssh.action;



import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;


import com.cly.ssh.model.User;
import com.cly.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements ServletRequestAware {
	private User user;
	private HttpServletRequest request;
	private UserService userService;

	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String userLogin() {
		if(user.getUserName().equals("") || user.getPassword().equals("")) {
			return ERROR;
		}{
			User resultUser = userService.userLogin(user);
			if(resultUser!=null) {
				return SUCCESS;
			}{
				return ERROR;
			}
		}
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	
	
}
