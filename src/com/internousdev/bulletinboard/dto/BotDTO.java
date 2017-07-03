package com.internousdev.bulletinboard.dto;

public class BotDTO {

	/**
	 * 文章ID
	 */
	private int sentenceId;
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
	 * どんな文章を覚えさせたかの説明
	 */
	private String label;
	/**
	 * 覚えさせた日
	 */
	private String createdAt;



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
	* @return createdAt
	*/
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	* 設定メソッド を設定
	* @param createdAt
	*/
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
