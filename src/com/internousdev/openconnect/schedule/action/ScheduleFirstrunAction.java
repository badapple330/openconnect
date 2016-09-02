package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleFirstrunDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleFirstrunAction extends ActionSupport {

	private List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();


	public String execute() {
		String result = ERROR;
		ScheduleFirstrunDAO dao = new ScheduleFirstrunDAO();

		schedulelist = dao.select(result);
		//daoのresultをいれる
		if (schedulelist != null) {
			//nullじゃなかったら
			result = SUCCESS;
		}
		return result;
	}


	public List<ScheduleSelectDTO> getSchedulelist() {
		return schedulelist;
	}


	public void setSchedulelist(List<ScheduleSelectDTO> schedulelist) {
		this.schedulelist = schedulelist;
	}

}
