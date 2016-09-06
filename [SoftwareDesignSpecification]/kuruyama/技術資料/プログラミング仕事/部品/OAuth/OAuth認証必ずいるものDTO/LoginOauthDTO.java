package com.internousdevwork.mackeypark.dto;

/**
 * OAuth認証でユーザー情報を格納するDTOクラス
 * @author Takeshi Banshow
 * @since 1.0
 * @version 1.0
 */
public class LoginOauthDTO{

    /**
     * ユーザーID
     */
    private int id;

    /**
     * ユーザーIDを取得するメソッド
     * @return id ユーザーID
     */
    public int getId() {
        return id;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param id ユーザーID
     */
    public void setId(int id) {
        this.id = id;
    }

}