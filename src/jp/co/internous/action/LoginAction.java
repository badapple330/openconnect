package jp.co.internous.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.LoginDAO;

public class LoginAction extends ActionSupport implements SessionAware{
    private static final long serialVersionUID = 1422381634250534884L;

    public Map<String, Object> sessionMap;

    private String email;
    private String password;
    private String result;

    public String execute(){
        result = ERROR;

        LoginDAO logindao = new LoginDAO();

        boolean res = logindao.select(email,password);

        if(res){
            result = SUCCESS;
            sessionMap.put("user", password);
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }


}
