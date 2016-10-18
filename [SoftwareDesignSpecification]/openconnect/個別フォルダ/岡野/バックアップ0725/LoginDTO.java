package com.internousdev.openconnect.dto;

/**
 * LoginDTO
 *
 * @author MAIKI OKANO
 * @since 2016/07/22
 * @version 1.0
 */
public class LoginDTO {

	/**
     * メールアドレス
     */
    private String email;
    /**
     * パスワード
     */
    private String password;
    /**
     * ユーザーフラグ
     */
    private String userFlg;

    /**
     * 取得メソッド メールアドレスを取得
     *
     * @author MAIKI OKANO
     * @return email 取得するメールアドレス
     */
    public String getEmail() {
        return email;
    }
    /**
     * 格納メソッド メールアドレスを格納
     *
     * @author MAIKI OKANO
     * @param email
     *            格納するメールアドレス
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 取得メソッド パスワードを取得
     *
     * @author MAIKI OKANO
     * @return password 取得するパスワード
     */
    public String getPassword() {
        return password;
    }
    /**
     * 格納メソッド パスワードを格納
     *
     * @author MAIKI OKANO
     * @param password
     *            格納するパスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 取得メソッド ユーザーフラグを取得
     *
     * @author MAIKI OKANO
     * @return userFlg 1取得するユーザーフラグ
     */
	public String getUserFlg() {
		return userFlg;
	}
	/**
     * 格納メソッド ユーザーフラグを格納
     *
     * @author MAIKI OKANO
     * @param userFlg
     *            格納するユーザーフラグ
     */
	public void setUserFlg(String userFlg) {
		this.userFlg = userFlg;
	}



}