/**
 *
 */
package com.internousdev.prototype1607.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.prototype1607.dao.LoginDAO;
import com.internousdev.prototype1607.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internous
 *
 */
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 7138556903148572524L;
	/**
	 * @param args
	 */
	//メンバ変数
	private String name;
	private String password;
	private Map<String,Object>session;  //sessionを使う場合は定義する

	public String execute(){                   //execute実行メソッド、ここで実行処理が行われる
		String ret=ERROR;                       //retは変数名

		LoginDAO dao=new LoginDAO();   //LoginDAOをインスタンス化する
		LoginDTO dto=new LoginDTO();    //LoginDTOをインスタンス化する

		dto=dao.select(name,password);   //上記でインスタンス化したDAOの中でselectしている値を持ってきてdtoに格納する

		String dtoName=dto.getName();  //dtoIdは変数名。DTOからint型でidを取得する
		String dtoPassword=dto.getPassword();   //上記同様


		if(name.equals(dtoName)){          //入力されたidとDBから取得してきた値が一緒かどうか
			if(dtoPassword.equals(dto.getPassword())){    //入力されたpasswordとDBから取得してきた値が一緒かどうか
				ret=SUCCESS;                                             //値が一緒であればretをSUCCESSで返す。
			}
		}
		session.put("name",dto.getName());      //DTOに格納されたnameを取得しsessionに置く
		return ret;                                         //値が正しくない場合はret中にERRORを代入しているのでretを返す
	}
	public String mysqli(){
		return SUCCESS;
	}

	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
