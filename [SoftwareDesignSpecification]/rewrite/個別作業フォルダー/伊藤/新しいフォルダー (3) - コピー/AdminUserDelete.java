package com.internousdev.rewrite.action;

import java.sql.SQLException;

import com.internousdev.rewrite.dao.AdminUserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserDelete extends ActionSupport{

	private int check;

	public String execute() throws SQLException{


		   //削除の判定
		   String result =ERROR;
		   AdminUserDeleteDAO dao = new AdminUserDeleteDAO();
		   int count = 0;
		   count = dao.delete(check);

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


}
