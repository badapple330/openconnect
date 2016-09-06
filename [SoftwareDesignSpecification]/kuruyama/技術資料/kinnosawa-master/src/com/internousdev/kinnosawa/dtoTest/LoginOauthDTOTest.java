/*
 * タイトル：LoginOauthDTOをテストする為のクラス
 * 説明    ：LoginOauthDTOをテストする
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

import com.internousdev.kinnosawa.dto.LoginOauthDTO;

/**
 * LoginOauthDTOをテストする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class LoginOauthDTOTest {

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringZenkakuSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	private String testStringHankakuZenkaku;

	private int testInt0;
	private int testIntMax;
	private int testIntMin;

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

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkakuSpace;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName6() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName7() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankakuZenkaku;

		test.setUserName(expected);

		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.LoginOauthDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringNull;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringKara;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringSpace;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkakuSpace;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName6() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringZenkaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName7() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = testStringHankakuZenkaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.LoginOauthDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testInt0;

		test.setUserId(expected);

		assertSame(expected, test.getUserId());
		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testIntMax;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testIntMin;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.LoginOauthDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testInt0;

		test.setUserId(expected);
		int actual = test.getUserId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testIntMax;

		test.setUserId(expected);
		int actual = test.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = testIntMin;

		test.setUserId(expected);
		int actual = test.getUserId();
		assertEquals(expected, actual);
	}
}