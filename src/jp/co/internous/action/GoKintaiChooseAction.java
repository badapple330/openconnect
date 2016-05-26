/**
 *
 */
package jp.co.internous.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 勤怠管理画面に遷移するアクションクラス
 *
 * @author RYO KAKIZAWA
 * @since 2016/5/26
 * @varsion 1.0
 */
public class GoKintaiChooseAction extends ActionSupport {

	/**
	 * 結果
	 *
	 * @author RYO KAKIZAWA
	 * @since 2016/5/26
	 */
	private String result = SUCCESS;

	/**
	 * 実行メソッド
	 *
	 * @author RYO KAKIZAWA
	 * @since 2016/5/26
	 */
	public String execute() {
		return result;
	}
}
