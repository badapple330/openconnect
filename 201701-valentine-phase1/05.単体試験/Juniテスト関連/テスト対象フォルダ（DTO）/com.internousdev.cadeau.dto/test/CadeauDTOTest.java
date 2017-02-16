/**
 *
 */
package com.internousdev.cadeau.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.cadeau.dto.CadeauDTO;

/**
 * @author Yuta Sannomiya
 * @since 2017/1/16
 */
public class CadeauDTOTest {


/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPhoneEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#isLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testisLoginFlg1() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = true;
		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#isLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testisLoginFlg2() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = false;
		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setLoginFlg(boolean)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginFlg1() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = true;
		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setLoginFlg(boolean)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginFlg2() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = false;
		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getFamilyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setFamilyName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setGivenName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#isUserDelFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testisUserDelFlg1() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = true;
		test.setUserDelFlg(expected);
		boolean actual = test.isUserDelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#isUserDelFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testisUserDelFlg2() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = false;
		test.setUserDelFlg(expected);
		boolean actual = test.isUserDelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setUserDelFlg(boolean)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetUserDelFlg1() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = true;
		test.setUserDelFlg(expected);
		boolean actual = test.isUserDelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setUserDelFlg(boolean)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetUserDelFlg2() {
		CadeauDTO test = new CadeauDTO();
		boolean expected = false;
		test.setUserDelFlg(expected);
		boolean actual = test.isUserDelFlg();
		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setItemId(expected);

		assertEquals(expected, test.getItemId());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int ItemIdMin = Integer.parseInt("2147483648");
			test.setItemId(ItemIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int ItemIdMin = Integer.parseInt("-2147483649");
			test.setItemId(ItemIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int ItemIdMax = Integer.parseInt("2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int ItemIdMax = Integer.parseInt("-2147483649");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameJa8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameJa8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemNameJa(expected);
		String actual = test.getItemNameJa();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemNameEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemNameEn8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemNameEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemNameEn8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemNameEn(expected);
		String actual = test.getItemNameEn();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getItemCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCategory8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setItemCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCategory8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemCategory(expected);
		String actual = test.getItemCategory();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int PriceMin = Integer.parseInt("2147483648");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int PriceMin = Integer.parseInt("-2147483649");
			test.setPrice(PriceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int PriceMax = Integer.parseInt("2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int PriceMax = Integer.parseInt("-2147483649");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewJa()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewJa8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewJa(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewJa8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOverviewJa(expected);
		String actual = test.getOverviewJa();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOverviewEn()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOverviewEn8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setOverviewEn(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOverviewEn8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOverviewEn(expected);
		String actual = test.getOverviewEn();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getImgAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgAddress8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setImgAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgAddress8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgAddress(expected);
		String actual = test.getImgAddress();

		assertEquals(expected, actual);
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderCount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setOrderCount(expected);

		assertEquals(expected, test.getOrderCount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderCount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setOrderCount(expected);

		assertEquals(expected, test.getOrderCount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderCount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setOrderCount(expected);

		assertEquals(expected, test.getOrderCount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderCount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int OrderCountMin = Integer.parseInt("2147483648");
			test.setOrderCount(OrderCountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderCount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int OrderCountMin = Integer.parseInt("-2147483649");
			test.setOrderCount(OrderCountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderCount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setOrderCount(expected);
		int actual = test.getOrderCount();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderCount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setOrderCount(expected);
		int actual = test.getOrderCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderCount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setOrderCount(expected);
		int actual = test.getOrderCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderCount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int OrderCountMax = Integer.parseInt("2147483648");
			test.setOrderCount(OrderCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getOrderCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderCount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int OrderCountMax = Integer.parseInt("-2147483649");
			test.setOrderCount(OrderCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setAmount(expected);

		assertEquals(expected, test.getAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setAmount(expected);

		assertEquals(expected, test.getAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setAmount(expected);

		assertEquals(expected, test.getAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int AmountMin = Integer.parseInt("2147483648");
			test.setAmount(AmountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int AmountMin = Integer.parseInt("-2147483649");
			test.setAmount(AmountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483649");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSumAmount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setSumAmount(expected);

		assertEquals(expected, test.getSumAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSumAmount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setSumAmount(expected);

		assertEquals(expected, test.getSumAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSumAmount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setSumAmount(expected);

		assertEquals(expected, test.getSumAmount());
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSumAmount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int SumAmountMin = Integer.parseInt("2147483648");
			test.setSumAmount(SumAmountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSumAmount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int SumAmountMin = Integer.parseInt("-2147483649");
			test.setSumAmount(SumAmountMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSumAmount1() {
		CadeauDTO test = new CadeauDTO();
		int expected = 0;

		test.setSumAmount(expected);
		int actual = test.getSumAmount();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSumAmount2() {
		CadeauDTO test = new CadeauDTO();
		int expected = 2147483647;

		test.setSumAmount(expected);
		int actual = test.getSumAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSumAmount3() {
		CadeauDTO test = new CadeauDTO();
		int expected = -2147483648;

		test.setSumAmount(expected);
		int actual = test.getSumAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSumAmount4() {
		CadeauDTO test = new CadeauDTO();
		try {
			int SumAmountMax = Integer.parseInt("2147483648");
			test.setSumAmount(SumAmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getSumAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSumAmount5() {
		CadeauDTO test = new CadeauDTO();
		try {
			int SumAmountMax = Integer.parseInt("-2147483649");
			test.setSumAmount(SumAmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#getRegistrationDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegistrationDate8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate1() {
		CadeauDTO test = new CadeauDTO();
		String expected = null;

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate2() {
		CadeauDTO test = new CadeauDTO();
		String expected = "";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate3() {
		CadeauDTO test = new CadeauDTO();
		String expected = " ";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate4() {
		CadeauDTO test = new CadeauDTO();
		String expected = "　";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate5() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate6() {
		CadeauDTO test = new CadeauDTO();
		String expected = "あいう１２３";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate7() {
		CadeauDTO test = new CadeauDTO();
		String expected = "abc123あいう１２３";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.cadeau.dto.CadeauDTO#setRegistrationDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegistrationDate8() {
		CadeauDTO test = new CadeauDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegistrationDate(expected);
		String actual = test.getRegistrationDate();

		assertEquals(expected, actual);
	}

}
