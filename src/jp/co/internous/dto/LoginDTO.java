package jp.co.internous.dto;

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
     * 取得メソッド メールアドレスを取得
     *
     * @author MAIKI OKANO
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * 格納メソッド メールアドレスを格納
     *
     * @author MAIKI OKANO
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 取得メソッド パスワードを取得
     *
     * @author MAIKI OKANO
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * 格納メソッド パスワードを格納
     *
     * @author MAIKI OKANO
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}