package jp.co.internous.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.LoginDAO;

/**
 * LoginAction アプリ一覧画面に遷移するクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/22
 * @version 1.1
 */
public class LoginAction extends ActionSupport implements SessionAware{
    private static final long serialVersionUID = 1422381634250534884L;

    /**
     * セッション
     */
    public Map<String, Object> sessionMap;
    /**
     * メールアドレス
     */
    private String email;
    /**
     * パスワード
     */
    private String password;
    /**
     * 戻り値
     */
    private String result;

    /**
     * DAOに入力情報を渡し、結果を返す
     *
     * @author MAIKI OKANO
     * @return result
     */
    public String execute(){
        result = ERROR;

        LoginDAO logindao = new LoginDAO();

        boolean res = logindao.select(email,password);

        if(res){
            result = SUCCESS;
            sessionMap.put("user", email);
        }

        return result;
    }

    /**
     * 取得メソッド セッションを取得
     *
     * @author MAIKI OKANO
     * @return sessionMap
     */
    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }
    /**
     * 格納メソッド セッションを格納
     *
     * @author MAIKI OKANO
     * @param sessionMap
     */
    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
    /**
     * 取得メソッド パスワードを取得
     *
     * @author MAIKI OKANO
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * 格納メソッド パスワードを格納
     *
     * @author MAIKI OKANO
     * @param password
     */
    public String setPassword(String password){
        return this.password = password;
    }
    /**
     * 取得メソッド メールアドレスを取得
     *
     * @author MAIKI OKANO
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * 格納メソッド メールアドレスを格納
     *
     * @author MAIKI OKANO
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 格納メソッド セッションを格納
     *
     * @author MAIKI OKANO
     * @param sessionMap
     */
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }


}
