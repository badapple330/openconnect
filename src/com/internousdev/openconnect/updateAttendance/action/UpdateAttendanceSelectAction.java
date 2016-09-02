/**
 *
 */
package com.internousdev.openconnect.updateAttendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.updateAttendance.dao.UpdateAttendanceDAO;
import com.internousdev.openconnect.updateAttendance.dto.UpdateAttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class UpdateAttendanceSelectAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 671961516965709160L;

//	private UpdateAttendanceDTO dto;
//	private String attendanceDate;
//	private String errorSelect;
//	private String dateNotFound;
//	private ArrayList<UpdateAttendanceDTO>list=new ArrayList<UpdateAttendanceDTO>();
//
//	public String execute(){
//		String result=ERROR;
//		UpdateAttendanceDAO dao=new UpdateAttendanceDAO();
//
//		if(attendanceDate.equals("")){
//			dateNotFound="表示する日付を入力してください。";
//			return result;
//
//		}
//		try{
//			if(dao.select(Integer.parseInt(attendanceDate)))
//			errorSelect="データがありません";
//		}
//		return SUCCESS;
//	}

	private String errorSelect;
	private ArrayList<UpdateAttendanceDTO>list=new ArrayList<UpdateAttendanceDTO>();

	public String execute(){
		UpdateAttendanceDAO dao=new UpdateAttendanceDAO();

		if(dao.selectAll()){
			list=dao.getList();
		}else{
			errorSelect="データがありません";
		}
		return SUCCESS;
	}

	public ArrayList<UpdateAttendanceDTO> getList(){
		return list;
	}

	public void setList(ArrayList<UpdateAttendanceDTO>list){
		this.list=list;
	}

	public String getErrorSelect(){
		return errorSelect;
	}
	public void setErrorSelect(String errorSelect){
		this.errorSelect=errorSelect;
	}

}
