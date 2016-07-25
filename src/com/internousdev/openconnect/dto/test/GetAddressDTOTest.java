package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.dto.GetAddressDTO;

public class GetAddressDTOTest {

	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#getSiteId()}
	 */
	@Test
	public void testGetSiteId1() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = 0;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testGetSiteId2() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = -2147483648;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testGetSiteId3() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = 2147483647;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testGetSiteId4() throws Exception {
		GetAddressDTO test = new GetAddressDTO();
		try {
			int siteIdMin = Integer.parseInt("-2147483649");
			test.setSiteId(siteIdMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetSiteId5() throws Exception {
		GetAddressDTO test = new GetAddressDTO();
		try {
			int siteIdMin = Integer.parseInt("2147483648");
			test.setSiteId(siteIdMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	private void assertThat1(String message, String string) {
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#setSiteId()}
	 */
	@Test
	public void testSetSiteId1() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = 0;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testSetSiteId2() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = -2147483648;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testSetSiteId3() {
		GetAddressDTO test = new GetAddressDTO();
		int expected = 2147483647;

		test.setSiteId(expected);

		assertEquals(expected, test.getSiteId());
	}

	@Test
	public void testSetSiteId4() throws Exception {
		GetAddressDTO test = new GetAddressDTO();
		try {
			int siteIdMin = Integer.parseInt("-2147483649");
			test.setSiteId(siteIdMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetSiteId5() throws Exception {
		GetAddressDTO test = new GetAddressDTO();
		try {
			int siteIdMin = Integer.parseInt("2147483648");
			test.setSiteId(siteIdMin);

		} catch (RuntimeException e) {
			assertThat2(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	private void assertThat2(String message, String string) {
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#getSiteName()}
	 */
	@Test
	public void testGetSiteName1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteName8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#setSiteName()}
	 */
	@Test
	public void testSetSiteName1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteName8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSiteName(expected);
		String actual = test.getSiteName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#getSiteUrl()}
	 */
	@Test
	public void testGetSiteUrl1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSiteUrl8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#setSiteUrl()}
	 */
	@Test
	public void testSetSiteUrl1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSiteUrl8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSiteUrl(expected);
		String actual = test.getSiteUrl();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#getGenre()}
	 */
	@Test
	public void testGetGenre1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetGenre8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.dto.GetAddressDTO#setGenre()}
	 */
	@Test
	public void testSetGenre1() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = null;

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre2() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre3() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = " ";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre4() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "　";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre5() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre6() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "あいう１２３";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre7() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "abc123あいう１２３";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetGenre8() {
		GetAddressDTO test = new GetAddressDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGenre(expected);
		String actual = test.getGenre();

		assertEquals(expected, actual);
	}


}