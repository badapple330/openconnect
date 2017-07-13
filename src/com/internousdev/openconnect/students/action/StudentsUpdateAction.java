package com.internousdev.openconnect.students.action;

import java.sql.SQLException;

import com.internousdev.openconnect.students.dao.StudentsUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBの受講生の情報を更新するクラス
 * @author KOHEI NITABARU
 * @author TATSUHIRO SAITO
 * @since 2016/09/04
 * @version 1.0
 */
public class StudentsUpdateAction extends ActionSupport {

    /**
     * シリアル番号
     */
    private static final long serialVersionUID = 8587637642584563442L;
    /**
     * ユーザーID
     */
    private int userId;

    /**
     * 姓(漢字)
     */
    private String familyNameKanji;

    /**
     * 名(漢字)
     */
    private String givenNameKanji;
    /**
     * チーム名
     */
    private String teamName;
    /**
     * ユーザー名
     */
    private String userName;

    /**
     * 姓(ふりがな)
     */
    private String familyNameKana;

    /**
     * 名(ふりがな)
     */
    private String givenNameKana;
    /*
     * ログインメールアドレス
     */
    private String phoneEmail;
    /*
     *エラーメッセージ
     */
    private String errorMsg;


	/**
     * ユーザーフラグ
     */
    private int userFlg;


    /**
     * 結果文字
     */
    private String resultString = "更新に失敗しました。";

    /**
     * 実行メソッド DBの受講生情報を更新
     * @author KOHEI NITABARU
     * @author TATSUHIRO SAITO
     * @return result
     */
    public String execute() throws SQLException {

        String result = ERROR;
        userName = familyNameKanji + givenNameKanji;

        StudentsUpdateDAO dao = new StudentsUpdateDAO();
        int count = 0;
        count = dao.update(familyNameKanji,givenNameKanji,teamName,userFlg,userName,familyNameKana,givenNameKana,phoneEmail,userId);
        if (count != 0) {

            result = SUCCESS;
            resultString = "更新に成功しました。";
        }else {
        	errorMsg = "失敗しました。";
        }
        return result;
    }



    /**
     * 取得メソッド 受講年を取得
     * @author KOHEI NITABARU
     * @return year
     */


    /**
	 * ユーザーIDを取得します。
	 * @return ユーザーID
	 */
	/**
	 * ユーザーIDを取得します。
	 * @return ユーザーID
	 */
	/**
	 * ユーザーIDを取得します。
	 * @return ユーザーID
	 */
	/**
	 * ユーザーIDを取得します。
	 * @return ユーザーID
	 */
	public int getUserId() {
	    return userId;
	}



	/**
	 * ユーザーIDを設定します。
	 * @param userId ユーザーID
	 */
	/**
	 * ユーザーIDを設定します。
	 * @param userId ユーザーID
	 */
	/**
	 * ユーザーIDを設定します。
	 * @param userId ユーザーID
	 */
	/**
	 * ユーザーIDを設定します。
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
	    this.userId = userId;
	}



	/**
	 * 姓(漢字)を取得します。
	 * @return 姓(漢字)
	 */
	public String getFamilyNameKanji() {
	    return familyNameKanji;
	}



	/**
	 * 姓(漢字)を設定します。
	 * @param familyNameKanji 姓(漢字)
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
	    this.familyNameKanji = familyNameKanji;
	}



	/**
	 * 名(漢字)を取得します。
	 * @return 名(漢字)
	 */
	public String getGivenNameKanji() {
	    return givenNameKanji;
	}



	/**
	 * 名(漢字)を設定します。
	 * @param givenNameKanji 名(漢字)
	 */
	public void setGivenNameKanji(String givenNameKanji) {
	    this.givenNameKanji = givenNameKanji;
	}



	/**
	 * チーム名を取得します。
	 * @return チーム名
	 */
	public String getTeamName() {
	    return teamName;
	}



	/**
	 * チーム名を設定します。
	 * @param teamName チーム名
	 */
	public void setTeamName(String teamName) {
	    this.teamName = teamName;
	}



	/**
	 * phoneEmailを取得します。
	 * @return phoneEmail
	 */
	public String getPhoneEmail() {
	    return phoneEmail;
	}



	/**
	 * phoneEmailを設定します。
	 * @param phoneEmail phoneEmail
	 */
	public void setPhoneEmail(String phoneEmail) {
	    this.phoneEmail = phoneEmail;
	}

	/**
	 * errorMsgを取得します。
	 * @return errorMsg
	 */
	public String getErrorMsg() {
	    return errorMsg;
	}



	/**
	 * errorMsgを設定します。
	 * @param errorMsg errorMsg
	 */
	public void setErrorMsg(String errorMsg) {
	    this.errorMsg = errorMsg;
	}



	/**
	 * ユーザーフラグを取得します。
	 * @return ユーザーフラグ
	 */
	public int getUserFlg() {
	    return userFlg;
	}



	/**
	 * ユーザーフラグを設定します。
	 * @param userFlg ユーザーフラグ
	 */
	public void setUserFlg(int userFlg) {
	    this.userFlg = userFlg;
	}



	/**
     * 取得メソッド シリアル番号を取得
     * @author KOHEI NITABARU
     * @return serialVersionUID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    /**
	 * ユーザー名を取得します。
	 * @return ユーザー名
	 */
	public String getUserName() {
	    return userName;
	}



	/**
	 * ユーザー名を設定します。
	 * @param userName ユーザー名
	 */
	public void setUserName(String userName) {
	    this.userName = userName;
	}



	/**
	 * 姓(ふりがな)を取得します。
	 * @return 姓(ふりがな)
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}



	/**
	 * 姓(ふりがな)を設定します。
	 * @param familyNameKana 姓(ふりがな)
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}



	/**
   	* 取得メソッド を取得
   	* @return givenNameKana
   	*/
   	public String getGivenNameKana() {
   		return givenNameKana;
   	}

   	/**
   	* 設定メソッド を設定
   	* @param givenNameKana
   	*/
   	public void setGivenNameKana(String givenNameKana) {
   		this.givenNameKana = givenNameKana;
   	}



	/**
	 * 結果文字を取得します。
	 * @return 結果文字
	 */
	public String getResultString() {
	    return resultString;
	}



	/**
	 * 結果文字を設定します。
	 * @param resultString 結果文字
	 */
	public void setResultString(String resultString) {
	    this.resultString = resultString;
	}


}