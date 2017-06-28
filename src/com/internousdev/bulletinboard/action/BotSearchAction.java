/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.ArrayList;

import com.internousdev.bulletinboard.dao.BotDAO;
import com.internousdev.bulletinboard.dto.BotDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class BotSearchAction extends ActionSupport{

	/**
	 * 文章ID
	 */
	private int sentenceId;

	/**
	 * 学習マスターリスト
	 */
	ArrayList<BotDTO> masterList = new ArrayList<BotDTO>();

	public String execute() {
		String result = ERROR;
		BotDAO dao = new BotDAO();

		if(sentenceId!=0){
			masterList = dao.sentenceSearch(sentenceId);
		}else{
			masterList = dao.mastersearch();
		}
		if(masterList.size()!=0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	* 取得メソッド を取得
	* @return masterList
	*/
	public ArrayList<BotDTO> getMasterList() {
		return masterList;
	}

	/**
	* 設定メソッド を設定
	* @param masterList
	*/
	public void setMasterList(ArrayList<BotDTO> masterList) {
		this.masterList = masterList;
	}

	/**
	* 取得メソッド を取得
	* @return sentenceId
	*/
	public int getSentenceId() {
		return sentenceId;
	}

	/**
	* 設定メソッド を設定
	* @param sentenceId
	*/
	public void setSentenceId(int sentenceId) {
		this.sentenceId = sentenceId;
	}


}
