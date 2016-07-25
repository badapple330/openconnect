package com.internousdev.openconnect.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * LogoutAction セッションを切るクラス
 *
 * @author MAIKI OKANO
 * @since 2016/07/22
 * @version 1.0
 */
public class LogoutAction extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 6220484178360034399L;

    /**
     * セッション
     */
    public Map<String, Object> sessionMap;

    /**
     * セッションをクリアする
     *
     * @author MAIKI OKANO
     * @return result
     */
    public String execute() {

        sessionMap.clear();
        return SUCCESS;
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
     * 格納メソッド セッションを格納
     *
     * @author MAIKI OKANO
     * @param sessionMap
     */
    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

}
