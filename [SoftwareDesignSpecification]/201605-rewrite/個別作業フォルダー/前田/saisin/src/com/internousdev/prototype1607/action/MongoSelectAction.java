package com.internousdev.prototype1607.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.prototype1607.dao.MongoSelectDAO;
import com.internousdev.prototype1607.dto.MongoSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MongoSelectAction extends ActionSupport implements SessionAware {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 8856867427319071268L;

	private Map<String, Object> session;
	private List<MongoSelectDTO> ticketList = new ArrayList<MongoSelectDTO>();
	private List<MongoSelectDTO> nameList = new ArrayList<MongoSelectDTO>();
	private String nameDetail;
	private String commentDetail;

	public String execute(){

		String result = ERROR;

		MongoSelectDAO dao = new MongoSelectDAO();

		dao.selectMongo();

		nameList = dao.getSelectList();

		ticketList.addAll( dao.getSelectList() );

		result = SUCCESS;

		return result;
	}

	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession( Map<String, Object> s ){
		session = s;
	}

	public List<MongoSelectDTO> getTicketList(){
		return ticketList;
	}
	public List<MongoSelectDTO> getNameList(){
		return nameList;
	}
	public String getNameDetail(){ return nameDetail; }
	public String getCommentDetail(){ return commentDetail; }
}
