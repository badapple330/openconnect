package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.footprinter.dto.AdminEventListDTO;

/**
 * @author 冨内 峻太朗
 *
 */
public class AdminEventListDTOTest {
    
	private int testInt0;
    private int testIntMax;
    private int testIntMin;
    private String testStringNull;
    private String testStringKara;
    private String testStringSpace;
    private String testStringHankaku;
    private String testStringZenkaku;
    
/**
 * @throws Exception
 */
public void setUp() throws Exception {

    testInt0 = 0;
    testIntMax = Integer.MAX_VALUE;
    testIntMin = Integer.MIN_VALUE;
    testStringNull    = null;
    testStringKara    = "";
    testStringSpace   = " ";
    testStringHankaku = "abc123";
    testStringZenkaku = "ａｂｃ１２３あいう漢字";
    }

	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetDetail() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDetail() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDate() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDate() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetNumOfTickets()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetNumOfTickets() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetNumOfTickets()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNumOfTickets() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetRemaining()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRemaining() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetRemaining()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRemaining() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetCategoryId()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategoryId() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetCategoryId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategoryId() {
		AdminEventListDTO test = new AdminEventListDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#SetUpdatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
	/**
	 * {@link com.internousdev.footprinter.dto.AdminEventListDTO#GetUpdatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt() {
		AdminEventListDTO test = new AdminEventListDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
    }
}
