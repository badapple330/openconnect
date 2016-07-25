package com.internousdev.openconnect.google;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

import com.opensymphony.xwork2.ActionSupport;

public class GoGoogleOAuth extends ActionSupport{
    private static final long serialVersionUID = -4587103822806960131L;
    private static final String SCOPE = "https://www.googleapis.com/auth/userinfo.profile";
    private static final Token EMPTY_TOKEN = null;

    /**
     * リクエストトークンを取得するメソッド
     * @param request リクエスト
     * @param response レスポンス
     * @return boolean
     */
    public boolean RequestToken(HttpServletRequest request,HttpServletResponse response){

        try{
            String apiKey = "295659684699-3nvph95vgerehtf2aed77o7dhv3jldrj.apps.googleusercontent.com";
            String apiSecret = "254kyRVYKBM_fN0B4cQk6Gqh";
            String callbackUrl = "http://localhost:8080/openconnect/LoginGoogleAction";

            OAuthService service = new ServiceBuilder()
            .provider(GoogleApi.class)
            .apiKey(apiKey)
            .apiSecret(apiSecret)
            .callback(callbackUrl)
            .scope(SCOPE)
            .build();

            @SuppressWarnings("unused")
            Token accessToken = new Token("ACCESS_TOKEN", "REFRESH_TOKEN");
            String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
            HttpSession session = request.getSession();
            session.setAttribute("SERVICE", service);
            response.sendRedirect(authorizationUrl);
        }catch(Exception e){
            return false;
        }
        return true;
    }

}
