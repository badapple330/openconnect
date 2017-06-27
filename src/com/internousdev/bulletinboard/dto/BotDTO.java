package com.internousdev.bulletinboard.dto;

public class BotDTO {

	/**
	 * レスポンスID
	 */
	private int responseId;
	/**
	 * 反応する単語
	 */
	private String word;
	/**
	 * 反応
	 */
	private String response;
	/**
	 * 品詞
	 */
	private String partOfSpeech;
	/**
	 * 単語
	 */
	private String parts;
	/**
	 * 辞書にあるか
	 */
	private boolean dictionary;
	/**
	 * 印象
	 */
	private int impression;




	/**
	 * @return partsOfSpeech
	 */
	public String getPartOfSpeech() {
		return partOfSpeech;
	}
	/**
	 * @param partsOfSpeech セットする partsOfSpeech
	 */
	public void setPartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}
	public int getResponseId() {
		return responseId;
	}
	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	/**
	 * @return parts
	 */
	public String getParts() {
		return parts;
	}
	/**
	 * @param parts セットする parts
	 */
	public void setParts(String parts) {
		this.parts = parts;
	}
	/**
	 * @return dictionary
	 */
	public boolean isDictionary() {
		return dictionary;
	}
	/**
	 * @param dictionary セットする dictionary
	 */
	public void setDictionary(boolean dictionary) {
		this.dictionary = dictionary;
	}
	/**
	* 取得メソッド を取得
	* @return impression
	*/
	public int getImpression() {
		return impression;
	}
	/**
	* 設定メソッド を設定
	* @param impression
	*/
	public void setImpression(int impression) {
		this.impression = impression;
	}

}
