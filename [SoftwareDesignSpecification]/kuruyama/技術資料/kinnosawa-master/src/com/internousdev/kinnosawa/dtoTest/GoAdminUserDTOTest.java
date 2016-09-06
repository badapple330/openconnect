/*
 * タイトル：GoAdminUserDTOをテストする為の処理
 * 説明    ：GoAdminUserDTOをテストする為の処理
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dtoTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdev.kinnosawa.dto.GoAdminUserDTO;



/**
 * GoAdminUserDTOをテストする為のクラス
 * @author S.Makino
 * @version 1.0
 * @since 1.0
 */
public class GoAdminUserDTOTest {
	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringZenkakuSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	private String testStringHankakuZenkaku;


	/**
	 * @throws Exception 例外処理
	 */
	@Before
	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringZenkakuSpace = "　";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";

	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		GoAdminUserDTO test=new  GoAdminUserDTO();
			int expected=testInt0;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testGetId2() {
		GoAdminUserDTO test=new  GoAdminUserDTO();
			int expected=testIntMax;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testGetId3() {
		GoAdminUserDTO test=new  GoAdminUserDTO();
			int expected=testIntMin;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {

		GoAdminUserDTO test=new   GoAdminUserDTO();
			int expected=testInt0;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testSetId2() {

		GoAdminUserDTO test=new   GoAdminUserDTO();
			int expected=testIntMax;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testSetId3() {

		GoAdminUserDTO test=new   GoAdminUserDTO();
			int expected=testIntMin;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}
	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#getUserName()} のためのテスト・メソッド
	 */
	@Test
	public void testGetUserName1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	@Test
	public void testGetUserName7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setUserName(expected);
		assertSame(expected, test.getUserName());
		assertEquals(expected, test.getUserName());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#setUserName(java.lang.String)} のためのテスト・メソッド
	 */
	@Test
	public void testSetUserName1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserName7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setUserName(expected);
		String actual = test.getUserName();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}
	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#getTel()} のためのテスト・メソッド
	 */
	@Test
	public void testGetTel1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	@Test
	public void testGetTel7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setTel(expected);
		assertSame(expected, test.getTel());
		assertEquals(expected, test.getTel());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#setTel(java.lang.String)} のためのテスト・メソッド
	 */
	@Test
	public void testSetTel1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetTel2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testTel3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetTel4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetTel5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetTel6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetTel7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setTel(expected);
		String actual = test.getTel();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}


	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#getAddress()} のためのテスト・メソッド
	 */
	@Test
	public void testGetAddress1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setAddress(expected);
		assertSame(expected, test.getAddress());
		assertEquals(expected, test.getAddress());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminUserDTO#setAddress(java.lang.String)} のためのテスト・メソッド
	 */
	@Test
	public void testSetAddress1() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringNull;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetAddress2() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringKara;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testAddress3() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringSpace;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetAddress4() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkakuSpace;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetAddress5() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetAddress6() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringZenkaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testSetAddress7() {
		GoAdminUserDTO test = new GoAdminUserDTO();
		String expected = testStringHankakuZenkaku;

		test.setAddress(expected);
		String actual = test.getAddress();
		assertSame(expected, actual);
		assertEquals(expected, actual);

	}


}
