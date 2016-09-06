/*
 * タイトル：Mongoの指定したデータベースに接続する為の処理
 * 説明    ：Mongoの指定したデータベースに接続する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * Mongoの指定したデータベースに接続する為のクラス
 * @author S.Iiduka
 * @since 1.0
 * @version 1.0
 */
public class MongoDBConnector {

	/**
	 * モンゴクライアント
	 */
	private MongoClient client = null;

	/**
	 * 指定したデータベースへの接続情報を取得する為のメソッド
	 * @return DB 指定したデータベースへの接続情報
	 */
	public DB getConnection() {

		DB db = null;
		try {
			client = new MongoClient("localhost", 27017);
			db = client.getDB("kinnosawa");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return db;
	}

	/**
	 * openしたクライアントをクローズする為のメソッド
	 */
	public void closeConnection() {
		client.close();
	}

}
