/*
 * タイトル：GoTopPageDTOをテストする為のクラス
 * 説明    ：GoTopPageDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoTopPageDTO;

/**
 * GoTopPageDTOをテストする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoTopPageDTOTest {

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

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringZenkakuSpace = "　";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";

	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoTopPageDTO#getName()} のためのテスト・メソッド
	 */
	@Test
	public void testGetName1() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringNull;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName2() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringKara;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName3() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringSpace;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName4() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName5() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName6() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName7() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoTopPageDTO#setName(java.lang.String)} のためのテスト・メソッド
	 */
	@Test
	public void testSetName1() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName2() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName3() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName4() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName5() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName6() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetName7() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoTopPageDTO#getImgPath()} のためのテスト・メソッド
	 */
	@Test
	public void testGetImgPath1() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath2() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath3() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath4() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath5() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath6() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath7() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoTopPageDTO#setImgPath(java.lang.String)} のためのテスト・メソッド
	 */
	@Test
	public void testSetImgPath1() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath2() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath3() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath4() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath5() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath6() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImgPath7() {
		GoTopPageDTO test = new GoTopPageDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

}