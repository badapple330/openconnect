package com.internousdev.openconnect.action;

import java.io.Serializable;

import com.internousdev.openconnect.dao.LoginAdminDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * GoAdminAction 管理者画面にログインするためのアクション
 * @author Sakai Shinya
 * @since  2015/06/17
 * @version 1.0
 */
public class GoAdminAction extends ActionSupport implements Serializable{
	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = 1270013947997996059L;
	/**
	 * 管理者名
	 */
	public String adminName;
	/**
	 * 管理者パスワード
	 */
	public String adminPass;
	/**
	 * 結果
	 */
	private String result = ERROR;
	/**
	 * 実行メソッド
	 * @author Sakai Shinya
	 * @since 2015/06/17
	 * @return result
	 */
	public String execute(){
		LoginAdminDAO dao = new LoginAdminDAO();
		boolean ret = dao.select(adminName, adminPass);
		if(ret){
			result = SUCCESS;
		}
		return result;
	}
}