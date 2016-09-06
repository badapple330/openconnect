/*
 * タイトル：GoItemDetailsDTOをテストする為のクラス
 * 説明    ：GoItemDetailsDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoItemDetailsDTO;

/**
 * GoItemDetailsDTOをテストする為のクラス
 * @author S.Kobata
 * @version 1.0
 * @since 1.0
 */
public class GoItemDetailsDTOTest {

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
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getId()} の為のテスト・メソッド
	 */
	@Test
	public void testGetId1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testInt0;

		test.setId(expected);

		assertSame(expected, test.getId());
		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMax;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testGetId3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMin;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setId(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetId1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testInt0;

		test.setId(expected);
		int actual = test.getId();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetId2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMax;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetId3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMin;

		test.setId(expected);
		int actual = test.getId();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getName()} の為のテスト・メソッド
	 */
	@Test
	public void testGetName1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}
	@Test
	public void testGetName7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);

		assertSame(expected, test.getName());
		assertEquals(expected, test.getName());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setName(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetName1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetName7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setName(expected);
		String actual = test.getName();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getPrice()} の為のテスト・メソッド
	 */
	@Test
	public void testGetPrice1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testInt0;

		test.setPrice(expected);

		assertSame(expected, test.getPrice());
		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMin;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setPrice(int)} の為のテスト・メソッド
	 */
	@Test
	public void testsetPrice1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testInt0;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMax;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testsetPrice3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		int expected = testIntMin;

		test.setPrice(expected);
		int actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getDetail()} の為のテスト・メソッド
	 */
	@Test
	public void testGetDetail1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}
	@Test
	public void testGetDetail7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setDetail(expected);

		assertSame(expected, test.getDetail());
		assertEquals(expected, test.getDetail());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setDetail(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetDetail1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetDetail7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setDetail(expected);
		String actual = test.getDetail();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getImgPath()} の為のテスト・メソッド
	 */
	@Test
	public void testGetImgPath1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testGetImgPath7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);

		assertSame(expected, test.getImgPath());
		assertEquals(expected, test.getImgPath());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setImgPath(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetImgPath1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImgPath7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getSetImgPath()} の為のテスト・メソッド
	 */
	@Test
	public void testGetSetImgPath1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}
	@Test
	public void testGetSetImgPath7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setSetImgPath(expected);

		assertSame(expected, test.getSetImgPath());
		assertEquals(expected, test.getSetImgPath());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setSetImgPath(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetSetImgPath1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSetImgPath7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setSetImgPath(expected);
		String actual = test.getSetImgPath();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#getAllergie()} の為のテスト・メソッド
	 */
	@Test
	public void testGetAllergie1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}
	@Test
	public void testGetAllergie7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setAllergie(expected);

		assertSame(expected, test.getAllergie());
		assertEquals(expected, test.getAllergie());
	}

	/**
	 *{@link com.internousdev.kinnosawa.DTO.GoItemDetailsDTO#setAllergie(java.lang.String)} の為のテスト・メソッド
	 */
	@Test
	public void testSetAllergie1() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringNull;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie2() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringKara;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie3() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringSpace;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie4() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkakuSpace;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie5() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankaku;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie6() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringZenkaku;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAllergie7() {
		GoItemDetailsDTO test = new GoItemDetailsDTO();
		String expected = testStringHankakuZenkaku;

		test.setAllergie(expected);
		String actual = test.getAllergie();

		assertSame(expected, actual);
		assertEquals(expected, actual);
	}
}
