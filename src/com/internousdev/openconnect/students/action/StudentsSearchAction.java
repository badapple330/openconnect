package com.internousdev.openconnect.students.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsSearchDAO;
import com.internousdev.openconnect.students.dto.StudentsSearchDTO;
import com.opensymphony.xwork2.ActionSupport;



public class StudentsSearchAction extends ActionSupport {

	private List<StudentsSearchDTO> studentsList = new ArrayList<StudentsSearchDTO>();
    private String search = "";
    private String errorMsg;



	public String execute(){

    String result = ERROR;
    StudentsSearchDAO dao = new StudentsSearchDAO();
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



	public List<StudentsSearchDTO> getStudentsList() {
		return studentsList;
	}



	public void setStudentsList(List<StudentsSearchDTO> studentsList) {
		this.studentsList = studentsList;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}

