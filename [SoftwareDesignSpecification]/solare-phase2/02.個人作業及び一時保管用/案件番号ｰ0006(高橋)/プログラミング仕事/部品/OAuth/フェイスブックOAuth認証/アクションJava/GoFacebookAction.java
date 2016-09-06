package com.internousdevwork.mackeypark.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdevwork.mackeypark.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * FACEBOOKのログイン画面へ遷移させるアクションクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class GoFacebookAction  extends ActionSupport implements ServletResponseAware,ServletRequestAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6733983041587750483L;

    /**
     * リクエスト
     */
    private HttpServletRequest request;

    /**
     * レスポンス
     */
    private HttpServletResponse response;

    /**
     * FACEBOOKでリクエストトークンを取得できるか確認するメソッド
     * @return SUCCESS/ERROR 取得できた場合はSUCCESSを返し、できなかった場合はERRORを返します。
     */
    public String execute() {
        FacebookOauth oauth = new FacebookOauth();
        if(!oauth.getRequestToken(request, response)){
            return ERROR;
        }
        return SUCCESS;
    }

    /**
     * リクエストを格納するメソッド
     * @param request リクエスト
     */
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * レスポンスを格納するメソッド
     * @param response レスポンス
     */
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

}
