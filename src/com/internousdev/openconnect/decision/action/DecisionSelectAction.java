package com.internousdev.openconnect.decision.action;

import java.util.ArrayList;

import com.internousdev.openconnect.decision.dao.DecisionSelectDAO;
import com.internousdev.openconnect.decision.dto.DecisionDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決裁状況一覧のDBの情報を検索するクラス
 * @author KENICHI HORIGUCHI,KOUHEI NITABARU
 * @since 2016/09/04
 * @version 1.0
 */
public class DecisionSelectAction extends ActionSupport{
	/**
	 * シリアル番号
	 */
	private static final long serialVersionUID = 6053714239083263231L;
	/**
	 *@author KENICHI HORIGUCHI
	 *プロジェクトリスト
	 */
	private ArrayList <DecisionDTO> decisiontList = new ArrayList <DecisionDTO>();
	/**
	 *エラーメッセージ
	 * @author KENICHI HORIGUCHI
	 */
	private String errorSelect;
	/**
	 * 検索文
	 * @author KENICHI HORIGUCHI
	 */
	private String searchString = "";
	/**
	 * 検索の実行メソッド
	 * @author KENICHI HORIGUCHI
	 */
	public String execute(){
		System.out.println(searchString);
		DecisionSelectDAO dao = new DecisionSelectDAO();
		if (dao.select(searchString)) {
			decisiontList = dao.getList();
		} else {
			errorSelect = (getText("データがありません"));
		}
		return SUCCESS;
	}
	/**
	 * 取得メソッド 決裁状況リスト
	 * @author KENICHI HORIGUCHI
	 * @return decisiontList
	 */
	public ArrayList <DecisionDTO> getDecisiontList() {
		return decisiontList;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param decisiontList
	 */
	public void setDecisiontList(ArrayList <DecisionDTO> decisiontList) {
		this.decisiontList = decisiontList;
	}


	/**
	 * 取得メソッド エラーメッセージ
	 * @author KENICHI HORIGUCHI
	 * @return errorSelect
	 */
	public String getErrorSelect() {
		return errorSelect;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param errorSelect
	 */
	public void setErrorSelect(String errorSelect) {
		this.errorSelect = errorSelect;
	}


	/**
	 * 取得メソッド 検索文
	 * @author KENICHI HORIGUCHI
	 * @return searchString
	 */
	public String getSearchString() {
		return searchString;
	}


	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param searchString
	 */
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}


	/**
	 * 取得メソッド シリアルID
	 * @author KENICHI HORIGUCHI
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
