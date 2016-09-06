package com.internousdevwork.mackeypark.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdevwork.mackeypark.util.GoogleOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Googleのログイン画面へ遷移するアクションクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class GoGoogleAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -8512143518893511699L;

    /**
     * レスポンス
     */
    private HttpServletResponse response;

    /**
     * リクエスト
     */
    private HttpServletRequest request;

    /**
     * Googleでリクエストトークンを取得できるか判定するメソッド
     * @return SUCCESS/ERROR 取得できた場合はSUCCESSを返し、できなかった場合はERRORを返します。
     */
    public String execute() {
        GoogleOauth googleOauth = new GoogleOauth();
        if(!googleOauth.getRequestToken(request,response)) {
            return ERROR;
        }
        return SUCCESS;
    }

    /**
     * レスポンスを格納するメソッド
     * @param response レスポンス
     */
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * リクエストを格納するメソッド
     * @param request リクエスト
     */
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

}