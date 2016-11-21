package com.internousdev.openconnect.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.dao.AdminUserDAO;
import com.internousdev.openconnect.dto.GetAddressDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー情報を画面に表示させるためのクラス
 *
 * @author TATUHUMI ITO
 * @since 2016/08/11
 */
public class AdminUserAction extends ActionSupport {
	/**
	 * ユーザー情報を格納するリスト
	 */
	private List<GetAddressDTO> projectList = new ArrayList<GetAddressDTO>();
	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = -7586577377473680450L;

	/**
	 * DAOからデータを取得し、リストに格納するメソッド
	 *
	 * @author TATUHUMI ITO
	 * @return データの取得に成功したらSUCCESS 失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		AdminUserDAO dao = new AdminUserDAO();

		projectList = dao.select();
		if (!(projectList == null)) {
			result = SUCCESS;
		}
		return result;
	}

	public List<GetAddressDTO> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<GetAddressDTO> projectList) {
		this.projectList = projectList;
	}


}
