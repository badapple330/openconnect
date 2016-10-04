package com.internousdev.rewrite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.rewrite.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserDelete extends ActionSupport{

	private List<Integer> checkList=new ArrayList<Integer>();

	public String execute() throws SQLException{
		String result =ERROR;
		AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		int count = 0;
		for ( int i = 0; i < checkList.size(); ++i ) {
			count = dao.delete(checkList.get( i ));
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

}
