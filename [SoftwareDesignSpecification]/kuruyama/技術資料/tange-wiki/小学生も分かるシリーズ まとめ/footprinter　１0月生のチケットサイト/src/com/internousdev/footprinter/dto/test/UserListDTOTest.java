package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.footprinter.dto.UserListDTO;

/**
 * @author 小澤 竜樹
 *
 */
public class UserListDTOTest {

	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringHankaku;
	private String testStringZenkaku;

	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetId() {
		UserListDTO test = new UserListDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setId(int)} のためのテスト・メソッド。
	 */

	@Test
	public void testSetId() {
		UserListDTO test = new UserListDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetEmail()}のためのテスト・メソッド。
	 */

	@Test
	public void testGetEmail1() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setEmail()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetEmail() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetPassWord()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassWord() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getPassWord();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setPassword()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetPassword() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getPassWord();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetPassWord()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getPassWord();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setPassword()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetName() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetNamekana()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNamekana() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getNameKana();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setNamekana()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetNamekana() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getNameKana();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetTel()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetTel() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setTel(expected);
		String actual = test.getTel();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setTel()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetTel() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPassword(expected);
		String actual = test.getTel();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetPostalcode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalcode() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setTel(expected);
		String actual = test.getPostalCode();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setPostalcode()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetPostalcode() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setPostalCode(expected);
		String actual = test.getPostalCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetAdress()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetAdress() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setPostalcode()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetAdress() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetCredittoken()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCredittoken() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreditToken(expected);
		String actual = test.getCreditToken();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setCredittoken()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetCredittoken() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreditToken(expected);
		String actual = test.getCreditToken();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetCreditnum()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditnum() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreditNum(expected);
		String actual = test.getCreditNum();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setCreditnum()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetCreditnum() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreditNum(expected);
		String actual = test.getCreditNum();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetUniqueid()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUniqueid() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setUniqueId(expected);
		String actual = test.getUniqueId();

		assertEquals(expected, actual);
	}
	
	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setUniqueid()} のためのテスト・メソッド。
	 */
	
	@Test
	public void testSetUniqueid() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setUniqueId(expected);
		String actual = test.getUniqueId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetCreatedat()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedat() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setCreatedat()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetCreatedat() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetUpdatedat()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedat() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setUpdatedat()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetUpdatedatt() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}
	

	/**
	 * {@link com.internousdev.footprinter.dto.UserListDTO#GetPage()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPage() {
		UserListDTO test = new UserListDTO();
		int expected = testInt0;

		test.setPage(expected);
		int actual = test.getPage();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.lereve.dto.UserListDTO#setPage()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetPage() {
		UserListDTO test = new UserListDTO();
		String expected = testStringNull;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}
}
