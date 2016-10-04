package com.internousdev.rewrite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dao.AdminUserEditDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserEdit extends ActionSupport{

	private List<Integer> checkList=new ArrayList<Integer>();
	private List<String> nameList=new ArrayList<String>();
	private List<String> emailList=new ArrayList<String>();

	public String execute() throws SQLException{

		String result =ERROR;
		AdminUserEditDAO dao = new AdminUserEditDAO();
		int count = 0;
		for ( int i = 0; i < checkList.size(); ++i ) {
			count = dao.update(nameList.get( i ),emailList.get( i ),checkList.get( i ));
		}
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	public List<Integer> getCheckList() {
		return checkList;
	}

	public void setCheckList(List<Integer> checkList) {
		this.checkList = checkList;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<String> getEmailList() {
		return emailList;
	}

	public void setEmailList(List<String> emailList) {
		this.emailList = emailList;
	}

}
