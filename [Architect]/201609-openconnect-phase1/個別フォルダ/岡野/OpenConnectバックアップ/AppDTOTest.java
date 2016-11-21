package jp.co.internous.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppDTOTest {


	@Test
	public void testGetSite_id() {
	int Id=3;
	AppDTO expected = new AppDTO();
	expected.setSite_id(3);
	assertEquals(Id, expected.getSite_id());
	}

	@Test
	public void testSetSite_id() {
	int Id=3;
	AppDTO expected = new AppDTO();
	expected.setSite_id(3);
	int value =expected.getSite_id();
	assertEquals(Id, value);
	}

	@Test
	public void testGetSite_name() {
		String siteName ="March";
		AppDTO expected = new AppDTO();
		expected.setSite_name(siteName);
		assertSame(siteName,expected.getSite_name());
		assertEquals(siteName,expected.getSite_name());

	}
	@Test
	public void testSetSite_name() {
		String siteName ="March";
		AppDTO expected = new AppDTO();
		expected.setSite_name("March");
		String value = expected.getSite_name();
		assertSame(value,siteName);
		assertEquals(value,siteName);

	}

	@Test
	public void testGetSite_url() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		AppDTO expected = new AppDTO();
		expected.setSite_url(url);
		assertSame(url,expected.getSite_url());
		assertEquals(url,expected.getSite_url());

	}
	@Test
	public void testSetSite_url() {
		String url ="http://www.internousdev.com:8080/YouJustJewelry/";
		AppDTO expected = new AppDTO();
		expected.setSite_url("http://www.internousdev.com:8080/YouJustJewelry/");
		String value = expected.getSite_url();
		assertSame(value,url);
		assertEquals(value,url);

	}
}