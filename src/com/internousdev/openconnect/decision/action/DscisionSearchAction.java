package com.internousdev.openconnect.projects.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
DB情報を画面に表示させるクラス
 * @author YUICHI KIRIU
 * @since 2016/09/7
 * @version 1.0
 */
public class DecisionSearchDTO extends ActionSupport{

	private List<DecisionSearchDTO> list = new ArrayList<DecisionSearchDTO>();
	private String search = "";
	private String errorSelect;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author KENICHI HORIGUCHI
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;
		DecisionSearchDTO dao = new DecisionSearchDTO();
		list = dao.select(search);
		if (list.size() != 0) {
			result = SUCCESS;
		}else {
			errorSelect = (getText("データがありません"));
		}
		return result;
	}

	/**
	* 取得メソッド
	* @author KENICHI HORIGUCHI
	* @return list
	*/
	public List<DecisionSearchDTO> getList() {
		return list;
	}

	/**
	* 設定メソッド
	* @author KENICHI HORIGUCHI
	* @param list
	*/
	public void setList(List<DecisionSearchDTO> list) {
		this.list = list;
	}



}
