/**
 *
 */
package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.struts2.dao.LoginDAO;
import com.internousdev.struts2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internous
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{
	 String id;
	public String password;
	private Map<String,Object>session;

	public String execute(){
		LoginDAO dao = new LoginDAO(); //LoginDAOクラスを作成すると波線が消える
		boolean res = dao.select(id,password);

		if(!res){
			return ERROR;
		}

		LoginDTO dto = new LoginDTO(id, password);
		session.put("id", dto.getId());

		return SUCCESS;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getPass(){
		return password;
	}

	public void setPass(String password){
		this.password = password;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}