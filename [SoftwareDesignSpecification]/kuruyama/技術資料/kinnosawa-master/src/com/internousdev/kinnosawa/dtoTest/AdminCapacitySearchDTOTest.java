/*
 * タイトル：AdminCapacitySearchDTOをテストする為のクラス
 * 説明    ：AdminCapacitySearchDTOをテストする
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

import com.internousdev.kinnosawa.dto.AdminCapacitySearchDTO;

/**
 * AdminCapacitySearchDTOをテストする為のクラス
 * @author S.Iiduka
 * @version 1.0
 * @since 1.0
 */
public class AdminCapacitySearchDTOTest {

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
	 *{@link com.internousdev.kinnosawa.DTO.AdminCapacitySearchDTO#getGoodsName()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsName1() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringNull;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName2() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringKara;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName3() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringSpace;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName4() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringZenkakuSpace;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName5() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringHankaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName6() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringZenkaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}
	@Test
	public void testGetGoodsName7() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringHankakuZenkaku;

		test.setGoodsName(expected);

		assertSame(expected, test.getGoodsName());
		assertEquals(expected, test.getGoodsName());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.AdminCapacitySearchDTO#setGoodsName(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetGoodsName1() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringNull;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName2() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringKara;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName3() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringSpace;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName4() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringZenkakuSpace;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName5() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringHankaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName6() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringZenkaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetGoodsName7() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		String expected = testStringHankakuZenkaku;

		test.setGoodsName(expected);
		String actual = test.getGoodsName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}


	/**
	 *{@link com.internousdev.kinnosawa.DTO.AdminCapacitySearchDTO#getTotal()} の為のテスト・メソッド
	 */
	@Test
	public void testGetTotal1() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testInt0;

		test.setTotal(expected);

		assertSame(expected, test.getTotal());
		assertEquals(expected, test.getTotal());
	}

	@Test
	public void testGetTotal2() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testIntMax;

		test.setTotal(expected);

		assertEquals(expected, test.getTotal());
	}

	@Test
	public void testGetTotal3() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testIntMin;

		test.setTotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.AdminCapacitySearchDTO#setTotal(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetTotal1() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testInt0;

		test.setTotal(expected);
		int actual = test.getTotal();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetTotal2() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testIntMax;

		test.setTotal(expected);
		int actual = test.getTotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetTotal3() {
		AdminCapacitySearchDTO test = new AdminCapacitySearchDTO();
		int expected = testIntMin;

		test.setTotal(expected);
		int actual = test.getTotal();
		assertEquals(expected, actual);
	}
}
