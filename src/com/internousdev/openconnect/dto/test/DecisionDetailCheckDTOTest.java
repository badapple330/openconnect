/**
 *
 */
package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailCheckDTO;

public class DecisionDetailCheckDTOTest {

	private void assertThat3(String message, String string) {
	}
	private void assertThat4(String message, String string) {
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailCheckDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDecisionDetailId1() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = 0;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId2() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = 2147483647;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId3() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = -2147483648;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId4() throws Exception {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionDetailId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testGetDecisionDetailId5() throws Exception {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionDetailId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailCheckDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDecisionDetailId1() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = 0;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId2() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = 2147483647;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId3() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		int expected = -2147483648;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId4() throws Exception {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionDetailId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetDecisionDetailId5() throws Exception {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionDetailId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailCheckDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = null;

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword2() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword3() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = " ";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword4() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "　";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword5() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword6() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword7() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword8() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailCheckDTO#setHandleName()}
	 */

	@Test
	public void testSetPassword1() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword8() {
		DecisionDetailCheckDTO test = new DecisionDetailCheckDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

}
