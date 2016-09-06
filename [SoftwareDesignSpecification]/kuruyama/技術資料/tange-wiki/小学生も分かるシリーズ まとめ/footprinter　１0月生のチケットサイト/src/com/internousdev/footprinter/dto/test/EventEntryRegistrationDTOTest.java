/**
 * 
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.EventEntryRegistrationDTO;

/**
 * @author 田原 一樹
 *
 */
public class EventEntryRegistrationDTOTest {
	
	private int testInt0;
	private int testIntMax;
	private int testIntMin;
	
	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	
	private double testDoubleNan;
    private double testDoubleMax;
    private double testDoublePInf;
    private double testDoubleNInf;
    private double testDoubleDelta;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;
		
		testStringNull    = null;
		testStringKara    = "";
		testStringSpace   = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		
		testDoubleNan   = Double.NaN;
		testDoubleMax   = Double.MAX_VALUE;
		testDoublePInf  = Double.POSITIVE_INFINITY;
		testDoubleNInf  = Double.NEGATIVE_INFINITY;
		testDoubleDelta = 0.0D;
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getEventName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventName() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventName(expected);
		String actual = test.getEventName();
		
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setEventName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventName() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventName(expected);
		String actual = test.getEventName();
		
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDate() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventDate(expected);
		String actual = test.getEventDate();
		
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setEventDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDate() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventDate(expected);
		String actual = test.getEventDate();
		
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		Double expected = testDoubleNan;
		
		test.setPrice(expected);
		Double actual = test.getPrice();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		Double expected = testDoubleNan;
		
		test.setPrice(expected);
		Double actual = test.getPrice();
		
		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getNumOfTickets()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNumOfTickets() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		int expected = testIntMax;
		
		test.setNumOfTickets(expected);
		int actual = test.getNumOfTickets();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setNumOfTickets(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetNumOfTickets() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		int expected = testIntMax;
		
		test.setNumOfTickets(expected);
		int actual = test.getNumOfTickets();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getEventDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDetail() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventDetail(expected);
		String actual = test.getEventDetail();
		
		assertEquals(expected, actual);
		
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setEventDetail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDetail() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setEventDetail(expected);
		String actual = test.getEventDetail();
		
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setImgPath(expected);
		String actual = test.getImgPath();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		String expected = testStringZenkaku;
		
		test.setImgPath(expected);
		String actual = test.getImgPath();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		int expected = testIntMax;
		
		test.setCategory(expected);
		int actual = test.getCategory();
		
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.EventEntryRegistrationDTO#setCategory(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory() {
		EventEntryRegistrationDTO test = new EventEntryRegistrationDTO();
		int expected = testIntMax;
		
		test.setCategory(expected);
		int actual = test.getCategory();
		
		assertEquals(expected, actual);
	}
}
