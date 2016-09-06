/*
 * タイトル：GoCartDTOをテストする為のクラス
 * 説明    ：GoCartDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoCartDTO;

/**
 * GoCartDTOをテストする為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoCartDTOTest {

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
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getGoodsId()} の為のテスト・メソッド
	 */
	@Test
	public void testGetGoodsId1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setGoodsId(expected);

		assertSame(expected, test.getGoodsId());
		assertEquals(expected, test.getGoodsId());
	}

	@Test
	public void testGetGoodsId2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setGoodsId(expected);

		assertEquals(expected, test.getGoodsId());
	}

	@Test
	public void testGetGoodsId3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setGoodsId(expected);

		assertEquals(expected, test.getGoodsId());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setGoodsId(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetGoodsId1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsId2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetGoodsId3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setGoodsId(expected);
		int actual = test.getGoodsId();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getImgPath()} の為のテスト・メソッド
	 */
	@Test
	public void testGetImgPath1() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringNull;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath2() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringKara;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath3() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath4() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath5() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath6() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath7() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setImgPath(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetImgPath1() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath2() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath3() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath4() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath5() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath6() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath7() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}


	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getName()} の為のテスト・メソッド
	 */
	@Test
	public void testGetName1() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringNull;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName2() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringKara;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName3() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName4() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName5() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName6() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName7() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setName(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetName1() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName2() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName3() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName4() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName5() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName6() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName7() {
		GoCartDTO test = new GoCartDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getPrice()} の為のテスト・メソッド
	 */
	@Test
	public void testGetPrice1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setPrice(expected);

		assertSame(expected, test.getPrice());
		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setPrice(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetPrice1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getCount()} の為のテスト・メソッド
	 */
	@Test
	public void testGetCount1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setCount(expected);

		assertSame(expected, test.getCount());
		assertEquals(expected, test.getCount());
	}

	@Test
	public void testGetCount2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setCount(expected);

		assertEquals(expected, test.getCount());
	}

	@Test
	public void testGetCount3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setCount(expected);

		assertEquals(expected, test.getCount());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setCount(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetCount1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setCount(expected);
		int actual = test.getCount();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetCount2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setCount(expected);
		int actual = test.getCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetCount3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setCount(expected);
		int actual = test.getCount();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#getCountPrice()} の為のテスト・メソッド
	 */
	@Test
	public void testGetCountPrice1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setCountPrice(expected);

		assertSame(expected, test.getCountPrice());
		assertEquals(expected, test.getCountPrice());
	}

	@Test
	public void testGetCountPrice2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setCountPrice(expected);

		assertEquals(expected, test.getCountPrice());
	}

	@Test
	public void testGetCountPrice3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setCountPrice(expected);

		assertEquals(expected, test.getCountPrice());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoCartDTO#setCountPrice(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetCountPrice1() {
		GoCartDTO test = new GoCartDTO();
		int expected = testInt0;

		test.setCountPrice(expected);
		int actual = test.getCountPrice();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetCountPrice2() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMax;

		test.setCountPrice(expected);
		int actual = test.getCountPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetCountPrice3() {
		GoCartDTO test = new GoCartDTO();
		int expected = testIntMin;

		test.setCountPrice(expected);
		int actual = test.getCountPrice();
		assertEquals(expected, actual);
	}
}
