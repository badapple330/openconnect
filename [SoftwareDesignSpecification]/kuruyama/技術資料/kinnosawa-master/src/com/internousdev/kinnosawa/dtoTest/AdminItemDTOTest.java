/*
 * タイトル：AdminItemDTOをテストする為のクラス
 * 説明    ：AdminItemDTOをテストする
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

import com.internousdev.kinnosawa.dto.AdminItemDTO;;

/**
 * AdminItemDTOをテストする為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminItemDTOTest {

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

	}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {

				 AdminItemDTO test=new  AdminItemDTO();
					int expected=testInt0;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	@Test
	public void testGetId2() {

				 AdminItemDTO test=new  AdminItemDTO();
					int expected=testIntMax;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	@Test
	public void testGetId3() {

				 AdminItemDTO test=new  AdminItemDTO();
					int expected=testIntMin;

					test.setId(expected);

					assertEquals(expected, test.getId());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {

					 AdminItemDTO test=new  AdminItemDTO();
						int expected=testInt0;

						test.setId(expected);

						assertEquals(expected, test.getId());}

	@Test
	public void testSetId2() {

					 AdminItemDTO test=new  AdminItemDTO();
						int expected=testIntMax;

						test.setId(expected);

						assertEquals(expected, test.getId());}

	@Test
	public void testSetId3() {

					 AdminItemDTO test=new  AdminItemDTO();
						int expected=testIntMin;

						test.setId(expected);

						assertEquals(expected, test.getId());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringNull;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}

	@Test
	public void testGetName2() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringKara;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName3() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringSpace;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName4() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringZenkakuSpace;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName5() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringHankaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName6() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringZenkaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	@Test
	public void testGetName7() {

						 AdminItemDTO test=new  AdminItemDTO();
							String expected=testStringHankakuZenkaku;

							test.setName(expected);

							assertEquals(expected, test.getName());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}

	@Test
	public void testSetName7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setName(expected);

			assertEquals(expected, test.getName());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
		}

	@Test
	public void testGetCategory7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setCategory(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}

	@Test
	public void testSetCategory7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setCategory(expected);

			assertEquals(expected, test.getCategory());
	}




	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatNan;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice2() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice3() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatPInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice4() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatNInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testGetPrice5() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatDelta;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setPrice(float)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatNan;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice2() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatMax;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice3() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatPInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice4() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatNInf;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	@Test
	public void testSetPrice5() {
		AdminItemDTO test=new AdminItemDTO();
		float expected=testFloatDelta;

		test.setPrice(expected);

		assertEquals(expected, test.getPrice(),0.0F);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDetail1() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringNull;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail2() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringKara;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail3() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringSpace;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}
	@Test
	public void testGetDetail4() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringZenkakuSpace;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail5() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringHankaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail6() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringZenkaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	@Test
	public void testGetDetail7() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringHankakuZenkaku;

				test.setDetail(expected);

				assertEquals(expected, test.getDetail());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setDetail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetDetail1() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringNull;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail2() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringKara;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail3() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringSpace;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail4() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringZenkakuSpace;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail5() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringHankaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail6() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringZenkaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	@Test
	public void testSetDetail7() {

				 AdminItemDTO test=new  AdminItemDTO();
					String expected=testStringHankakuZenkaku;

					test.setDetail(expected);

					assertEquals(expected, test.getDetail());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testGetImgPath7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}
	@Test
	public void testSetImgPath4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	@Test
	public void testSetImgPath7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setImgPath(expected);

			assertEquals(expected, test.getImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getSetImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSetImgPath1() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringNull;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath2() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringKara;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath3() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringSpace;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath4() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringZenkakuSpace;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath5() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringHankaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath6() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringZenkaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	@Test
	public void testGetSetImgPath7() {

			 AdminItemDTO test=new  AdminItemDTO();
				String expected=testStringHankakuZenkaku;

				test.setSetImgPath(expected);

				assertEquals(expected, test.getSetImgPath());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setSetImgPath(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSetImgPath1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	@Test
	public void testSetSetImgPath7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setSetImgPath(expected);

			assertEquals(expected, test.getSetImgPath());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getAllergie()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAllergie1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testGetAllergie7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setAllergie(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAllergie1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	@Test
	public void testSetAllergie7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setAllergie(expected);

			assertEquals(expected, test.getAllergie());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getCloseUp()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCloseUp1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testGetCloseUp7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setCloseUp(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCloseUp1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}

	@Test
	public void testSetCloseUp7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setCloseUp(expected);

			assertEquals(expected, test.getCloseUp());
	}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#getTopPage()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTopPage1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testGetTopPage7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankakuZenkaku;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminItemDTO#setTopPage(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTopPage1() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringNull;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage2() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringKara;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage3() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringSpace;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage4() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage5() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkakuSpace;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage6() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringHankaku;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

	@Test
	public void testSetTopPage7() {

		 AdminItemDTO test=new  AdminItemDTO();
			String expected=testStringZenkaku;

			test.setTopPage(expected);

			assertEquals(expected, test.getTopPage());
	}

}
