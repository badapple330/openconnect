package jp.co.internous.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import jp.co.internous.dao.GetAddressDAO;
import jp.co.internous.dto.GetAddressDTO;

public class GetAddressAction extends ActionSupport implements SessionAware {

    private List<GetAddressDTO> siteInfoList = new ArrayList<GetAddressDTO>();
    private Map<String, Object> sessionMap;
    private String notLoginMsg;

    public String execute(){
        String result = ERROR;
        Boolean user;

        GetAddressDAO dao = new GetAddressDAO();

     //   sessionMap.put("user", "value");
     //   sessionMap.clear();
        user = sessionMap.containsKey("user");
        if (user == false) {
            result = SUCCESS;
            this.setNotLoginMsg("ログイン後に表示します。");
            return result;
        }

        try {
            siteInfoList.addAll(dao.select());
            result = SUCCESS;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<GetAddressDTO> getSiteInfoList() {
        return siteInfoList;
    }

    public void setSession(Map<String, Object> sessionMap) {
        this.setSessionMap(sessionMap);
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public String getNotLoginMsg() {
        return notLoginMsg;
    }

    public void setNotLoginMsg(String notLoginMsg) {
        this.notLoginMsg = notLoginMsg;
    }

}
