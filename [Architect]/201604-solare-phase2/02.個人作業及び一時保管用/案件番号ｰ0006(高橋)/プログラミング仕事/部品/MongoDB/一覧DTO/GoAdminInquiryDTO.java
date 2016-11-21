package com.internousdev.prototype1601.dto;

/**
 * お問い合わせ情報を格納するDTOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoAdminInquiryDTO {

    /**
     * 問い合わせID
     */
    private String formId;

    /**
     * 問い合わせ投稿者名
     */
    private String formName;

    /**
     * 問い合わせメールアドレス
     */
    private String formAddress;

    /**
     * 問い合わせ内容
     */
    private String formContents;

    /**
     * 問い合わせ日
     */
    private String formResistration;

    /**
     * 問い合わせIDを取得するメソッド
     * @return formId 問い合わせID
     */
    public String getFormId() {
        return formId;
    }

    /**
     * 問い合わせIDを格納するメソッド
     * @param formId 問い合わせID
     */
    public void setFormId(String formId) {
        this.formId = formId;
    }

    /**
     * 問い合わせ投稿者名を取得するメソッド
     * @return formName 問い合わせ投稿者名
     */
    public String getFormName() {
        return formName;
    }

    /**
     * 問い合わせ投稿者名を格納するメソッド
     * @param formName 問い合わせ投稿者名
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * 問い合わせメールアドレスを取得するメソッド
     * @return formAddress 問い合わせメールアドレス
     */
    public String getFormAddress() {
        return formAddress;
    }

    /**
     * 問い合わせメールアドレスを格納するメソッド
     * @param formAddress 問い合わせメールアドレス
     */
    public void setFormAddress(String formAddress) {
        this.formAddress = formAddress;
    }

    /**
     * 問い合わせ内容を取得するメソッド
     * @return formContents 問い合わせ内容
     */
    public String getFormContents() {
        return formContents;
    }

    /**
     * 問い合わせ内容を格納するメソッド
     * @param formContents 問い合わせ内容
     */
    public void setFormContents(String formContents) {
        this.formContents = formContents;
    }

    /**
     * 問い合わせ日を取得するメソッド
     * @return formResistration 問い合わせ日
     */
    public String getFormResistration() {
        return formResistration;
    }

    /**
     * 問い合わせ日を格納するメソッド
     * @param formResistration 問い合わせ日
     */
    public void setFormResistration(String formResistration) {
        this.formResistration = formResistration;
    }
}