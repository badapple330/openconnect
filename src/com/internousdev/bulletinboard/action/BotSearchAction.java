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

	ArrayList<BotDTO> masterList = new ArrayList<BotDTO>();

	public String execute() {
		String result = ERROR;
		BotDAO dao = new BotDAO();
		masterList = dao.mastersearch();
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


}
