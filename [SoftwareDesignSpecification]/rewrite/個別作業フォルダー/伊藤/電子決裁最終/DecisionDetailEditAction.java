package com.internousdev.openconnect.decisionDetail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailIdDAO;
import com.internousdev.openconnect.decisionDetail.dao.DecisionLoginDAO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
import com.internousdev.openconnect.students.dto.StudentsDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * DBの情報を画面に表示する為のクラス
 * @author TATUHUMI ITOU
 * @since 2016/09/04
 * @version 1.0
 */

public class DecisionDetailEditAction extends ActionSupport {
	/**
	 * 決裁手続きリスト
	 */
	private String password;
	private int decisionDetailId;
	private List<DecisionDetailDTO> decisionDetailList = new ArrayList<DecisionDetailDTO>();
	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7586577377473680450L;
	/**
	 * 実行メソッド DAOに入力されたデータを渡して、結果を返す
	 * @author TATUHUMI ITOU
	 * @return result データベースに格納できたらSUCCESS、失敗したらERROR
	 */
	public String execute() {
		String result = ERROR;

		DecisionLoginDAO dao=new DecisionLoginDAO();
		StudentsDTO dto=new StudentsDTO();

		dto=dao.select(password);
		String dtoPassword=dto.getPassword();

		if(password.equals(dtoPassword)){

			DecisionDetailIdDAO dao2 = new DecisionDetailIdDAO();
			decisionDetailList = dao2.select(decisionDetailId);
			if (!( decisionDetailList == null)) {
				result = SUCCESS;
			}
		}			return result;
	}
	/**
	 * 取得メソッド
	 * @author KOHEI NITABARU
	 * @return decisionDetailList
	 */
	public List<DecisionDetailDTO> getDecisionDetailList() {
		return decisionDetailList;
	}
	/**
	 * 設定メソッド
	 * @author KOHEI NITABARU
	 * @param decisionDetailList
	 */
	public void setDecisionDetailList(List<DecisionDetailDTO> decisionDetailList) {
		this.decisionDetailList = decisionDetailList;
	}
	/**
	 * 取得メソッド
	 * @author
	 * @return
	 */
	public int getDecisionDetailId() {
		return decisionDetailId;
	}
	/**
	 * 設定メソッド
	 * @author
	 * @param
	 */
	public void setDecisionDetailId(int decisionDetailId) {
		this.decisionDetailId = decisionDetailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
