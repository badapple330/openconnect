/**
 *
 */
package com.internousdev.bulletinboard.action;

import com.internousdev.bulletinboard.dao.BotDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class BotSentenceDeleteAction extends ActionSupport{

	/**
	 * 文章ID
	 */
	public int sentenceId;

	/**
	 * 結果の文章
	 */
	private String resultSentence;

	public String execute() {
		String result = ERROR;

		BotDAO dao = new BotDAO();
		if(dao.sentenceDelete(sentenceId)!=0){
			if(dao.masterDelete(sentenceId)!=0){
				resultSentence = "botくんが選択した文章を綺麗さっぱり忘れました！";
				result = SUCCESS;
			}
		}
		if(resultSentence==null){
			resultSentence = "忘れられなかった！ごめんね！";
		}
		return result;
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
	* @return resultSentence
	*/
	public String getResultSentence() {
		return resultSentence;
	}

	/**
	* 設定メソッド を設定
	* @param resultSentence
	*/
	public void setResultSentence(String resultSentence) {
		this.resultSentence = resultSentence;
	}


}
