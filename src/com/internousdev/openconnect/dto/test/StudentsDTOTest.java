/**
 *
 */
package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.students.dto.StudentsDTO;

public class StudentsDTOTest {

	private void assertThat3(String message, String string) {
	}
	private void assertThat4(String message, String string) {
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		StudentsDTO test = new StudentsDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId2() {
		StudentsDTO test = new StudentsDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId3() {
		StudentsDTO test = new StudentsDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId4() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetUserId5() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setUserId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		StudentsDTO test = new StudentsDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		StudentsDTO test = new StudentsDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		StudentsDTO test = new StudentsDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetUserId5() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg1() {
		StudentsDTO test = new StudentsDTO();
		int expected = 0;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	@Test
	public void testGetUserFlg2() {
		StudentsDTO test = new StudentsDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	@Test
	public void testGetUserFlg3() {
		StudentsDTO test = new StudentsDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	@Test
	public void testGetUserFlg4() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserFlg(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetUserFlg5() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserFlg(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setUserFlg()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg1() {
		StudentsDTO test = new StudentsDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserFlg2() {
		StudentsDTO test = new StudentsDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserFlg3() {
		StudentsDTO test = new StudentsDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserFlg4() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserFlg(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetUserFlg5() throws Exception {
		StudentsDTO test = new StudentsDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserFlg(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setPassword()}
	 */

	@Test
	public void testSetPassword1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getFmailyName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	@Test
	public void testGetFamilyName8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyName(expected);

		assertEquals(expected, test.getFamilyName());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setFamilyName()}
	 */

	@Test
	public void testSetFamilyName1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}




	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getGivenName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	@Test
	public void testGetGivenName8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenName(expected);

		assertEquals(expected, test.getGivenName());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setGivenName()}
	 */

	@Test
	public void testSetGivenName1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenName8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}




	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getFamilyNameKanji()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	@Test
	public void testGetFamilyNameKanji8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyNameKanji(expected);

		assertEquals(expected, test.getFamilyNameKanji());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setFamilyNameKanji()}
	 */

	@Test
	public void testSetFamilyNameKanji1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKanji8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getUserdelFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserdelFlg1() {
		boolean ans = true;
		equals(ans);
	}

	@Test
	public void testGetUserdelFlg2() {
		boolean ans = false;
		equals(ans);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setUserdelFlg()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetUserdelFlg1() {
		boolean ans = true;
		equals(ans);
	}

	@Test
	public void testSetUserdelFlg2() {
		boolean ans = false;
		equals(ans);
	}




	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getFamilyNameKana()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyNameKana(expected);

		assertEquals(expected, test.getFamilyNameKana());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setFamilyNameKana()}
	 */

	@Test
	public void testSetFamilyNameKana1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}




	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getGivenNameKanji()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	@Test
	public void testGetGivenNameKanji8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenNameKanji(expected);

		assertEquals(expected, test.getGivenNameKanji());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setGivenNameKanji()}
	 */

	@Test
	public void testSetGivenNameKanji1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKanji8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getGivenNameKana()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	@Test
	public void testGetGivenNameKana8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenNameKana(expected);

		assertEquals(expected, test.getGivenNameKana());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setGivenNameKana()}
	 */

	@Test
	public void testSetGivenNameKana1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGivenNameKana8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	@Test
	public void testGetPostal8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPostal(expected);

		assertEquals(expected, test.getPostal());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setPostal()}
	 */

	@Test
	public void testSetPostal1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPostal8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setAddress()}
	 */

	@Test
	public void testSetAddress1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetAddress8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getPhoneNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}

	@Test
	public void testGetPhoneNumber8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPhoneNumber(expected);

		assertEquals(expected, test.getPhoneNumber());
	}


	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setPhoneNumber()}
	 */

	@Test
	public void testSetPhoneNumber1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneNumber8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	@Test
	public void testGetPhoneEmail8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPhoneEmail(expected);

