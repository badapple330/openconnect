package com.internousdev.openconnect.schedule.action;

import java.sql.SQLException;

import com.internousdev.openconnect.schedule.dao.ScheduleDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleDeleteAction extends ActionSupport{

	private int scheduleId;
	public String execute() throws SQLException{

	String result =ERROR;    //削除の判定
	   ScheduleDeleteDAO dao = new ScheduleDeleteDAO();
	   int count = 0;
	   count = dao.delete(scheduleId);

		if(count > 0){
			   result = SUCCESS;
		}else{
//			errordelete = (getText("そのユーザー名は該当しません"));
		}

	   return result;
}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}



}
