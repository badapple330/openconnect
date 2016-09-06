/**
 *
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.LoginDTO;


/**
 * @author internous
 *
 */
public class LoginDTOTest {


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
	public void testGetUserName() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        String actual = test.getUserName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        String actual = test.getUserName();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId() {
        LoginDTO test = new LoginDTO();
        int expected = testIntMax;

        test.setLoginId(expected);
        int actual = test.getLoginId();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#setLoginId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginId() {
        LoginDTO test = new LoginDTO();
        int expected = testInt0;

        test.setLoginId(expected);
        int actual = test.getLoginId();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#getpassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetpassword() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setpassword(expected);
        String actual = test.getpassword();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#setpassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetpassword() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setpassword(expected);
        String actual = test.getpassword();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail() {
        LoginDTO test = new LoginDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();

        assertEquals(expected, actual);
	}

}
