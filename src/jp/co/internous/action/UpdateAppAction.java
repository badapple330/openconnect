package jp.co.internous.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.UpdateAppDAO;

/**
 * UpdateGoodsAction 管理者画面から商品情報を編集する為のアクション
 * @author Arima Genki
 * @since 2015/06/15
 * @version 1.0
 */
public class UpdateAppAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 811223625143510825L;

	private int site_id;
	private String site_name;
	private String site_url;
	private String site_group;

	private Map<String, Object> sessionMap;
	public String errormsg = null;
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

		if (updateAppDao.update(site_id, site_name, site_url, site_group)) {
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
	public String getSite_group() {
		return site_group;
	}
	public void setSite_group(String site_group) {
		this.site_group = site_group;
	}

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
