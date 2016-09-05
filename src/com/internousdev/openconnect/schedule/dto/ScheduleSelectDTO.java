package com.internousdev.openconnect.schedule.dto;

import java.sql.Date;

public class ScheduleSelectDTO {
	private int id;
	private Date start_day;
	private Date end_day;
	private String title;
	private String content;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Date getStart_day() {
		return start_day;
	}
	public void setStart_day(Date start_day) {
		this.start_day = start_day;
	}
	public Date getEnd_day() {
		return end_day;
	}
	public void setEnd_day(Date end_day) {
		this.end_day = end_day;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}



}