package com.internousdev.rewrite.action;

import java.sql.SQLException;

import com.internousdev.rewrite.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserDelete extends ActionSupport{

	private int check;
	private int user_id;
	private String name;
	private String email;


	public String AdminDelete() throws SQLException{
		String result =ERROR;
		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		int count = 0;
		count = dao.delete(check);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	public String AdminEdit()throws SQLException{
		String result =ERROR;
		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		int count = 0;
		count = dao.update(name,email,user_id);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}


}
