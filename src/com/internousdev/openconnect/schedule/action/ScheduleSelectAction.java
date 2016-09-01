package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleSelectDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleSelectAction extends ActionSupport {

	private List<ScheduleSelectDTO> schedulelist = new ArrayList<ScheduleSelectDTO>();
	private String search;
	private String errorSelect;

	public String execute() {
		String result = ERROR;
		ScheduleSelectDAO dao = new ScheduleSelectDAO();

		schedulelist = dao.select(search);
		if (schedulelist.size() != 0) {
			result = SUCCESS;
		} else {
			errorSelect = (getText("データがありません"));
		}
		return result;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public List<ScheduleSelectDTO> getSchedulelist() {
		return schedulelist;
	}

	public void setSchedulelist(List<ScheduleSelectDTO> schedulelist) {
		this.schedulelist = schedulelist;
	}

	public String getErrorSelect() {
		return errorSelect;
	}

	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}




}