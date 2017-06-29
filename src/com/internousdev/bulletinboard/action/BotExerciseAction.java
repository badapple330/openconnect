package com.internousdev.bulletinboard.action;

import com.internousdev.bulletinboard.dao.BotDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BotExerciseAction extends ActionSupport{

	/**
	 * 文章
	 */
	private String sentence;

	/**
	 * どんな文章を入れたのかの説明
	 */
	private String label;

	/**
	 * 結果の文章
	 */
	private String resultSentence;

	public String execute() {
		String result = ERROR;
		BotDAO dao = new BotDAO();
		//ラベルが重複してないかの確認
		if(dao.labelCheck(label)){
			//学習マスターテーブルにインサート
			if(dao.masterSet(label)!=0){
				//先程インサートしたマスターの文章IDを探す
				int sentenceId = dao.sentenceIdSearch(label);
				if(sentenceId!=0){
					//学習テーブルにインサート
					if(dao.wordSet(sentence, sentenceId)!=0){
						resultSentence = "おめでとう！botくんがあなたの入力した文章を覚えました！";
						result = SUCCESS;
					}
				}
			}
		}else{
			resultSentence = "その要約はすでに使われてるので使用できません。ごめんね！";
		}

		return result;
	}



	/**
	 * @return sentence
	 */
	public String getSentence() {
		return sentence;
	}

	/**
	 * @param sentence セットする sentence
	 */
	public void setSentence(String sentence) {
		this.sentence = sentence;
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
