/**
 *
 */
package com.internousdev.bulletinboard.action;

import java.util.ArrayList;

import com.internousdev.bulletinboard.dao.BotSearchDAO;
import com.internousdev.bulletinboard.dto.BotDTO;
import com.internousdev.bulletinboard.util.SentenceCheck;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 文章を閲覧するためのクラス
 * @author Misa Kikluchi
 *
 */
public class BotSearchAction extends ActionSupport{

	/**
	 * 文章を規定するもの
	 */
	private String sentences;

	/**
	 * 文章ID
	 */
	private int sentenceId;

	/**
	 * ラベル
	 */
	private String label;

	/**
	 * 学習マスターリスト
	 */
	ArrayList<BotDTO> masterList = new ArrayList<BotDTO>();



	public String execute() {
		String result = ERROR;
		BotSearchDAO dao = new BotSearchDAO();

		//文章を見るをクリックしたときの処理
		if(sentences!=null){
			SentenceCheck check = new SentenceCheck(sentences);
			if(check.isNum()){
				masterList = dao.sentenceSearch(Integer.parseInt(sentences));
				result = SUCCESS;
			}else if(check.checkDate()){
				sentenceId = dao.sentenceSearchByAt(sentences);
				masterList = dao.sentenceSearch(sentenceId);
				result = SUCCESS;
			}else{
				sentenceId = dao.sentenceSearchByLabel(sentences);
				masterList = dao.sentenceSearch(sentenceId);
				result = SUCCESS;
			}

		}else{
			//言葉を閲覧するをクリックしたときの処理
			masterList = dao.mastersearch();
		}
		if(masterList.size()!=0){
			result = SUCCESS;
		}
		return result;
	}



	/**
	* 取得メソッド を取得
	* @return sentences
	*/
	public String getSentences() {
		return sentences;
	}



	/**
	* 設定メソッド を設定
	* @param sentences
	*/
	public void setSentences(String sentences) {
		this.sentences = sentences;
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



	/**
	* 取得メソッド を取得
	* @return label
	*/
	public String getLabel() {
		return label;
	}



	/**
	* 設定メソッド を設定
	* @param label
	*/
	public void setLabel(String label) {
		this.label = label;
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



}
