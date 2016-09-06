/*
 * タイトル：ContactDTOをテストする為のクラス
 * 説明    ：ContactDTOをテストする
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

import com.internousdev.kinnosawa.dto.ContactDTO;

/**
 * ContactDTOをテストする為のクラス
 * @author Y.Tasiro
 * @version 1.0
 * @since 1.0
 */
public class ContactDTOTest {

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
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		ContactDTO test = new ContactDTO();
		int expected = testInt0;

		test.setId(expected);

		assertSame(expected, test.getId());
		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId2() {
		ContactDTO test = new ContactDTO();
		int expected = testIntMax;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId3() {
		ContactDTO test = new ContactDTO();
		int expected = testIntMin;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		ContactDTO test = new ContactDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		ContactDTO test = new ContactDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ContactDTO test = new ContactDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#getQuestionName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuestionName1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	@Test
	public void testGetQuestionName7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionName(expected);

		assertSame(expected, test.getQuestionName());
		assertEquals(expected, test.getQuestionName());
	}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#setQuestionName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuestionName1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionName7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionName(expected);
		String actual = test.getQuestionName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#getQuestionEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuestionEmail1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}
	@Test
	public void testGetQuestionEmail7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionEmail(expected);

		assertSame(expected, test.getQuestionEmail());
		assertEquals(expected, test.getQuestionEmail());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#setQuestionEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuestionEmail1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionEmail7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionEmail(expected);
		String actual = test.getQuestionEmail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#getQuestionText()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetQuestionText1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}
	@Test
	public void testGetQuestionText7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionText(expected);

		assertSame(expected, test.getQuestionText());
		assertEquals(expected, test.getQuestionText());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#setQuestionText(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetQuestionText1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetQuestionText7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setQuestionText(expected);
		String actual = test.getQuestionText();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}
	@Test
	public void testGetCreatedAt7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setCreatedAt(expected);

		assertSame(expected, test.getCreatedAt());
		assertEquals(expected, test.getCreatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.ContactDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {
		ContactDTO test = new ContactDTO();
		String expected = testStringNull;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt2() {
		ContactDTO test = new ContactDTO();
		String expected = testStringKara;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt3() {
		ContactDTO test = new ContactDTO();
		String expected = testStringSpace;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt4() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkakuSpace;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt5() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankaku;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt6() {
		ContactDTO test = new ContactDTO();
		String expected = testStringZenkaku;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetCreatedAt7() {
		ContactDTO test = new ContactDTO();
		String expected = testStringHankakuZenkaku;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
}
