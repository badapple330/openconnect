package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleSelectDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleSelectAction extends ActionSupport {

	private List<ScheduleSelectDTO> list = new ArrayList<ScheduleSelectDTO>();

	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();

		list = dao.select();
		if (!(list == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<ScheduleSelectDTO> getList() {
		return list;
	}

	public void setList(List<ScheduleSelectDTO> list) {
		this.list = list;
	}




}