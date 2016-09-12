package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.attendance.dto.AttendanceCalendarDTO;

public class AttendanceCalendarDTOTest {

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 0;

		test.setYear(expected);

		assertEquals(expected, test.getYear());
	}

	@Test
	public void testGetYear2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 2147483647;

		test.setYear(expected);

		assertEquals(expected, test.getYear());
	}

	@Test
	public void testGetYear3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = -2147483648;

		test.setYear(expected);

		assertEquals(expected, test.getYear());
	}

	@Test
	public void testGetYear4() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setYear(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetYear5() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setYear(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	private void assertThat3(String message, String string) {
	}



	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#setYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 0;

		test.setYear(expected);
		int actual = test.getYear();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYear2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 2147483647;

		test.setYear(expected);
		int actual = test.getYear();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYear3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = -2147483648;

		test.setYear(expected);
		int actual = test.getYear();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYear4() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setYear(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetYear5() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setYear(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#getYearString()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYearString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	@Test
	public void testGetYearString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setYearString(expected);

		assertEquals(expected, test.getYearString());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#setYearString()}
	 */

	@Test
	public void testSetYearString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetYearString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setYearString(expected);
		String actual = test.getYearString();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#getMonthString()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonthString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	@Test
	public void testGetMonthString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setMonthString(expected);

		assertEquals(expected, test.getMonthString());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#setMonthString()}
	 */

	@Test
	public void testSetMonthString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetMonthString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setMonthString(expected);
		String actual = test.getMonthString();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#getDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDay1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 0;

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 2147483647;

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = -2147483648;

		test.setDay(expected);

		assertEquals(expected, test.getDay());
	}

	@Test
	public void testGetDay4() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDay(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetDay5() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDay(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#setDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDay1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 0;

		test.setDay(expected);
		int actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = 2147483647;

		test.setDay(expected);
		int actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		int expected = -2147483648;

		test.setDay(expected);
		int actual = test.getDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDay4() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setDay(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetDay5() throws Exception {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setDay(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	private void assertThat4(String message, String string) {
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#getDayString()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDayString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	@Test
	public void testGetDayString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setDayString(expected);

		assertEquals(expected, test.getDayString());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.AttendanceCalendarDTO#setDayString()}
	 */

	@Test
	public void testSetDayString1() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = null;

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString2() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString3() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = " ";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString4() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "　";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString5() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString6() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "あいう１２３";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString7() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう１２３";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetDayString8() {
		AttendanceCalendarDTO test = new AttendanceCalendarDTO();
		String expected = "abc123あいう漢字";

		test.setDayString(expected);
		String actual = test.getDayString();

		assertEquals(expected, actual);
	}


}
