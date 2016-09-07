package com.internousdev.openconnect.google;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;

public class LoginGoogleOAuth extends ActionSupport{
    private static final long serialVersionUID = 5199606772049065120L;
    private static final String PROTECTED_RESOURCE_URL = "https://www.googleapis.com/oauth2/v1/userinfo";

    private static final Token EMPTY_TOKEN = null;

    public Map<String,String> getAccessToken(HttpServletRequest request){
        Map<String,String> map;
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
            map = new LinkedHashMap<>();
            ObjectMapper mapper = new ObjectMapper();

            map = mapper.readValue(response.getBody(), new TypeReference<LinkedHashMap<String,String>>(){});
        } catch (Exception e) {
            return null;
        }
        return map;
    }
}
