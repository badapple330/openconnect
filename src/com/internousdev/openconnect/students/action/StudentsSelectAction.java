package com.internousdev.openconnect.students.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsSelectDAO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;



public class StudentsSelectAction extends ActionSupport {

	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
    private String search = "";
    private String errorMsg;



	public String execute(){

    String result = ERROR;
    StudentsSelectDAO dao = new StudentsSelectDAO();
    studentsList = dao.select(search);

	if (studentsList.size() != 0) {
		result = SUCCESS;
	} else {
		errorMsg = "該当する情報は存在しません";
	}

	return result;
	}



	public String getSearch() {
		return search;
	}



	public String getErrorMsg() {
		return errorMsg;
	}



	public List<StudentsDTO> getStudentsList() {
		return studentsList;
	}



	public void setStudentsList(List<StudentsDTO> studentsList) {
		this.studentsList = studentsList;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}

