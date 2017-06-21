package com.internousdev.openconnect.schedule.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.schedule.dao.GoScheduleSelectDAO;
import com.internousdev.openconnect.schedule.dto.ScheduleDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoScheduleSelectAction extends ActionSupport implements SessionAware{

	private List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();
	private List<ScheduleDTO> teamList = new ArrayList<ScheduleDTO>();

	private int userId;

	private String teamName;

	private Map<String,Object> session;

	public String execute(){
		String result = ERROR;
		int userId = (int) session.get("userId");
		GoScheduleSelectDAO dao = new GoScheduleSelectDAO();
		GoScheduleSelectDAO dao2 = new GoScheduleSelectDAO();
		scheduleList = dao.select(userId);
		teamList = dao2.select2();
		result = SUCCESS;


		return result;
	}

	/**
	 * scheduleListを取得します。
	 * @return scheduleList
	 */
	public List<ScheduleDTO> getScheduleList() {
	    return scheduleList;
	}

	/**
	 * scheduleListを設定します。
	 * @param scheduleList scheduleList
	 */
	public void setScheduleList(List<ScheduleDTO> scheduleList) {
	    this.scheduleList = scheduleList;
	}

	/**
	 * teamListを取得します。
	 * @return teamList
	 */
	public List<ScheduleDTO> getTeamList() {
	    return teamList;
	}

	/**
	 * teamListを設定します。
	 * @param teamList teamList
	 */
	public void setTeamList(List<ScheduleDTO> teamList) {
	    this.teamList = teamList;
	}

	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public int getUserId() {
	    return userId;
	}

	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(int userId) {
	    this.userId = userId;
	}

	/**
	 * teamを取得します。
	 * @return team
	 */
	public String getTeam() {
	    return teamName;
	}

	/**
	 * teamを設定します。
	 * @param team team
	 */
	public void setTeam(String teamName) {
	    this.teamName = teamName;
	}

	/**
	 * teamNameを取得します。
	 * @return teamName
	 */
	public String getTeamName() {
	    return teamName;
	}

	/**
	 * teamNameを設定します。
	 * @param teamName teamName
	 */
	public void setTeamName(String teamName) {
	    this.teamName = teamName;
	}

	/**
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String,Object> getSession() {
	    return session;
	}

	/**
	 * sessionを設定します。
	 * @param session session
	 */
	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}


}

