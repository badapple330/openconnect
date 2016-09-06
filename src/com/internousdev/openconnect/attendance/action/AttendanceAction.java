/**
 *
 */
package com.internousdev.openconnect.attendance.action;

import java.util.ArrayList;

import com.internousdev.openconnect.attendance.dao.AttendanceDAO;
import com.internousdev.openconnect.attendance.dao.AttendanceUpDAO;
import com.internousdev.openconnect.attendance.dto.AttendanceDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class AttendanceAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = -7346242933265314489L;
	/**
	 * @param args
	 */
	private String date;
	private int id;
	private int attendance;
	private int interview;
	private ArrayList<AttendanceDTO>list=new ArrayList<AttendanceDTO>();
	private String errorSelect;
	private String resultUpdate;

	public String execute(){
		String result=ERROR;
		AttendanceUpDAO dao=new AttendanceUpDAO();
		AttendanceDTO dto=new AttendanceDTO();

		dto.setDate(date);
		dto.setId(id);
		dto.setAttendance(attendance);
		dto.setInterview(interview);

		try{
			if(dao.update(dto)>0){
				resultUpdate="更新に成功しました";
				result=SUCCESS;
			}else{
				resultUpdate="更新に失敗しました";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		select();
		return result;
	}

	private void select(){
		AttendanceDAO dao=new AttendanceDAO();
		dao.selectAll();
		list=dao.getList();
		if(list.size()==0){
			errorSelect="データがありません";
		}
	}

	public String getDate(){
		return date;
	}

	public void setDate(String date){
		this.date=date;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public int getAttendance(){
		return attendance;
	}
	public void setAttendance(int attendance){
		this.attendance=attendance;
	}

	public int getInterview(){
		return interview;
	}
	public void setInterview(int interview){
		this.interview=interview;
	}

	public String getErrorSelect() {
		return errorSelect;
	}
	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}

	public String getResultUpdate() {
		return resultUpdate;
	}
	public void setResultUpdate(String resultUpdate) {
		this.resultUpdate = resultUpdate;
	}

}