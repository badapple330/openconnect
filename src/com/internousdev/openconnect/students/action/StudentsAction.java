/**
 *
 */
package com.internousdev.openconnect.students.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dao.StudentsDAO;
import com.internousdev.openconnect.students.dto.StudentsSearchDTO;
import com.opensymphony.xwork2.ActionSupport;
public class StudentsAction extends ActionSupport{

	private List<StudentsSearchDTO> studentsList = new ArrayList<StudentsSearchDTO>();

	public String execute() {
		String result = ERROR;
		StudentsDAO dao = new StudentsDAO();

		studentsList = dao.select();
		if (!(studentsList == null)) {
			result = SUCCESS;
		}
		return result;
	}

		public List<StudentsSearchDTO> getStudentsList() {
			return studentsList;
		}
		public void setStudentsList(List<StudentsSearchDTO> studentsList) {
			this.studentsList = studentsList;
		}




}