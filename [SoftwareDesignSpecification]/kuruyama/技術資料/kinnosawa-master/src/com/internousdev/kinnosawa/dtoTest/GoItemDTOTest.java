/*
 * タイトル：GoItemDTOをテストする為のクラス
 * 説明    ：GoItemDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoItemDTO;

/**
 * GoItemDTOをテストする為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDTOTest {

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
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#getName()} の為のテスト・メソッド
	 */
	@Test
	public void testGetName1() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringNull;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName2() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringKara;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName3() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName4() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName5() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName6() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName7() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#setName(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetName1() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName2() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName3() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName4() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName5() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName6() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName7() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#getPrice()} の為のテスト・メソッド
	 */
	@Test
	public void testGetPrice1() {
		GoItemDTO test = new GoItemDTO();
		int expected = testInt0;

		test.setPrice(expected);

		assertSame(expected, test.getPrice());
		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice2() {
		GoItemDTO test = new GoItemDTO();
		int expected = testIntMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice3() {
		GoItemDTO test = new GoItemDTO();
		int expected = testIntMin;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#setPrice(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetPrice1() {
		GoItemDTO test = new GoItemDTO();
		int expected = testInt0;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice2() {
		GoItemDTO test = new GoItemDTO();
		int expected = testIntMax;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice3() {
		GoItemDTO test = new GoItemDTO();
		int expected = testIntMin;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#getImgPath()} の為のテスト・メソッド
	 */
	@Test
	public void testGetImgPath1() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringNull;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath2() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringKara;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath3() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath4() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath5() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath6() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath7() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDTO#setImgPath(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetImgPath1() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath2() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath3() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath4() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath5() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath6() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath7() {
		GoItemDTO test = new GoItemDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
}
