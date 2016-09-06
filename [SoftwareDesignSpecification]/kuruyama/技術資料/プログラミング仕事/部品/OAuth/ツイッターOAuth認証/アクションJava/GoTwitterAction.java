package com.internousdevwork.mackeypark.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.internousdevwork.mackeypark.util.TwitterOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Twitterのログイン画面へ遷移するアクションクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class GoTwitterAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -460473379443021379L;

    /**
     * レスポンス
     */
    private HttpServletResponse response;

    /**
     * リクエスト
     */
    private HttpServletRequest request;

    /**
     * Twitterでリクエストトークンを取得できるか判定するメソッド
     * @return SUCCESS/ERROR 取得に成功した場合SUCCESSを返し、失敗した場合ERRORを返します。
     */
    public String execute() {
        TwitterOauth twitterOauth = new TwitterOauth();
        if (!twitterOauth.getRequestToken(request, response)) {
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
