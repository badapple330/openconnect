package com.internousdev.bulletinboard.action;

import com.internousdev.bulletinboard.util.BotExercise;
import com.opensymphony.xwork2.ActionSupport;

public class BotExerciseAction extends ActionSupport{

	/**
	 * 文章
	 */
	private String sentence;

	public String execute() {
		String result = ERROR;
		BotExercise bot = new BotExercise(sentence);
		if(bot.wordSet() != 0){
			result = SUCCESS;
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

}
