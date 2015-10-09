package jp.co.internous.dto;

import static org.junit.Assert.*;

import org.junit.Test;


public class GetAddressDTOTest {

	@Test
	public void testGetId() {
	int Id=3;
	GetAddressDTO expected = new GetAddressDTO();
	expected.setId(3);
	assertEquals(Id, expected.getId());
	}

	@Test
	public void testSetId() {
	int Id=3;
	GetAddressDTO expected = new GetAddressDTO();
	expected.setId(3);
	int value =expected.getId();
	assertEquals(Id, value);
	}

	@Test
	public void testGetSiteName() {
		String siteName ="March";
		GetAddressDTO expected = new GetAddressDTO();
		expected.setSiteName(siteName);
		assertSame(siteName,expected.getSiteName());
		assertEquals(siteName,expected.getSiteName());

	}
	@Test
	public void testSetSiteName() {
		String siteName ="March";
		GetAddressDTO expected = new GetAddressDTO();
		expected.setSiteName("March");
		String value = expected.getSiteName();
		assertSame(value,siteName);
		assertEquals(value,siteName);

	}

	@Test
	public void testGetUrl() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		GetAddressDTO expected = new GetAddressDTO();
		expected.setUrl(url);
		assertSame(url,expected.getUrl());
		assertEquals(url,expected.getUrl());

	}
	@Test
	public void testSetUrl() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		GetAddressDTO expected = new GetAddressDTO();
		expected.setUrl("http://www.internousdev.com:8080/YouJustJewelry/");
		String value = expected.getUrl();
		assertSame(value,url);
		assertEquals(value,url);

	}
}
