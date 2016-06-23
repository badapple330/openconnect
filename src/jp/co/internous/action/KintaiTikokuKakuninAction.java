/**
 *
 */
package jp.co.internous.action;

import jp.co.internous.dao.DeleteAppDAO;
import jp.co.internous.dao.KintaiTikokuKakuninDAO;

/**
 * @author internous
 *
 */
public class KintaiTikokuKakuninAction {
	/**
	 * 全画面に入力された値をDTOから引きだし、resultを返すメソッド
	 * @author Sanshiro Kocho
	 * @since 2015/06/23
	 * @return result
	 */
	String result = "error";

	public String execute(){

		KintaiTikokuKakuninDAO dao = new KintaiTikokuKakuninDAO();
		KintaiTikokuDTO dto = new KintaiTikokuDTO;

		if (dao.insert(dto.@@@@@@@ )) {
			result = "success";
			return result;
		} else {
			errormsg = "失敗しました。";
			return result;
		}
	}

	/**
	 * ID取得メソッド
	 * @author Arima Genki
	 * @since 2015/06/17
	 * @return id
	 */
//	public int getId() {
//		return id;
//	}
	/**
	 * ID格納メソッド
	 * @author Arima Genki
	 * @since 2015/06/17
	 * @param id
	 */
//	public void setId(int id) {
//		this.id = id;
//	}
}