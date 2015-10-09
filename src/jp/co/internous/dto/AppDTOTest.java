package jp.co.internous.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppDTOTest {


	@Test
	public void testGetId() {
	int Id=3;
	AppDTO expected = new AppDTO();
	expected.setId(3);
	assertEquals(Id, expected.getId());
	}

	@Test
	public void testSetId() {
	int Id=3;
	AppDTO expected = new AppDTO();
	expected.setId(3);
	int value =expected.getId();
	assertEquals(Id, value);
	}

	@Test
	public void testGetSiteName() {
		String siteName ="March";
		AppDTO expected = new AppDTO();
		expected.setSiteName(siteName);
		assertSame(siteName,expected.getSiteName());
		assertEquals(siteName,expected.getSiteName());

	}
	@Test
	public void testSetSiteName() {
		String siteName ="March";
		AppDTO expected = new AppDTO();
		expected.setSiteName("March");
		String value = expected.getSiteName();
		assertSame(value,siteName);
		assertEquals(value,siteName);

	}

	@Test
	public void testGetUrl() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		AppDTO expected = new AppDTO();
		expected.setUrl(url);
		assertSame(url,expected.getUrl());
		assertEquals(url,expected.getUrl());

	}
	@Test
	public void testSetUrl() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		AppDTO expected = new AppDTO();
		expected.setUrl("http://www.internousdev.com:8080/YouJustJewelry/");
		String value = expected.getUrl();
		assertSame(value,url);
		assertEquals(value,url);

	}
}