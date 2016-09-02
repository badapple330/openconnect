package com.internousdev.openconnect.schedule.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.schedule.dao.ScheduleUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ScheduleUpdateAction extends ActionSupport {

	private List<Integer> id = new ArrayList<Integer>();
	private List<Date> Startdate = new ArrayList<Date>();
	private List<Date> Enddate = new ArrayList<Date>();
	private List<String> title = new ArrayList<String>();
	private List<String> content = new ArrayList<String>();

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
        System.out.println(Startdate);
        System.out.println(Enddate);
        ScheduleUpdateDAO dao = new ScheduleUpdateDAO();
        int count = 0;

        for(int i = 0 ; i < id.size() ;++i){
        	count = dao.update(id.get(i),Startdate.get(i),Enddate.get(i),title.get(i),content.get(i));}

        		if ( count > 0) {
        			ret = SUCCESS;
        		} else {
        			errortitle=(getText("更新できませんでした"));
        		}
		return ret;
		}

	public List<Integer> getId() {
		return id;
	}

	public void setId(List<Integer> id) {
		this.id = id;
	}



	public List<Date> getStartdate() {
		return Startdate;
	}

	public void setStartdate(List<Date> startdate) {
		Startdate = startdate;
	}

	public List<Date> getEnddate() {
		return Enddate;
	}

	public void setEnddate(List<Date> enddate) {
		Enddate = enddate;
	}

	public List<String> getTitle() {
		return title;
	}

	public void setTitle(List<String> title) {
		this.title = title;
	}

	public List<String> getContent() {
		return content;
	}

	public void setContent(List<String> content) {
		this.content = content;
	}

	public String getErrortitle() {
		return errortitle;
	}

	public void setErrortitle(String errortitle) {
		this.errortitle = errortitle;
	}
}