/**
 * 
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.TourDetailDTO;

/**
 * @author internous
 *
 */
public class TourDetailDTOTest {

	
	
	private int testInt0;
	private int testIntMax;
	private int testIntMin;
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
	testStringNull    = null;
	testStringKara    = "";
	testStringSpace   = " ";
	testStringHankaku = "abc123";
	testStringZenkaku = "ａｂｃ１２３あいう漢字";
	}
	
	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setEventName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventName1() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringNull;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testSetEventName2() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringKara;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testSetEventName3() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringSpace;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testSetEventName4() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringHankaku;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testSetEventName5() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringZenkaku;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getEventName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventName1() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringNull;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testGetEventName2() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringKara;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testGetEventName3() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringSpace;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testGetEventName4() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringHankaku;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}
	
	public void testGetEventName5() {
		TourDetailDTO test = new TourDetailDTO();
		String eventName = testStringZenkaku;
		
		test.setEventName(eventName);
		String getEventName = test.getEventName();
		
		assertEquals(eventName,getEventName);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setEventDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDate1() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringNull;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testSetEventDate2() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringKara;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testSetEventDate3() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringSpace;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testSetEventDate4() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringHankaku;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testSetEventDate5() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringZenkaku;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDate1() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringNull;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testGetEventDate2() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringKara;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testGetEventDate3() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringSpace;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testGetEventDate4() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringHankaku;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}
	
	public void testGetEventDate5() {
		TourDetailDTO test = new TourDetailDTO();
		String eventDate = testStringZenkaku;
		
		test.setEventDate(eventDate);
		String getEventDate = test.getEventDate();
		
		assertEquals(eventDate,getEventDate);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringNull;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testSetPrice2() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringKara;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testSetPrice3() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringSpace;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testSetPrice4() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringHankaku;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testSetPrice5() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringZenkaku;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringNull;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testGetPrice2() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringKara;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testGetPrice3() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringSpace;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testGetPrice4() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringHankaku;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}
	
	public void testGetPrice5() {
		TourDetailDTO test = new TourDetailDTO();
		String price = testStringZenkaku;
		
		test.setPrice(price);
		String getPrice = test.getPrice();
		
		assertEquals(price,getPrice);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setRemaining(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetRemaining1() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testInt0;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}
	
	public void testSetRemaining2() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testIntMax;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}
	
	public void testSetRemaining3() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testIntMin;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getRemaining()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetRemaining1() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testInt0;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}
	
	public void testGetRemaining2() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testIntMax;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}
	
	public void testGetRemaining3() {
		TourDetailDTO test = new TourDetailDTO();
		int remaining = testIntMin;
		
		test.setRemaining(remaining);
		int getRemaining = test.getRemaining();
		
		assertEquals(remaining,getRemaining);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setDetail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetDetail() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringNull;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testSetDetai2() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringKara;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testSetDetai3() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringSpace;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testSetDetai4() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringHankaku;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testSetDetai5() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringZenkaku;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDetail1() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringNull;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}

	public void testGetDetai2() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringKara;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testGetDetai3() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringSpace;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testGetDetai4() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringHankaku;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	public void testGetDetai5() {
		TourDetailDTO test = new TourDetailDTO();
		String detail = testStringZenkaku;
		
		test.setEventDate(detail);
		String getDetail = test.getDetail();
		
		assertEquals(detail,getDetail);
	}
	
	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringNull;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testSetImgPath2() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringKara;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testSetImgPath3() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringSpace;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testSetImgPath4() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringHankaku;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testSetImgPath5() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringZenkaku;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringNull;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testGetImgPath2() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringKara;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testGetImgPath3() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringSpace;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testGetImgPath4() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringHankaku;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}
	
	public void testGetImgPath5() {
		TourDetailDTO test = new TourDetailDTO();
		String imgPath = testStringZenkaku;
		
		test.setEventDate(imgPath);
		String getImgPath = test.getImgPath();
		
		assertEquals(imgPath,getImgPath);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setComment(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment1() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringNull;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testSetComment2() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringKara;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testSetComment3() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringSpace;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testSetComment4() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringHankaku;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testSetComment5() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringZenkaku;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getComment()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment1() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringNull;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testGetComment2() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringKara;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testGetComment3() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringSpace;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testGetComment4() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringHankaku;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}
	
	public void testGetComment5() {
		TourDetailDTO test = new TourDetailDTO();
		String comment = testStringZenkaku;
		
		test.setComment(comment);
		String getComment = test.getComment();
		
		assertEquals(comment,getComment);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringNull;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testSetUserName2() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringKara;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testSetUserName3() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringSpace;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testSetUserName4() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringHankaku;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testSetUserName5() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringZenkaku;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.TourDetailDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringNull;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testGetUserName2() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringKara;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testGetUserName3() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringSpace;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testGetUserName4() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringHankaku;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}
	
	public void testGetUserName5() {
		TourDetailDTO test = new TourDetailDTO();
		String userName = testStringZenkaku;
		
		test.setUserName(userName);
		String getUserName = test.getUserName();
		
		assertEquals(userName,getUserName);
	}

}