		assertEquals(expected, test.getPhoneEmail());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setPhoneEmail()}
	 */

	@Test
	public void testSetPhoneEmail1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPhoneEmail8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getMobileNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	@Test
	public void testGetMobileNumber8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setMobileNumber(expected);

		assertEquals(expected, test.getMobileNumber());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setMobileNumber()}
	 */

	@Test
	public void testSetMobileNumber1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileNumber8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getMobileEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	@Test
	public void testGetMobileEmail8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setMobileEmail(expected);

		assertEquals(expected, test.getMobileEmail());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setMobileEmail()}
	 */

	@Test
	public void testSetMobileEmail1() {
		StudentsDTO test = new StudentsDTO();
		String expected = null;

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail2() {
		StudentsDTO test = new StudentsDTO();
		String expected = "";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail3() {
		StudentsDTO test = new StudentsDTO();
		String expected = " ";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail4() {
		StudentsDTO test = new StudentsDTO();
		String expected = "　";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail5() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail6() {
		StudentsDTO test = new StudentsDTO();
		String expected = "あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail7() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMobileEmail8() {
		StudentsDTO test = new StudentsDTO();
		String expected = "abc123あいう漢字";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}




/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getSex()} のためのテスト・メソッド。
     */
    @Test
    public void testGetSex1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

    @Test
    public void testGetSex8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setSex(expected);

        assertEquals(expected, test.getSex());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setSex()}
 */

@Test
    public void testSetSex1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetSex8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setSex(expected);
        String actual = test.getSex();

        assertEquals(expected, actual);
    }



/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getBirthday()} のためのテスト・メソッド。
     */
    @Test
    public void testGetBirthday1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

    @Test
    public void testGetBirthday8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setBirthday(expected);

        assertEquals(expected, test.getBirthday());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setBirthday()}
 */

@Test
    public void testSetBirthday1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthday8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setBirthday(expected);
        String actual = test.getBirthday();

        assertEquals(expected, actual);
    }



/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getRegisterDay()} のためのテスト・メソッド。
     */
    @Test
    public void testGetRegisterDay1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

    @Test
    public void testGetRegisterDay8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setRegisterDay(expected);

        assertEquals(expected, test.getRegisterDay());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setRegisterDay()}
 */

@Test
    public void testSetRegisterDay1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetRegisterDay8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setRegisterDay(expected);
        String actual = test.getRegisterDay();

        assertEquals(expected, actual);
    }



/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getUpdateDay()} のためのテスト・メソッド。
     */
    @Test
    public void testGetUpdateDay1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

    @Test
    public void testGetUpdateDay8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setUpdateDay(expected);

        assertEquals(expected, test.getUpdateDay());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setUpdateDay()}
 */

@Test
    public void testSetUpdateDay1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetUpdateDay8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setUpdateDay(expected);
        String actual = test.getUpdateDay();

        assertEquals(expected, actual);
    }



/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getYear()} のためのテスト・メソッド。
     */
    @Test
    public void testGetYear1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

    @Test
    public void testGetYear8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setYear(expected);

        assertEquals(expected, test.getYear());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setYear()}
 */

@Test
    public void testSetYear1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetYear8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setYear(expected);
        String actual = test.getYear();

        assertEquals(expected, actual);
    }



/**
     * {@link com.internousdev.internousdev.dto.StudentsDTO#getMonth()} のためのテスト・メソッド。
     */
    @Test
    public void testGetMonth1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

    @Test
    public void testGetMonth8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setMonth(expected);

        assertEquals(expected, test.getMonth());
    }

/**
 * {@link com.internousdev.internousdev.dto.StudentsDTO#setMonth()}
 */

@Test
    public void testSetMonth1() {
        StudentsDTO test = new StudentsDTO();
        String expected = null;

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth2() {
        StudentsDTO test = new StudentsDTO();
        String expected = "";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth3() {
        StudentsDTO test = new StudentsDTO();
        String expected = " ";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth4() {
        StudentsDTO test = new StudentsDTO();
        String expected = "　";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth5() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth6() {
        StudentsDTO test = new StudentsDTO();
        String expected = "あいう１２３";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth7() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう１２３";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetMonth8() {
        StudentsDTO test = new StudentsDTO();
        String expected = "abc123あいう漢字";

        test.setMonth(expected);
        String actual = test.getMonth();

        assertEquals(expected, actual);
    }

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg1() {
		boolean ans = true;
		equals(ans);
	}

	@Test
	public void testGetLoginFlg2() {
		boolean ans = false;
		equals(ans);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.StudentsDTO#setLoginFlg()} のためのテスト・メソッド。
	 */

	@Test
	public void testSetLoginFlg1() {
		boolean ans = true;
		equals(ans);
	}

	@Test
	public void testSetLoginFlg2() {
		boolean ans = false;
		equals(ans);
	}
}