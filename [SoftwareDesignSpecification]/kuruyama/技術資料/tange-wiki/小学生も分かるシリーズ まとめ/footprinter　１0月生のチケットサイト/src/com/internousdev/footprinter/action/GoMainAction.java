package com.internousdev.footprinter.action;

import com.internousdev.footprinter.dao.MainDAO;
import com.internousdev.footprinter.dto.MainDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

/**
 * メインページへの遷移するためのクラス
 * @author 北山 菜穂
 * @since  1.0
 * @version 1.0
 */
public class GoMainAction extends ActionSupport{

	/**
	 * シリアルナンバー
	 */
	private static final long serialVersionUID = 3854532047410642711L;

	/**
	 * ブラウザの設定言語
	 */
	private String language;

	/**
	 * 新着イベント1~3件目のリスト
	 */
	private ArrayList<MainDTO> newtourList_1 = new ArrayList<MainDTO>();

	/**
	 * 新着イベント4~6件目のリスト
	 */
	private ArrayList<MainDTO> newtourList_2 = new ArrayList<MainDTO>();

	/**
	 * メイン画面の新着情報取得メソッド
	 * @return  SUCCESS ERROR
	 */
	public String execute() {
		boolean result = false;
		language = getText("lang.main.language");
		MainDAO dao = new MainDAO();
		result = dao.select(newtourList_1,newtourList_2,language);
		if(newtourList_1.isEmpty()){
			newtourList_1 = null;
		}
		if(newtourList_2.isEmpty()){
			newtourList_2 = null;
		}
		if(!result){
			return ERROR;
		}
		return SUCCESS;
	}

	/**
	 * newtourList_1のゲッターメソッド
	 * @return newtourList_1 新着イベント情報1～3件目のList
	 */
	public ArrayList<MainDTO> getNewtourList1(){
		return newtourList_1;
	}

	/**
	 * newtourList_2のゲッターメソッド
	 * @return newtourList_2 新着イベント情報4～6件目のList
	 */
	public ArrayList<MainDTO> getNewtourList2(){
		return newtourList_2;
	}
}