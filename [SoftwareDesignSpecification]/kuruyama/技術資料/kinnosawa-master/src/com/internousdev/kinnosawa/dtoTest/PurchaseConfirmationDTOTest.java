/*
 * タイトル：購入確認画面に表示する情報のデータを購入確認画面で格納する為の処理

 * 説明    ：取得した購入確認画面に表示する情報のデータを格納する。
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dtoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kinnosawa.dto.PurchaseConfirmationDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 * 購入確認画面に表示する情報のデータを購入確認画面で格納する為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 */
public class PurchaseConfirmationDTOTest {

	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringZenkakuSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	private String testStringHankakuZenkaku;

	/**
	 * @throws Exception 例外処理
	 */
	@Before
	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringZenkakuSpace = "　";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";

	}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#GetGoodsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGoodsName1() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringNull;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}

	@Test
	public void testGetGoodsName2() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringKara;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName3() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName4() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringZenkakuSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName5() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringHankaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName6() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName7() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringHankakuZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#SetGoodsName((java.lang.String))} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGoodsName1() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringNull;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}

	@Test
	public void testSetGoodsName2() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringKara;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testSetGoodsName3() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testSetGoodsName4() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringZenkakuSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testSetGoodsName5() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringHankaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testSetGoodsName6() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testSetGoodsName7() {

						 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
							String expected=testStringHankakuZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#getGoodsNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetGoodsNumber1() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testInt0;

					test.setGoodsNumber(expected);

					assertEquals(expected, test.getGoodsNumber());}

	@Test
	public void testgetGoodsNumber2() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testIntMax;

					test.setGoodsNumber(expected);

					assertEquals(expected, test.getGoodsNumber());}

	@Test
	public void testgetGoodsNumber3() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testIntMin;

					test.setGoodsNumber(expected);

					assertEquals(expected, test.getGoodsNumber());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#setGoodsNumber(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetGoodsNumber1() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testInt0;

						test.setGoodsNumber(expected);

						assertEquals(expected, test.getGoodsNumber());}

	@Test
	public void testsetGoodsNumber2() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testIntMax;

						test.setGoodsNumber(expected);

						assertEquals(expected, test.getGoodsNumber());}

	@Test
	public void testsetGoodsNumber3() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testIntMin;

						test.setGoodsNumber(expected);

						assertEquals(expected, test.getGoodsNumber());}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#getGoodsSubTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetGoodsSubTotal1() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testInt0;

					test.setGoodsSubTotal(expected);

					assertEquals(expected, test.getGoodsSubTotal());}

	@Test
	public void testgetGoodsSubTotal2() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testIntMax;

					test.setGoodsSubTotal(expected);

					assertEquals(expected, test.getGoodsSubTotal());}

	@Test
	public void testgetGoodsSubTotal3() {

				 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
					int expected=testIntMin;

					test.setGoodsSubTotal(expected);

					assertEquals(expected, test.getGoodsSubTotal());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.PurchaseConfirmationDTO#setGoodsSubTotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetGoodsSubTotal1() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testInt0;

						test.setGoodsSubTotal(expected);

						assertEquals(expected, test.getGoodsSubTotal());}

	@Test
	public void testsetGoodsSubTotal2() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testIntMax;

						test.setGoodsSubTotal(expected);

						assertEquals(expected, test.getGoodsSubTotal());}

	@Test
	public void testsetGoodsSubTotal3() {

					 PurchaseConfirmationDTO test=new  PurchaseConfirmationDTO();
						int expected=testIntMin;

						test.setGoodsSubTotal(expected);

						assertEquals(expected, test.getGoodsSubTotal());}

}
