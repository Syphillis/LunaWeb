package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value = "/")
public class TemplateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Action(value = "welcomeLink", results = { @Result(name = "welcome", type = "tiles", location = "baseLayout") })
	public String welcome() {
		return "welcome";
	}

	@Action(value = "accueilLink", results = { @Result(name = "accueil", type = "tiles", location = "accueil") })
	public String accueil() {
		return "accueil";
	}
}
