package com.internousdev.openconnect.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.dao.GetAddressDAO;
import com.internousdev.openconnect.dto.GetAddressDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * InsertAction 管理者画面からサイト情報を取得する為のアクション
 * @author Arima Genki
 * @since 2015/06/16
 * @version 1.0
 */
public class GetAddressAdminAction extends ActionSupport {

	/**
	 * シリアルバージョンIDの生成
	 */
	private static final long serialVersionUID = -375236489777102919L;

	private List<GetAddressDTO> siteInfoList = new ArrayList<GetAddressDTO>();
	/**
	 * 取得した情報をListに格納し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/16
	 * @return result
	 * @see GetAddressDAO
	 */
	public String execute(){
		String result = ERROR;
		GetAddressDAO dao = new GetAddressDAO();
		try {
			siteInfoList.addAll(dao.select());
			result = SUCCESS;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * リスト取得メソッド
	 * @author Arima Genki
	 * @since 2015/06/16
	 * @return siteInfoList
	 */
	public List<GetAddressDTO> getSiteInfoList() {
		return siteInfoList;
	}

}
