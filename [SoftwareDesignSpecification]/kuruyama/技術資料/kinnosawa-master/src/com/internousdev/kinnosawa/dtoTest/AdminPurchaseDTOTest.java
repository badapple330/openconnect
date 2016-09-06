
/*
 * タイトル：AdminPurchaseDTOをテストする為のクラス
 * 説明    ：AdminPurchaseDTOをテストする
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

import com.internousdev.kinnosawa.dto.AdminPurchaseDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 * AdminPurchaseDTOをテストする為のクラス
 * @author K.Hagiwara
 * @version 1.0
 * @since 1.0
 */
public class AdminPurchaseDTOTest {

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
		 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#getUserId()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetUserId1() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testInt0;

						test.setUserId(expected);

						assertEquals(expected, test.getUserId());}

		@Test
		public void testGetUserId2() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMax;

						test.setUserId(expected);

						assertEquals(expected, test.getUserId());}

		@Test
		public void testGetUserId3() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMin;

						test.setUserId(expected);

						assertEquals(expected, test.getUserId());}
		/**
		 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#setUserId(int)} のためのテスト・メソッド。
		 */
		@Test
		public void testSetUserId1() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							int expected=testInt0;

							test.setUserId(expected);

							assertEquals(expected, test.getUserId());}

		@Test
		public void testSetUserId2() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							int expected=testIntMax;

							test.setUserId(expected);

							assertEquals(expected, test.getUserId());}

		@Test
		public void testSetUserId3() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							int expected=testIntMin;

							test.setUserId(expected);

							assertEquals(expected, test.getUserId());}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#getAddressId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddressId1() {

				 AdminPurchaseDTO test=new  AdminPurchaseDTO();
					int expected=testInt0;

					test.setAddressId(expected);

					assertEquals(expected, test.getAddressId());}

	@Test
	public void testGetAddressId2() {

				 AdminPurchaseDTO test=new  AdminPurchaseDTO();
					int expected=testIntMax;

					test.setAddressId(expected);

					assertEquals(expected, test.getAddressId());}

	@Test
	public void testGetAddressId3() {

				 AdminPurchaseDTO test=new  AdminPurchaseDTO();
					int expected=testIntMin;

					test.setAddressId(expected);

					assertEquals(expected, test.getAddressId());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#setAddressId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddressId1() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testInt0;

						test.setAddressId(expected);

						assertEquals(expected, test.getAddressId());}

	@Test
	public void testSetAddressId2() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMax;

						test.setAddressId(expected);

						assertEquals(expected, test.getAddressId());}

	@Test
	public void testSetAddressId3() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMin;

						test.setAddressId(expected);

						assertEquals(expected, test.getAddressId());}

	@Test
	public void testGetOrderNumber2() {

				 AdminPurchaseDTO test=new  AdminPurchaseDTO();
					int expected=testIntMax;

					test.setOrderNumber(expected);

					assertEquals(expected, test.getOrderNumber());}

	@Test
	public void testGetOrderNumber3() {

				 AdminPurchaseDTO test=new  AdminPurchaseDTO();
					int expected=testIntMin;

					test.setOrderNumber(expected);

					assertEquals(expected, test.getOrderNumber());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#setOrderNumber(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderNumber1() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testInt0;

						test.setOrderNumber(expected);

						assertEquals(expected, test.getOrderNumber());}

	@Test
	public void testSetOrderNumber2() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMax;

						test.setOrderNumber(expected);

						assertEquals(expected, test.getOrderNumber());}

	@Test
	public void testSetOrderNumber3() {

					 AdminPurchaseDTO test=new  AdminPurchaseDTO();
						int expected=testIntMin;

						test.setOrderNumber(expected);

						assertEquals(expected, test.getOrderNumber());}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringNull;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}

	@Test
	public void testGetUserName2() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringKara;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName3() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringSpace;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName4() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringZenkakuSpace;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName5() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringHankaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName6() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringZenkaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	@Test
	public void testGetUserName7() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringHankakuZenkaku;

							test.setUserName(expected);

							assertEquals(expected, test.getUserName());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#setUserName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringNull;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName2() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringKara;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName3() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringSpace;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName4() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringZenkakuSpace;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName5() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringHankaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName6() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringZenkaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	@Test
	public void testSetUserName7() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringHankakuZenkaku;

			test.setUserName(expected);

			assertEquals(expected, test.getUserName());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#getBuyDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBuyDate1() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringNull;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}

	@Test
	public void testGetBuyDate2() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringKara;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate3() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringSpace;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate4() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringZenkakuSpace;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate5() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringHankaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate6() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringZenkaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	@Test
	public void testGetBuyDate7() {

						 AdminPurchaseDTO test=new  AdminPurchaseDTO();
							String expected=testStringHankakuZenkaku;

							test.setBuyDate(expected);

							assertEquals(expected, test.getBuyDate());
						}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.AdminPurchaseDTO#setBuyDate(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetBuyDate1() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringNull;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate2() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringKara;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate3() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringSpace;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate4() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringZenkakuSpace;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate5() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringHankaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate6() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringZenkaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}

	@Test
	public void testSetBuyDate7() {

		 AdminPurchaseDTO test=new  AdminPurchaseDTO();
			String expected=testStringHankakuZenkaku;

			test.setBuyDate(expected);

			assertEquals(expected, test.getBuyDate());
		}
}
