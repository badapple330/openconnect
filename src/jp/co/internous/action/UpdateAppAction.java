package jp.co.internous.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.UpdateAppDAO;

/**
 * AddAppAction 管理者画面でのアプリ追加を行うクラス
 *
 * @author Arima Genki
 * @since 2015/06/15
 * @author MAIKI OKANO
 * @since 2016/07/20
 * @version 1.1
 */
public class UpdateAppAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 811223625143510825L;

	/**
     * サイトID
     */
	private int site_id;
	/**
     * サイトの名前
     */
	private String site_name;
	/**
     * サイトURL
     */
	private String site_url;
	/**
     * サイトのジャンル
     */
	private String genre;

	private Map<String, Object> sessionMap;
	public String errormsg = null;
	private String result = ERROR;
	/**
	 * 入力された値をDBに登録されている商品に反映し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/15
	 * @author MAIKI OKANO
	 * @since 2015/07/21
	 * @return result
	 */
	public String execute() throws SQLException {
		UpdateAppDAO updateAppDao = new UpdateAppDAO();

		if (updateAppDao.update(site_id, site_name, site_url, genre)) {
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


	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getSite_url() {
		return site_url;
	}

	public void setSite_url(String site_url) {
		this.site_url = site_url;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
