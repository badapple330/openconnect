package jp.co.internous.action;

import java.util.Map;

import jp.co.internous.dao.LoginDAO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
    private static final long serialVersionUID = 1422381634250534884L;

    public Map<String, Object> sessionMap;

    private String password;
    private String username;
    private String result;

    public String execute(){
        result = ERROR;

        LoginDAO logindao = new LoginDAO();

        boolean res = logindao.select(username,password);

        if(res){
            result = SUCCESS;
            sessionMap.put("user", username);
        }

        return result;
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }
    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }
    public String setPassword(String password){
        return this.password = password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }


}
