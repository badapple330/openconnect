/*
 * タイトル：GoRegistrationChangeDTOをテストする為のクラス
 * 説明    ：GoRegistrationChangeDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoRegistrationChangeDTO;

/**
 * GoRegistrationChangeDTOをテストする為のクラス
 * @author S.Sugimoto
 * @version 1.0
 * @since 1.0
 */
public class GoRegistrationChangeDTOTest {

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
	 * @throws java.lang.Exception 例外処理
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
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testInt0;

		test.setId(expected);

		assertSame(expected, test.getId());
		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testIntMax;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testIntMin;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	@Test
	public void testGetEmail7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setEmail(expected);

		assertSame(expected, test.getEmail());
		assertEquals(expected, test.getEmail());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setEmail(expected);
		String actual = test.getEmail();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setPassword(expected);
		String actual = test.getPassword();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetName7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setPassword(expected);

		assertSame(expected, test.getPassword());
		assertEquals(expected, test.getPassword());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetName7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		String actual = test.getName();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getNameKana()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameKana1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setNameKana(expected);

		assertSame(expected, test.getNameKana());
		assertEquals(expected, test.getNameKana());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setNameKana(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameKana1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetNameKana7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setNameKana(expected);
		String actual = test.getNameKana();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getTelNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNumber1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setTelNumber(expected);

		assertSame(expected, test.getTelNumber());
		assertEquals(expected, test.getTelNumber());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setTelNumber(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNumber1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode12() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setPostalCode(expected);
		assertSame(expected, test.getPostalCode());
		assertEquals(expected, test.getPostalCode());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostalCode7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getCardNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCardNumber1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	@Test
	public void testGetCardNumber7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setCardNumber(expected);
		assertSame(expected, test.getCardNumber());
		assertEquals(expected, test.getCardNumber());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setCardNumber(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCardNumber1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNumber7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setCardNumber(expected);
		String actual = test.getCardNumber();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#getCardToken()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCardToken1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	@Test
	public void testGetCardToken7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setCardToken(expected);
		assertSame(expected, test.getCardToken());
		assertEquals(expected, test.getCardToken());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoRegistrationChangeDTO#setCardToken(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCardToken1() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringNull;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken2() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringKara;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken3() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringSpace;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken4() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkakuSpace;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken5() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankaku;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken6() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringZenkaku;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardToken7() {
		GoRegistrationChangeDTO test = new GoRegistrationChangeDTO();
		String expected = testStringHankakuZenkaku;

		test.setCardToken(expected);
		String actual = test.getCardToken();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

}