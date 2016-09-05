/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AttendanceSelectAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 671961516965709160L;

	private AttendanceDTO dto;
	private String attendanceDate;
	//private String errorSelect;
	private String dateNotFound;
	private ArrayList<AttendanceDTO>list=new ArrayList<AttendanceDTO>();

	public String execute(){
		String result=ERROR;
		AttendanceDAO dao=new AttendanceDAO();

		if(attendanceDate.equals("")){
			dateNotFound="表示する日付を入力してください。";
			return result;

		}
		try{
			if(dao.select(attendanceDate)){

				dto=dao.getList().get(0);
				result=SUCCESS;
			}else{
				dateNotFound="DATE:"+attendanceDate+"のデータはありません";
			}
		}catch(Exception e ){
				return result;
			}

		return result;
}


//全部を検索して表示
//	private String errorSelect;
//	private ArrayList<UpdateAttendanceDTO>list=new ArrayList<UpdateAttendanceDTO>();
//
//	public String execute(){
//		UpdateAttendanceDAO dao=new UpdateAttendanceDAO();
//
//		if(dao.selectAll()){
//			list=dao.getList();
//
//		}else{
//			errorSelect="データがありません";
//		}
//		return SUCCESS;
//	}

	public ArrayList<AttendanceDTO> getList(){
		return list;
	}

	public void setList(ArrayList<AttendanceDTO>list){
		this.list=list;
	}

//	public String getErrorSelect(){
//		return errorSelect;
//	}
//	public void setErrorSelect(String errorSelect){
//		this.errorSelect=errorSelect;
//	}

	public String getDateNotFound(){
		return dateNotFound;
	}
	public void setDateNotFound(String dateNotFound){
		this.dateNotFound=dateNotFound;
	}

	public AttendanceDTO getDto(){
		return dto;
	}
	public void setDto(AttendanceDTO dto){
		this.dto=dto;
	}

	public String getAttendanceDate(){
		return attendanceDate;
	}
	public void setAttendanceDate(String attendanceDate){
		this.attendanceDate=attendanceDate;
	}

}
