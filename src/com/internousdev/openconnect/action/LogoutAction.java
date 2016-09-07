package com.internousdev.openconnect.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * LogoutAction セッションを切断するクラス
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
     * セッションを切断する
     *
     * @author MAIKI OKANO
     * @return result セッションを切断し、SUCCESSを戻り値として返す
     */
    public String execute() {

        sessionMap.clear();
        return SUCCESS;
    }

    /**
     * 取得メソッド セッションを取得
     *
     * @author MAIKI OKANO
     * @return sessionMap 取得するセッションマップ
     */
    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }
    /**
     * 格納メソッド セッションを格納
     *
     * @author MAIKI OKANO
     * @param sessionMap
     *            格納するセッションマップ
     */
    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

}
