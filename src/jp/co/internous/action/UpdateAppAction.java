package jp.co.internous.action;

import java.sql.SQLException;
import java.util.Map;

import jp.co.internous.dao.UpdateAppDAO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * UpdateGoodsAction 管理者画面から商品情報を編集する為のアクション
 * @author Arima Genki
 * @since 2015/06/15
 * @version 1.0
 */
public class UpdateAppAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 811223625143510825L;

	/**
	 * ID
	 */
	private int id;
	/**
	 * サイト名
	 */
	private String siteName;
	/**
	 * URL
	 */
	private String url;
	/**
	 * セッション
	 */
	private Map<String, Object> sessionMap;
	/**
	 * エラーメッセージ
	 */
	public String errormsg = null;
	/**
	 * 結果
	 */
	private String result = ERROR;
	/**
	 * 入力された値をDBに登録されている商品に反映し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/15
	 * @return result
	 * @throws SQLException
	 * @see UpdateAppDAO
	 */
	public String execute() throws SQLException {
		UpdateAppDAO updateAppDao = new UpdateAppDAO();

		if (updateAppDao.update(id, siteName, url)) {
			try {
				result = "success";
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			errormsg = "*正しい値を入力してください。";
		}
		return result;
	}
	/**
	 * ID取得メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @return Id
	 */
	public int getId() {
		return id;
	}
	/**
	 * ID格納メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @param Id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * サイト名取得メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @return siteName
	 */
	public String getSiteName() {
		return siteName;
	}
	/**
	 * サイト名格納メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @param siteName
	 */
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	/**
	 * URL取得メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * URL格納メソッド
	 * @author Arima Genki
	 * @since 2016/06/016
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * セッション取得メソッド
	 * @author Arima Genki
	 * @since 2015/05/16
	 * @return sessionMap
	 */
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}
	/**
	 * セッション格納メソッド
	 * @author Arima Genki
	 * @since 2015/06/16
	 * @param sessionMap
	 */
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
