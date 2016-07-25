package jp.co.internous.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import jp.co.internous.dto.LoginDTO;


public class LoginDTOTest {

	/**
	 * {@link com.internousdev.openconnect.dto.LoginDTO#getEmail()}
	 */

	@Test
	public void testGetEmail1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.LoginDTO#setEmail()}
	 */
	@Test
	public void testSetEmail1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.LoginDTO#getPassword()}
	 */
	@Test
	public void testGetPassword1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.LoginDTO#setPassword()}
	 */
	@Test
	public void testSetPassword1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

}