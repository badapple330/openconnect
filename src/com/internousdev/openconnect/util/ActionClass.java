package com.internousdev.openconnect.util;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ActionClass
 * アクションクラスを記述する際に共通のフィールドとメソッドを持った抽象クラス
 * @author Y.Gouda
 * @since 2015/4/30
 * @version 1.0
 */
public abstract class ActionClass extends ActionSupport implements SessionAware{
	/**
	 * シリアルバージョンID生成
	 */
	private static final long serialVersionUID = -8931525766794225990L;
	/**
	 * @author Y.Gouda
	 * @since 2015/4/30
	 * sessionMap	SessionAwareによりマップ化されたセッションを同期させるためのMap変数
	 * result		実行結果を返す
	 */
	protected Map<String, Object> sessionMap;
	protected String result;
	/**
	 * struts2から呼び出されるアクションクラスメソッド
	 * @author Y.Gouda
	 * @since 2015/4/30
	 * @return result 実行結果を返す
	 */
	public abstract String execute();
	/**
	 * セッション登録メソッド
	 * @author Y.Gouda
	 * @since 2015/4/30
	 * @param session セッションを保存するMap
	 */
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
}