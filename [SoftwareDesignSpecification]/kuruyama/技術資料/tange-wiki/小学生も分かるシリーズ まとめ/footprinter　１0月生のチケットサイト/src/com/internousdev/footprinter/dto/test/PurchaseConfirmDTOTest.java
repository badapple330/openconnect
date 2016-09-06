/**
 * 
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.PurchaseConfirmDTO;

/**
 * @author 丹下 陽平
 *
 */
public class PurchaseConfirmDTOTest {
	
	
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
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getEventName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventName1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventName2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventName3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventName4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventName5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setEventName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventName1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventName2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventName3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventName4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventName5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setEventName(expected);
        String actual = test.getEventName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPostalCode2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPostalCode3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPostalCode4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPostalCode5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPostalCode2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPostalCode3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPostalCode4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPostalCode5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetAddress5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetAddress5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();

        assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getCreditNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNum1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditNum2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditNum3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditNum4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditNum5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setCreditNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNum1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditNum2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditNum3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditNum4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditNum5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setCreditNum(expected);
        String actual = test.getCreditNum();

        assertEquals(expected, actual);
	}
	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getCreditToken()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditToken1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditToken2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditToken3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditToken4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetCreditToken5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setCreditToken(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditToken1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditToken2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditToken3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditToken4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetCreditToken5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setCreditToken(expected);
        String actual = test.getCreditToken();

        assertEquals(expected, actual);
	}

	
	
	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
	}

	
	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#getEventDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEventDate1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testGetEventDate5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.PurchaseConfirmDTO#setEventDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEventDate1() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringNull;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventDate2() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringKara;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventDate3() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringSpace;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventDate4() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringHankaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
	@Test
	public void testSetEventDate5() {
        PurchaseConfirmDTO test = new PurchaseConfirmDTO();
        String expected = testStringZenkaku;

        test.setEventDate(expected);
        String actual = test.getEventDate();

        assertEquals(expected, actual);
	}
}
