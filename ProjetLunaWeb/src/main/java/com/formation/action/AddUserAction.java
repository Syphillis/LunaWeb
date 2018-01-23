package com.formation.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.formation.persistence.User;
import com.formation.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace(value = "/")
@Action(value = "addUser", results = { @Result(name = "success",type = "tiles", location = "forms") })
public class AddUserAction extends ActionSupport implements ModelDriven<User> {

	@Autowired
	private UserService userService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user = new User();

	private List<User> models = null;

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public void setModels() {
		models = userService.getAllUser();
	}

	public List<User> getModels() {
		return models;
	}

	public String execute() {
		userService.updateUser(user);
		setModels();

		return SUCCESS;
	}
}
