/**
 *
 */
package com.internousdev.footprinter.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.footprinter.dto.LoginOauthDTO;

/**
 * @author Raimu Hara
 *
 */
public class LoginOauthDTOTest {
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
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName() {
        LoginOauthDTO test = new LoginOauthDTO();
        String userName = testStringNull;

        test.setUserName(userName);
        String getUserName = test.getUserName();

        assertEquals(userName, getUserName);
    }

	/**
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName() {
        LoginOauthDTO test = new LoginOauthDTO();
        String value = testStringNull;

        test.setUserName(value);
        String userName = test.getUserName();

        assertEquals(value, userName);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId() {
        LoginOauthDTO test = new LoginOauthDTO();
        int userId = testInt0;

        test.setUserId(userId);
        int getUserId = test.getUserId();

        assertEquals(userId, getUserId);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId() {
        LoginOauthDTO test = new LoginOauthDTO();
        int value = testInt0;

        test.setUserId(value);
        int userId = test.getUserId();

        assertEquals(value, userId);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#getuserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserName() {
        LoginOauthDTO test = new LoginOauthDTO();
        String userName = testStringNull;

        test.setUserName(userName);
        String getUserName = test.getUserName();

        assertEquals(userName, getUserName);
	}

	/**
	 * {@link com.internousdev.footprinter.dto.LoginOauthDTO#getuserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId() {
        LoginOauthDTO test = new LoginOauthDTO();
        int userId = testInt0;

        test.setUserId(userId);
        int getUserId = test.getUserId();

        assertEquals(userId, getUserId);
	}

}
