/*
 * タイトル：GoPurchaseDTOをテストする為のクラス
 * 説明    ：GoPurchaseDTOをテストする
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dtoTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.kinnosawa.dto.GoPurchaseDTO;

/**
 * GoPurchaseDTOをテストする為のクラス
 * @author K.Abe
 * @version 1.0
 * @since 1.0
 */
public class GoPurchaseDTOTest {

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
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#getGoodsId()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsId1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsId(expected);

		assertSame(expected, test.getGoodsId());
		assertEquals(expected, test.getGoodsId());
	}

	@Test
	public void testGetGoodsId2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsId(expected);

		assertEquals(expected, test.getGoodsId());
	}

	@Test
	public void testGetGoodsId3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsId(expected);

		assertEquals(expected, test.getGoodsId());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#setGoodsId(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetGoodsId1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsId2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsId3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#getGoodsName()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsName1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringNull;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringKara;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringSpace;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName4() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkakuSpace;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName5() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName6() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName7() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankakuZenkaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#setGoodsName(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetGoodsName1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringNull;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringKara;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringSpace;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName4() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkakuSpace;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName5() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName6() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName7() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankakuZenkaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#getGoodsNumber()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsNumber1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsNumber(expected);

		assertSame(expected, test.getGoodsNumber());
		assertEquals(expected, test.getGoodsNumber());
	}

	@Test
	public void testGetGoodsNumber2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsNumber(expected);

		assertEquals(expected, test.getGoodsNumber());
	}

	@Test
	public void testGetGoodsNumber3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsNumber(expected);

		assertEquals(expected, test.getGoodsNumber());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#setGoodsNumber(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetGoodsNumber1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsNumber(expected);
		int actual = test.getGoodsNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsNumber2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsNumber(expected);
		int actual = test.getGoodsNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsNumber3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsNumber(expected);
		int actual = test.getGoodsNumber();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#getGoodsPrice()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsPrice1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsPrice(expected);

		assertSame(expected, test.getGoodsPrice());
		assertEquals(expected, test.getGoodsPrice());
	}

	@Test
	public void testGetGoodsPrice2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsPrice(expected);

		assertEquals(expected, test.getGoodsPrice());
	}

	@Test
	public void testGetGoodsPrice3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsPrice(expected);

		assertEquals(expected, test.getGoodsPrice());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#setGoodsPrice(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetGoodsPrice1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testInt0;

		test.setGoodsPrice(expected);
		int actual = test.getGoodsPrice();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsPrice2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMax;

		test.setGoodsPrice(expected);
		int actual = test.getGoodsPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsPrice3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		int expected = testIntMin;

		test.setGoodsPrice(expected);
		int actual = test.getGoodsPrice();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#getImgPath()} の為のテスト・メソッド
	 */
	@Test
	public void testGetImgPath1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringNull;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringKara;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath4() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath5() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath6() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath7() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoPurchaseDTO#setImgPath(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetImgPath1() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath2() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath3() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath4() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath5() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath6() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath7() {
		GoPurchaseDTO test = new GoPurchaseDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
}
