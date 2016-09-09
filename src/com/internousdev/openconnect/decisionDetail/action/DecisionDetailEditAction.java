package com.internousdev.openconnect.decisionDetail.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.openconnect.decisionDetail.dao.DecisionDetailEditDAO;
import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;
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

	private int decisionDetailId;
	private String password;
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
		DecisionDetailEditDAO dao = new DecisionDetailEditDAO();
		DecisionDetailDTO dto=new DecisionDetailDTO();
		dto=dao.check(decisionDetailId,password);
		String dtoPassword=dto.getPassword();


		decisionDetailList = dao.select(decisionDetailId);

		System.out.println(1);

		if (!( decisionDetailList == null)) {
			System.out.println(2);
			if(password.equals(dtoPassword)){
				System.out.println(3);
				result = SUCCESS;
				System.out.println(7);
			}
		}
		return result;
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
	/**
	 * 取得メソッド
	 * @author KENICHI HORIGUCHI
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 設定メソッド
	 * @author KENICHI HORIGUCHI
	 * @param
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
