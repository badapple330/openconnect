package com.internousdevwork.mackeypark.util;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

/**
 * GoogleOAuthでトークンを取得するutilクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class GoogleOauth extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 4444237923886912078L;

    /**
     * スコープのURL
     */
    private static final String SCOPE = "https://www.googleapis.com/auth/userinfo.email";

    /**
     * レスポンスURL
     */
    private static final String PROTECTED_RESOURCE_URL = "https://www.googleapis.com/oauth2/v1/userinfo";

    /**
     * 空のトークン
     */
    private static final Token EMPTY_TOKEN = null;

    /**
     * リクエストトークンを取得するメソッド
     * @param request リクエスト
     * @param response レスポンス
     * @return true/false リクエストトークンが取得できた場合はtrueをそうでない場合はfalseを返します。
     */
    public boolean getRequestToken(HttpServletRequest request,HttpServletResponse response){
        try{
            String apiKey = "852485846089-ac6f4adrsj9qceiqhh0remg8kqtvphk2.apps.googleusercontent.com";
            String apiSecret = "M3wqz08tec-AiHuGJlzol_97";
            String callbackUrl = "http://localhost:8080/mackeypark/login-google-action";
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

    /**
     * アクセストークンを取得する為のメソッド
     * @param request リクエスト
     * @return userMap/null ユーザー情報が取得できれば値をuserMapに返し、できなければnullを返します。
     */
    public Map<String,String> getAccessToken(HttpServletRequest request){
        Map<String,String> userMap;
        try {
            String verifier1 = request.getParameter("code");
            Verifier verifier =new Verifier(verifier1);
            Token accessToken = new Token("ACCESS_TOKEN", "REFRESH_TOKEN");
            HttpSession session = request.getSession();
            OAuthService service = (OAuthService) session.getAttribute("SERVICE");
            accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
            OAuthRequest requestOauth = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL);
            service.signRequest(accessToken, requestOauth);
            Response response = requestOauth.send();
            userMap = new LinkedHashMap<>();
            ObjectMapper mapper = new ObjectMapper();
            userMap = mapper.readValue(response.getBody(), new TypeReference<LinkedHashMap<String,String>>(){});
        } catch (Exception e) {
            return null;
        }
        return userMap;
    }

}