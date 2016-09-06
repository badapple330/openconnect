package com.internousdev.footprinter.util;

import java.util.HashMap;

/**
 * イベント登録用カテゴリーMap
 * @author 北山 菜穂
 * @since  1.0
 * @version 1.0
 */
public class CategoryList {
	
	/**
	 * イベント登録用カテゴリー一覧Map
	 * @return HashMap
	 */
	public HashMap<Integer,String> getCategory(){
		HashMap<Integer,String> category = new HashMap<Integer,String>();
		category.put(1,"アフリカ");
		category.put(2,"アジア");
		category.put(3,"オーストラリア");
		category.put(4,"ヨーロッパ");
		category.put(5,"北アメリカ");
		category.put(6,"南アメリカ");
		return category;
	}
}
