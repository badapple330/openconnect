/**
 * 
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.MainDTO;

/**
 * @author MasakiTanaka
 *
 */
public class MainDTOTest {
	
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
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setId(int)}.
	 */
   @Test
   public void testSetId1() {
       MainDTO test = new MainDTO();
       int expected = testInt0;

       test.setId(expected);
       int actual = test.getId();

       assertEquals(expected, actual);
   }
   @Test
   public void testSetId2() {
       MainDTO test = new MainDTO();
       int expected = testInt0;

       test.setId(expected);
       int actual = test.getId();

       assertEquals(expected, actual);
   }
   @Test
   public void testSetId3() {
       MainDTO test = new MainDTO();
       int expected = testInt0;

       test.setId(expected);
       int actual = test.getId();

       assertEquals(expected, actual);
   }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getId()}.
	 */
    @Test
    public void testGetId1() {
        MainDTO test = new MainDTO();
         int expected = testInt0;

         test.setId(expected);
         int actual = test.getId();

         assertEquals(expected, actual);
    }
    @Test
    public void testGetId2() {
        MainDTO test = new MainDTO();
         int expected = testIntMax;

         test.setId(expected);
         int actual = test.getId();

         assertEquals(expected, actual);
    }
    @Test
    public void testGetId3() {
        MainDTO test = new MainDTO();
         int expected = testIntMin;

         test.setId(expected);
         int actual = test.getId();

         assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setName(java.lang.String)}.
	 */
    @Test
    public void testSetName1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetName2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetName3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetName4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetName5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getName()}.
	 */
    @Test
    public void testGetName1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetName2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetName3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetName4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetName5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setName(expected);
        String actual = test.getName();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setDate(java.lang.String)}.
	 */
    @Test
    public void testSetDate1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDate2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDate3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDate4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDate5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getDate()}.
	 */
    @Test
    public void testGetDate1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDate2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDate3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDate4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDate5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setPrice(float)}.
	 */
    @Test
    public void testSetPrice1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetPrice2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetPrice3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetPrice4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetPrice5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getPrice()}.
	 */
    @Test
    public void testGetPrice1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetPrice2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetPrice3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetPrice4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetPrice5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setPrice(expected);
        String actual = test.getPrice();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setDetail(java.lang.String)}.
	 */
    @Test
    public void testSetDetail1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDetail2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDetail3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDetail4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetDetail5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getDetail()}.
	 */
    @Test
    public void testGetDetail1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDetail2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDetail3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDetail4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetDetail5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#setImgPath(java.lang.String)}.
	 */
    @Test
    public void testSetImgPath1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetImgPath2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetImgPath3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetImgPath4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testSetImgPath5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }

	/**
	 * Test method for {@link com.internousdev.footprinter.dto.MainDTO#getImgPath()}.
	 */
    @Test
    public void testGetImgPath1() {
        MainDTO test = new MainDTO();
        String expected = testStringNull;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetImgPath2() {
        MainDTO test = new MainDTO();
        String expected = testStringKara;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetImgPath3() {
        MainDTO test = new MainDTO();
        String expected = testStringSpace;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetImgPath4() {
        MainDTO test = new MainDTO();
        String expected = testStringHankaku;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }
    @Test
    public void testGetImgPath5() {
        MainDTO test = new MainDTO();
        String expected = testStringZenkaku;

        test.setImgPath(expected);
        String actual = test.getImgPath();

        assertEquals(expected, actual);
    }

}
