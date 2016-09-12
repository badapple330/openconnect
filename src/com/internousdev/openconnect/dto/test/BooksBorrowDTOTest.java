/**
 *
 */
package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.booksBorrow.dto.BooksBorrowDTO;

public class BooksBorrowDTOTest{


	private void assertThat3(String message, String string) {

	}
	private void assertThat4(String message, String string) {

	}
	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetbookId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetbookId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetbookId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetbookId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBookId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetbookId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBookId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetbookId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetbookId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetbookId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetbookId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBookId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetbookId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBookId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBorrowId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBorrowId(expected);

		assertEquals(expected, test.getBorrowId());
	}

	@Test
	public void testGetBorrowId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBorrowId(expected);

		assertEquals(expected, test.getBorrowId());
	}

	@Test
	public void testGetBorrowId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBorrowId(expected);

		assertEquals(expected, test.getBorrowId());
	}

	@Test
	public void testGetBorrowId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBorrowId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetBorrowId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBorrowId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBorrowId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBorrowId(expected);
		int actual = test.getBorrowId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBorrowId(expected);
		int actual = test.getBorrowId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBorrowId(expected);
		int actual = test.getBorrowId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBorrowId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetBorrowId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBorrowId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}



	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTitle1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ChatDTO#setHandleName()}
	 */

	@Test
	public void testSetTitle1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBorrowStatus1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	@Test
	public void testGetBorrowStatus8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setBorrowStatus(expected);

		assertEquals(expected, test.getBorrowStatus());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ChatDTO#setHandleName()}
	 */

	@Test
	public void testSetBorrowStatus1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowStatus8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setBorrowStatus(expected);
		String actual = test.getBorrowStatus();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBorrowDay1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	@Test
	public void testGetBorrowDay8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setBorrowDay(expected);

		assertEquals(expected, test.getBorrowDay());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ChatDTO#setHandleName()}
	 */

	@Test
	public void testSetBorrowDay1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = null;

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = " ";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay4() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "　";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay5() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay6() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "あいう１２３";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay7() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう１２３";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBorrowDay8() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		String expected = "abc123あいう漢字";

		test.setBorrowDay(expected);
		String actual = test.getBorrowDay();

		assertEquals(expected, actual);
	}
}

