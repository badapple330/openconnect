/*
 * タイトル：GoAdminPurchaseDetailDTOをテストする為のクラス
 * 説明    ：GoAdminPurchaseDetailDTOをテストする
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

import com.internousdev.kinnosawa.dto.GoAdminPurchaseDetailDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 *GoAdminPurchaseDetailDTOをテストする為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseDetailDTOTest {

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
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringNull;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}

	@Test
	public void testGetUserName2() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringKara;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName3() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringSpace;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName4() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkakuSpace;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName5() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName6() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName7() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankakuZenkaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringNull;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName2() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringKara;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName3() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringSpace;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName4() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkakuSpace;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName5() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName6() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName7() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankakuZenkaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringNull;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}

	@Test
	public void testGetAddress2() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringKara;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	@Test
	public void testGetAddress3() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringSpace;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	@Test
	public void testGetAddress4() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkakuSpace;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	@Test
	public void testGetAddress5() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankaku;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	@Test
	public void testGetAddress6() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkaku;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	@Test
	public void testGetAddress7() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankakuZenkaku;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringNull;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress2() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringKara;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress3() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress4() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkakuSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress5() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress6() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress7() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankakuZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getTelNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNumber1() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringNull;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}

	@Test
	public void testGetTelNumber2() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringKara;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	@Test
	public void testGetTelNumber3() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringSpace;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	@Test
	public void testGetTelNumber4() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkakuSpace;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	@Test
	public void testGetTelNumber5() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankaku;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	@Test
	public void testGetTelNumber6() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringZenkaku;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	@Test
	public void testGetTelNumber7() {

						GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
							String expected=testStringHankakuZenkaku;

							test.setTelNumber(expected);

							assertEquals(expected, test.getTelNumber());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setTelNumber(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNumber1() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringNull;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber2() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringKara;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber3() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringSpace;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber4() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkakuSpace;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber5() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankaku;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber6() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringZenkaku;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}

	@Test
	public void testSetTelNumber7() {

		GoAdminPurchaseDetailDTO test=new GoAdminPurchaseDetailDTO();
			String expected=testStringHankakuZenkaku;

			test.setTelNumber(expected);

			assertEquals(expected, test.getTelNumber());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getGoodsName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGoodsName1() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringNull;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}

	@Test
	public void testGetGoodsName2() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringKara;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName3() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName4() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringZenkakuSpace;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName5() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringHankaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName6() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	@Test
	public void testGetGoodsName7() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringHankakuZenkaku;

							test.setGoodsName(expected);

							assertEquals(expected, test.getGoodsName());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setGoodsName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGoodsName1() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringNull;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName2() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringKara;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName3() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringSpace;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName4() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringZenkakuSpace;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName5() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringHankaku;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName6() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringZenkaku;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}

	@Test
	public void testSetGoodsName7() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringHankakuZenkaku;

			test.setGoodsName(expected);

			assertEquals(expected, test.getGoodsName());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getBuyNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBuyNumber1() {

				 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
					int expected=testInt0;

					test.setBuyNumber(expected);

					assertEquals(expected, test.getBuyNumber());}

	@Test
	public void testGetBuyNumber2() {

				 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
					int expected=testIntMax;

					test.setBuyNumber(expected);

					assertEquals(expected, test.getBuyNumber());}

	@Test
	public void testGetBuyNumber3() {

				 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
					int expected=testIntMin;

					test.setBuyNumber(expected);

					assertEquals(expected, test.getBuyNumber());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setBuyNumber(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetBuyNumber1() {

					 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
						int expected=testInt0;

						test.setBuyNumber(expected);

						assertEquals(expected, test.getBuyNumber());}

	@Test
	public void testSetBuyNumber2() {

					 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
						int expected=testIntMax;

						test.setBuyNumber(expected);

						assertEquals(expected, test.getBuyNumber());}

	@Test
	public void testSetBuyNumber3() {

					 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
						int expected=testIntMin;

						test.setBuyNumber(expected);

						assertEquals(expected, test.getBuyNumber());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#getBuyDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBuyDate1() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringNull;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}

	@Test
	public void testGetBuyDate2() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringKara;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate3() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringSpace;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate4() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringZenkakuSpace;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate5() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringHankaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate6() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringZenkaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate7() {

						 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
							String expected=testStringHankakuZenkaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.GoAdminPurchaseDetailDTO#setBuyDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetBuyDate1() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringNull;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate2() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringKara;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate3() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringSpace;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate4() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringZenkakuSpace;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate5() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringHankaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate6() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringZenkaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate7() {

		 GoAdminPurchaseDetailDTO test=new  GoAdminPurchaseDetailDTO();
			String expected=testStringHankakuZenkaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}
}
