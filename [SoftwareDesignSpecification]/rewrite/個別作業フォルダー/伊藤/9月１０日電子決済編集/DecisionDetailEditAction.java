package com.internousdev.openconnect.decisionDetail.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailEditDAO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailEditAction extends ActionSupport implements SessionAware{
	/**
	 * 決裁手続きリスト
	 */
	private Map<String, Object> session;
	private int decisionDetailId;
	private String password;
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {

		String result = ERROR;
		DecisionDetailEditDAO dao = new DecisionDetailEditDAO();
System.out.println(1);
		boolean check = dao.check(decisionDetailId,password);
		if( check ){
			decisionDetailList = dao.select(decisionDetailId);
			result = SUCCESS;
		}System.out.println(2);
		session.put("decisionDetailId", decisionDetailId);

		return result;
	}


	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return decisionDetailList
	 */
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param decisionDetailList
	 */
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}
	/**
	 * 取得メソッド
	 * @author
	 * @return
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド
	 * @author
	 * @param
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
