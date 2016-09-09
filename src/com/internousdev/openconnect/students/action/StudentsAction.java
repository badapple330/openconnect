/**
 *
 */
package com.internousdev.openconnect.books.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;
public class StudentsAction extends ActionSupport{

	private List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();

	public String execute() {
		String result = ERROR;
		StudentsDAO dao = new StudentsDAO();

		studentsList = dao.select();
		if (!(studentsList == null)) {
			result = SUCCESS;
		}
		return result;
	}

		public List<StudentsDTO> getStudentsList() {
			return studentsList;
		}




}