package com.internousdev.rakugo.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class GoHeaderLogOutAction extends ActionSupport {
	public String execute() throws SQLException {
		return SUCCESS;
	}

}
