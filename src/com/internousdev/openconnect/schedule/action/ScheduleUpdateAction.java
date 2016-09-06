package com.internousdev.openconnect.schedule.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleUpdateAction extends ActionSupport {

	private List<Integer> scheduleIdList = new ArrayList<Integer>();
	private List<Date> scheduleStart_dayList = new ArrayList<Date>();
	private List<Date> scheduleEnd_dayList = new ArrayList<Date>();
	private List<String> scheduleTitleList = new ArrayList<String>();
	private List<String> scheduleContentList = new ArrayList<String>();

//	private String errorStartdate;
	private String errortitle;
//	private String errorcontent;

	public String execute(){
        String ret = ERROR;
//        int k;
//
//        if(!Startdate.matches(".{1,255}")){   //開始日の検証
//			   errorStartdate = (getText("開始日を入力して下さい"));
//			   return ERROR;
//		}
//        if(!title.matches(".{1,255}")){   //件名の検証
//			   errortitle = (getText("件名を入力して下さい"));
//			   return ERROR;
//		}
//        if(!content.matches(".{1,255}")){   //内容の検証
//			   errorcontent = (getText("件名を入力して下さい"));
//			   return ERROR;
//        System.out.println(Startdate);
//        System.out.println(Enddate);
        ScheduleUpdateDAO dao = new ScheduleUpdateDAO();
        int count = 0;

        for(int i = 0 ; i < scheduleIdList.size() ;++i){
        	count = dao.update(scheduleIdList.get(i),scheduleStart_dayList.get(i),scheduleEnd_dayList.get(i),scheduleTitleList.get(i),scheduleContentList.get(i));}

        		if ( count > 0) {
        			ret = SUCCESS;
        		} else {
        			errortitle=(getText("更新できませんでした"));
        		}
		return ret;
		}


	public List<Integer> getScheduleIdList() {
		return scheduleIdList;
	}


	public void setScheduleIdList(List<Integer> scheduleIdList) {
		this.scheduleIdList = scheduleIdList;
	}


	public List<Date> getScheduleStart_dayList() {
		return scheduleStart_dayList;
	}


	public void setScheduleStart_dayList(List<Date> scheduleStart_dayList) {
		this.scheduleStart_dayList = scheduleStart_dayList;
	}


	public List<Date> getScheduleEnd_dayList() {
		return scheduleEnd_dayList;
	}


	public void setScheduleEnd_dayList(List<Date> scheduleEnd_dayList) {
		this.scheduleEnd_dayList = scheduleEnd_dayList;
	}


	public List<String> getScheduleTitleList() {
		return scheduleTitleList;
	}


	public void setScheduleTitleList(List<String> scheduleTitleList) {
		this.scheduleTitleList = scheduleTitleList;
	}


	public List<String> getScheduleContentList() {
		return scheduleContentList;
	}


	public void setScheduleContentList(List<String> scheduleContentList) {
		this.scheduleContentList = scheduleContentList;
	}


	public String getErrortitle() {
		return errortitle;
	}

	public void setErrortitle(String errortitle) {
		this.errortitle = errortitle;
	}
}