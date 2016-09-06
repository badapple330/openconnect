/*
 * タイトル：MyPageGoodsDTOをテストする為の処理


 * 説明    ：MyPageGoodsDTOをテストする為の処理
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdev.kinnosawa.dtoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.kinnosawa.dto.MyPageGoodsDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 * MyPageGoodsDTOをテストする為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 *
 */
public class MyPageGoodsDTOTest {

	private int testInt0;
	private int testIntMax;
	private int testIntMin;

	private float testFloatNan;
	private float testFloatMax;
	private float testFloatPInf;
	private float testFloatNInf;
	private float testFloatDelta;

	private String testStringNull;
	private String testStringKara;
	private String testStringSpace;
	private String testStringZenkakuSpace;
	private String testStringHankaku;
	private String testStringZenkaku;
	private String testStringHankakuZenkaku;

	private boolean testBooleanTrue;
	private boolean testBooleanFalse;

	/**
	 * @throws Exception 例外処理
	 */
	@Before
	public void setUp() throws Exception {

		testInt0 = 0;
		testIntMax = Integer.MAX_VALUE;
		testIntMin = Integer.MIN_VALUE;

		testFloatNan = Float.NaN;
		testFloatMax = Float.MAX_VALUE;
		testFloatPInf = Float.POSITIVE_INFINITY;
		testFloatNInf = Float.NEGATIVE_INFINITY;
		testFloatDelta = 0.0F;

		testStringNull = null;
		testStringKara = "";
		testStringSpace = " ";
		testStringZenkakuSpace = "　";
		testStringHankaku = "abc123";
		testStringZenkaku = "ａｂｃ１２３あいう漢字";
		testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";

		testBooleanTrue = true;
		testBooleanFalse = false;
	}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					int expected=testInt0;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	@Test
	public void testGetId2() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					int expected=testIntMax;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	@Test
	public void testGetId3() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					int expected=testIntMin;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {

					 MyPageGoodsDTO test=new  MyPageGoodsDTO();
						int expected=testInt0;

						test.setId(expected);

						assertEquals(expected, test.getId());}

	@Test
	public void testSetId2() {

					 MyPageGoodsDTO test=new  MyPageGoodsDTO();
						int expected=testIntMax;

						test.setId(expected);

						assertEquals(expected, test.getId());}

	@Test
	public void testSetId3() {

					 MyPageGoodsDTO test=new  MyPageGoodsDTO();
						int expected=testIntMin;

						test.setId(expected);

						assertEquals(expected, test.getId());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringNull;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}

	@Test
	public void testGetName2() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringKara;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName3() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringSpace;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName4() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringZenkakuSpace;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName5() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringHankaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName6() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringZenkaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName7() {

						 MyPageGoodsDTO test=new  MyPageGoodsDTO();
							String expected=testStringHankakuZenkaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#isCloseUp()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIsCloseUp1() {

		MyPageGoodsDTO test = new MyPageGoodsDTO();
		boolean expected = testBooleanTrue;
		test.setCloseUp(expected);
		 boolean actual = test.isCloseUp();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetIsCloseUp2() {
		MyPageGoodsDTO test = new MyPageGoodsDTO();
		boolean expected = testBooleanFalse;
		test.setCloseUp(expected);
		 boolean actual = test.isCloseUp();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setCloseUp(boolean)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIsCloseUp1() {

		MyPageGoodsDTO test = new MyPageGoodsDTO();
		boolean expected = testBooleanTrue;
		test.setCloseUp(expected);
		 boolean actual = test.isCloseUp();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetIsCloseUp2() {
		MyPageGoodsDTO test = new MyPageGoodsDTO();
		boolean expected = testBooleanFalse;
		test.setCloseUp(expected);
		 boolean actual = test.isCloseUp();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatNan;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice2() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice3() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatPInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice4() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatNInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice5() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatDelta;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatNan;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice2() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice3() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatPInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice4() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatNInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice5() {
		MyPageGoodsDTO test=new MyPageGoodsDTO();
		float expected=testFloatDelta;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDetail1() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringNull;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail2() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringKara;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail3() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringSpace;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}
	@Test
	public void testGetDetail4() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkakuSpace;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail5() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail6() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail7() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankakuZenkaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setDetail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetDetail1() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringNull;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail2() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringKara;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail3() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringSpace;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail4() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringZenkakuSpace;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail5() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringHankaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail6() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringZenkaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail7() {

				 MyPageGoodsDTO test=new  MyPageGoodsDTO();
					String expected=testStringHankakuZenkaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testSetImgPath4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getSetImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSetImgPath1() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringNull;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath2() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringKara;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath3() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringSpace;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath4() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkakuSpace;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath5() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath6() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath7() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankakuZenkaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setSetImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSetImgPath1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getAllergie()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAllergie1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setAllergie(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAllergie1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankakuZenkaku;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringNull;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt2() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringKara;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt3() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringSpace;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt4() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt5() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkakuSpace;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt6() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringHankaku;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt7() {

		 MyPageGoodsDTO test=new  MyPageGoodsDTO();
			String expected=testStringZenkaku;

			test.setCreatedAt(expected);

			assertEquals(expected, test.getCreatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#getUpdatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt1() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringNull;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt2() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringKara;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt3() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringSpace;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt4() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkakuSpace;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt5() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt6() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testGetUpdatedAt7() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankakuZenkaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageGoodsDTO#setUpdatedAt(java.lang.String)} のためのテスト・メソッド。
	 */

	@Test
	public void testSetUpdatedAt1() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringNull;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt2() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringKara;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt3() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringSpace;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt4() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkakuSpace;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt5() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt6() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringZenkaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}

	@Test
	public void testSetUpdatedAt7() {

			 MyPageGoodsDTO test=new  MyPageGoodsDTO();
				String expected=testStringHankakuZenkaku;

				test.setUpdatedAt(expected);

				assertEquals(expected, test.getUpdatedAt());
		}
}
