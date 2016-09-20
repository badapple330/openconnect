package com.internousdev.rewrite.action;

import java.sql.SQLException;

import com.internousdev.rewrite.dao.AdminUserEditDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserEdit extends ActionSupport{

	private int check;
	private String name;
	private String email;

	public String execute() throws SQLException{

		 String result =ERROR;
		 AdminUserEditDAO dao = new AdminUserEditDAO();
		  int count = 0;
		  count = dao.update(name,email,check);
			if(count > 0){
				   result = SUCCESS;
			}
		   return result;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
