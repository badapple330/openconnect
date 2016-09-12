/**
 *
 */
package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.decisionDetail.dto.DecisionDetailDTO;

public class DecisionDetailDTOTest {

	private void assertThat3(String message, String string) {
	}
	private void assertThat4(String message, String string) {
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProjectId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProjectId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setProjectId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetProjectId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProjectId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProjectId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setProjectId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testGetUserId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetUserId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetUserId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPersons1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setPersons(expected);

		assertEquals(expected, test.getPersons());
	}

	@Test
	public void testGetPersons2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setPersons(expected);

		assertEquals(expected, test.getPersons());
	}

	@Test
	public void testGetPersons3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setPersons(expected);

		assertEquals(expected, test.getPersons());
	}

	@Test
	public void testGetPersons4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setPersons(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPersons5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setPersons(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPersons1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setPersons(expected);
		int actual = test.getPersons();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPersons2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setPersons(expected);
		int actual = test.getPersons();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPersons3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setPersons(expected);
		int actual = test.getPersons();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPersons4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setPersons(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPersons5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setPersons(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDecisionId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setDecisionId(expected);

		assertEquals(expected, test.getDecisionId());
	}

	@Test
	public void testGetDecisionId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setDecisionId(expected);

		assertEquals(expected, test.getDecisionId());
	}

	@Test
	public void testGetDecisionId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setDecisionId(expected);

		assertEquals(expected, test.getDecisionId());
	}

	@Test
	public void testGetDecisionId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetDecisionId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDecisionId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setDecisionId(expected);
		int actual = test.getDecisionId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setDecisionId(expected);
		int actual = test.getDecisionId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setDecisionId(expected);
		int actual = test.getDecisionId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetDecisionId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDecisionDetailId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setDecisionDetailId(expected);

		assertEquals(expected, test.getDecisionDetailId());
	}

	@Test
	public void testGetDecisionDetailId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionDetailId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetDecisionDetailId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionDetailId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDecisionDetailId1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 0;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = 2147483647;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		int expected = -2147483648;

		test.setDecisionDetailId(expected);
		int actual = test.getDecisionDetailId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionDetailId4() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDecisionDetailId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetDecisionDetailId5() throws Exception {
		DecisionDetailDTO test = new DecisionDetailDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDecisionDetailId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDay(expected);
		String actual = test.getDay();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDecisionType1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	@Test
	public void testGetDecisionType8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDecisionType(expected);

		assertEquals(expected, test.getDecisionType());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetDecisionType1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionType8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDecisionType(expected);
		String actual = test.getDecisionType();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDecisionStatus1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	@Test
	public void testGetDecisionStatus8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDecisionStatus(expected);

		assertEquals(expected, test.getDecisionStatus());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetDecisionStatus1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDecisionStatus8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setDecisionStatus(expected);
		String actual = test.getDecisionStatus();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	@Test
	public void testGetItemName8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setItemName(expected);

		assertEquals(expected, test.getItemName());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetItemName1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetItemName8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSummary1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	@Test
	public void testGetSummary8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setSummary(expected);

		assertEquals(expected, test.getSummary());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetSummary1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSummary8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setSummary(expected);
		String actual = test.getSummary();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCause1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	@Test
	public void testGetCause8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setCause(expected);

		assertEquals(expected, test.getCause());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetCause1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetCause8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setCause(expected);
		String actual = test.getCause();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStartDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetStartDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEndDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetEndDay1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPlan1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	@Test
	public void testGetPlan8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setPlan(expected);

		assertEquals(expected, test.getPlan());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetPlan1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlan8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setPlan(expected);
		String actual = test.getPlan();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	@Test
	public void testGetPassword8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);

		assertEquals(expected, test.getPassword());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetPassword1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectName1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.DecisionDetailDTO#setHandleName()}
	 */

	@Test
	public void testSetProjectName1() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = null;

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName2() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName3() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = " ";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName4() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "　";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName5() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName6() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName7() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName8() {
		DecisionDetailDTO test = new DecisionDetailDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}
}
