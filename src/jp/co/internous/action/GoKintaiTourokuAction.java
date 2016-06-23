package jp.co.internous.action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 勤怠登録完了画面に遷移するアクションクラス
 *
 * @auther SHIORI OYAMA
 * @since 2016/06/23
 * @version 1.0
 */
public class GoKintaiTourokuAction extends ActionSupport {

	/**
	 * 結果
	 *
	 * @author SHIORI OYAMA
	 * @since 2016/06/23
	 */
	private String result = SUCCESS ;

	/**
	 * 実行メソッド
	 *
	 * @author SHIORI OYAMA
	 * @since 2016/06/23
	 */
	public String execute() {
		return result;
	}
}