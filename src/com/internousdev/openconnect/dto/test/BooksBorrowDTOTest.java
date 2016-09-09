/**
 *
 */
package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.booksBorrow.dto.BooksBorrowDTO;

/**
 * テスト・メソッド。
 */
public class BooksBorrowDTOTest {

	@Test
	public void testGetBookId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetBookId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetBookId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBookId(expected);

		assertEquals(expected, test.getBookId());
	}

	@Test
	public void testGetBookId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBookId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetBookId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBookId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	private void assertThat3(String message, String string) {
	}

	/**
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#setBookId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBookId1() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 0;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBookId2() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = 2147483647;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBookId3() {
		BooksBorrowDTO test = new BooksBorrowDTO();
		int expected = -2147483648;

		test.setBookId(expected);
		int actual = test.getBookId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetBookId4() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setBookId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetBookId5() throws Exception {
		BooksBorrowDTO test = new BooksBorrowDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setBookId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	/**
	 * テスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.BooksBorrowDTO#setTitle()}
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


}

