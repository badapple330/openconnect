package com.internousdev.openconnect.students.action;
import com.internousdev.openconnect.students.dao.StudentsDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class StudentsDeleteAction extends ActionSupport {

	private int users_id;

	public String execute() {
		StudentsDeleteDAO dao = new StudentsDeleteDAO();
		String result = ERROR;
		int count = 0;
		count =dao.delete(users_id);
		if(count > 0){
			result = SUCCESS;
		}
		return result;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

}
