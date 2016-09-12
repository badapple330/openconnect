package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.schedule.dto.ScheduleDTO;

public class ScheduleDTOTest {
	/**
	 * {@link com.internousdev.openconnect.schedule.dto.ScheduleDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = 0;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId2() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = 2147483647;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId3() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = -2147483648;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId4() throws Exception {
		ScheduleDTO test = new ScheduleDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetId5() throws Exception {
		ScheduleDTO test = new ScheduleDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	private void assertThat3(String message, String string) {
	}

	/**
	 * {@link com.internousdev.openconnect.schedule.dto.ScheduleDTO#setId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = 0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = 2147483647;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ScheduleDTO test = new ScheduleDTO();
		int expected = -2147483648;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() throws Exception {
		ScheduleDTO test = new ScheduleDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetId5() throws Exception {
		ScheduleDTO test = new ScheduleDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	private void assertThat4(String message, String string) {
	}

	/**
	 * {@link com.internousdev.openconnect.dto.schedule.ScheduleDTO#getStartday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStartDay1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}

	@Test
	public void testGetStartDay8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setStartDay(expected);

		assertEquals(expected, test.getStartDay());
	}


	public void testSetStartDay1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDay8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setStartDay(expected);
		String actual = test.getStartDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.openconnect.dto.schedule.ScheduleDTO#getEndday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEndday1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndDay2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}

	@Test
	public void testGetEndday8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setEndDay(expected);

		assertEquals(expected, test.getEndDay());
	}


	public void testSetEndDay1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndday5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndday6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDay8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setEndDay(expected);
		String actual = test.getEndDay();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.schedule.ScheduleDTO#getTitle()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTitle1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}

	@Test
	public void testGetTitle8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setTitle(expected);

		assertEquals(expected, test.getTitle());
	}


	public void testSetTitle1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setTitle(expected);
		String actual = test.getTitle();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.schedule.ScheduleDTO#getContent()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetContent1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	@Test
	public void testGetContent8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setContent(expected);

		assertEquals(expected, test.getContent());
	}

	public void testSetContent1() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = null;

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent2() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent3() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = " ";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent4() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "　";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent5() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent6() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "あいう１２３";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent7() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう１２３";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetContent8() {
		ScheduleDTO test = new ScheduleDTO();
		String expected = "abc123あいう漢字";

		test.setContent(expected);
		String actual = test.getContent();

		assertEquals(expected, actual);
	}
}
