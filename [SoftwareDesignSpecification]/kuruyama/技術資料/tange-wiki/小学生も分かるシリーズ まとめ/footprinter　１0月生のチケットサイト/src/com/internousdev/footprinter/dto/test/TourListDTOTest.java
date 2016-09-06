/**
 * 
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.TourListDTO;

/**
 * @author 田原 一樹
 *
 */
public class TourListDTOTest {

	private int testInt0;
	private int testIntMax;
	private int testIntMin;
	private double testDoubleDelta;
	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;
//		testFloat = (float) 1.1;
		testStringNull    = null;
		testStringKara    = "";
		testStringSpace   = " ";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetName2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetName3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetName4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}	
	@Test
	public void testGetName5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}	
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetName2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetName3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetName4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetName5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		TourListDTO test = new TourListDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);

	}
	@Test
	public void testGetId2() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);

	}
	@Test
	public void testGetId3() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId() {
		TourListDTO test = new TourListDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetId2() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	@Test
	public void testSetId3() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDate1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setEventDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDate1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetEventDate2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetEventDate3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetEventDate4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetEventDate5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setEventDate(expected);
		String actual = test.getEventDate();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setPrice(String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice() {
	TourListDTO test = new TourListDTO();
	String expected =  testStringNull;

	test.setPrice(expected);
	String actual = test.getPrice();
		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getString()} のためのテスト・メソッド。
	 */
@Test
	public void testGetPrice() {
	TourListDTO test = new TourListDTO();
	String expected = testStringNull;;

	test.setPrice(expected);
	String actual = test.getPrice();
	assertEquals(expected, actual);
}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDetail1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetDetail2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetDetail3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetDetail4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetDetail5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setDetail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetDetail1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);

	}

	@Test
	public void testSetDetail2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetDetail3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetDetail4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetDetail5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertEquals(expected, actual);

	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetImgPath2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgPath3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgPath4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}
	@Test
	public void testGetImgPath5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {
		TourListDTO test = new TourListDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetImgPath2() {
		TourListDTO test = new TourListDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetImgPath3() {
		TourListDTO test = new TourListDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetImgPath4() {
		TourListDTO test = new TourListDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);

	}
	@Test
	public void testSetImgPath5() {
		TourListDTO test = new TourListDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#getCategoryId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategoryId1() {
		TourListDTO test = new TourListDTO();
		int expected = testInt0; 

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);

	}

	@Test
	public void testGetCategoryId2() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMax;

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);

	}
	@Test
	public void testGetCategoryId3() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMin;

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.TourListDTO#setCategoryId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategoryId1() {
		TourListDTO test = new TourListDTO();
		int expected = testInt0;

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);
	}
	/**
	 * 
	 */
	@Test
	public void testSetCategoryId2() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMax;

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);
	}/**
	 * 
	 */
	@Test
	public void testSetCategoryId3() {
		TourListDTO test = new TourListDTO();
		int expected = testIntMin;

		test.setCategoryId(expected);
		int actual = test.getCategoryId();

		assertEquals(expected, actual);
	}
}
