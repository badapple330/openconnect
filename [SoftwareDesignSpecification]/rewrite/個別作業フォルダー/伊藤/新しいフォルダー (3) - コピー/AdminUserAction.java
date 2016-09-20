package com.internousdev.rewrite.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dao.AdminUserDAO;
import com.internousdev.rewrite.dto.AdminUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport{



	private List<AdminUserDTO>UserList=new ArrayList<AdminUserDTO>();

	public String execute() {
		String result = "error";
		AdminUserDAO dao = new AdminUserDAO();

		UserList = dao.select();
		if(!(UserList == null)){
			result = SUCCESS;
		}return result;
	}

	public List<AdminUserDTO> getUserList() {
		return UserList;
	}

	public void setUserList(List<AdminUserDTO> userList) {
		UserList = userList;
	}

}

