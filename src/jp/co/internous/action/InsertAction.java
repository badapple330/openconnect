package jp.co.internous.action;

import jp.co.internous.dao.InsertDAO;

import com.opensymphony.xwork2.ActionSupport;
/**
 * InsertAction 管理者画面からサイト情報を追加する為のアクション
 * @author Arima Genki
 * @since 2015/06/16
 * @version 1.0
 */
public class InsertAction extends ActionSupport {
	private static final long serialVersionUID = 4864447931699786278L;

	/**
	 * 結果
	 */
	private String result;
	/**
	 * サイト名
	 */
	private String siteName;
	/**
	 * URL
	 */
	private String url;
	/**
	 * 入力された値をDBに登録し、resultを返すメソッド
	 * @author Arima Genki
	 * @since 2015/06/16
	 * @return result
	 * @throws Exception
	 * @see InsertDAO
	 */
	public String execute() throws Exception{
		InsertDAO dao = new InsertDAO();
		System.out.println(siteName);
		System.out.println(url);
		if(dao.insert(siteName,url)){
			result = "success";
			return result;
		}
		return result;
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

}