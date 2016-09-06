/*
 * タイトル：MyPageOrderHistoryDTOをテストする為の処理


 * 説明    ：MyPageOrderHistoryDTOをテストする為の処理
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

import com.internousdev.kinnosawa.dto.MyPageOrderHistoryDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 * MyPageOrderHistoryDTOをテストする為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 *
 */
public class MyPageOrderHistoryDTOTest {

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
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {
		 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testInt0;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testGetId2() {
		 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testIntMax;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testGetId3() {
		 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testIntMin;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {

		 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
			int expected=testInt0;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testSetId2() {

		 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
			int expected=testIntMax;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	@Test
	public void testSetId3() {

		 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
			int expected=testIntMin;

			test.setId(expected);

			assertEquals(expected, test.getId());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getOrderNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOrderNumber1() {

			 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testInt0;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	@Test
	public void testGetOrderNumber2() {

			 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testIntMax;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	@Test
	public void testGetOrderNumber3() {

			 MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testIntMin;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setOrderNumber(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOrderNumber1() {

			 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
				int expected=testInt0;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	@Test
	public void testSetOrderNumber2() {

			 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
				int expected=testIntMax;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	@Test
	public void testSetOrderNumber3() {

			 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
				int expected=testIntMin;

				test.setOrderNumber(expected);

				assertEquals(expected, test.getOrderNumber());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {

		MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testInt0;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}

	@Test
	public void testGetUserId2() {

		MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testIntMax;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}

	@Test
	public void testGetUserId3() {

		MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
			int expected=testIntMin;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {

				 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
					int expected=testInt0;

					test.setUserId(expected);

					assertEquals(expected, test.getUserId());
				}

	@Test
	public void testSetUserId2() {

				 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
					int expected=testIntMax;

					test.setUserId(expected);

					assertEquals(expected, test.getUserId());
				}


	@Test
	public void testSetUserId3() {

				 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
					int expected=testIntMin;

					test.setUserId(expected);

					assertEquals(expected, test.getUserId());
				}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getSendId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSendId1() {

			MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testInt0;

				test.setSendId(expected);

				assertEquals(expected, test.getSendId());
			}

	@Test
	public void testGetSendId2() {

			MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testIntMax;

				test.setSendId(expected);

				assertEquals(expected, test.getSendId());
			}

	@Test
	public void testGetSendId3() {

			MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
				int expected=testIntMin;

				test.setSendId(expected);

				assertEquals(expected, test.getSendId());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setSendId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSendId1() {

					 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
						int expected=testInt0;

						test.setSendId(expected);

						assertEquals(expected, test.getSendId());
					}

	@Test
	public void testSetSendId2() {

					 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
						int expected=testIntMax;

						test.setSendId(expected);

						assertEquals(expected, test.getSendId());
					}

	@Test
	public void testSetSendId3() {

					 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
						int expected=testIntMin;

						test.setSendId(expected);

						assertEquals(expected, test.getSendId());
					}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getGoodsId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetGoodsId1() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testInt0;

					test.setGoodsId(expected);

					assertEquals(expected, test.getGoodsId());
				}

	@Test
	public void testGetGoodsId2() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testIntMax;

					test.setGoodsId(expected);

					assertEquals(expected, test.getGoodsId());
				}

	@Test
	public void testGetGoodsId3() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testIntMin;

					test.setGoodsId(expected);

					assertEquals(expected, test.getGoodsId());
				}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setGoodsId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetGoodsId1() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testInt0;

							test.setGoodsId(expected);

							assertEquals(expected, test.getGoodsId());
						}

	@Test
	public void testSetGoodsId2() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testIntMax;

							test.setGoodsId(expected);

							assertEquals(expected, test.getGoodsId());
						}

	@Test
	public void testSetGoodsId3() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testIntMin;

							test.setGoodsId(expected);

							assertEquals(expected, test.getGoodsId());
						}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getNumber()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNumber1() {

					MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
						int expected=testInt0;

						test.setNumber(expected);

						assertEquals(expected, test.getNumber());
					}

	@Test
	public void testGetNumber2() {

					MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
						int expected=testIntMax;

						test.setNumber(expected);

						assertEquals(expected, test.getNumber());
					}

	@Test
	public void testGetNumber3() {

					MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
						int expected=testIntMin;

						test.setNumber(expected);

						assertEquals(expected, test.getNumber());
					}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setNumber(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetNumber1() {

							 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
								int expected=testInt0;

								test.setNumber(expected);

								assertEquals(expected, test.getNumber());
							}

	@Test
	public void testSetNumber2() {

							 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
								int expected=testIntMax;

								test.setNumber(expected);

								assertEquals(expected, test.getNumber());
							}

	@Test
	public void testSetNumber3() {

							 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
								int expected=testIntMin;

								test.setNumber(expected);

								assertEquals(expected, test.getNumber());
							}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringNull;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt2() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringKara;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt3() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt4() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringZenkakuSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt5() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringHankaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt6() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testGetCreatedAt7() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringHankakuZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringNull;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt2() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringKara;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt3() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt4() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringZenkakuSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt5() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringHankaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt6() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	@Test
	public void testSetCreatedAt7() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
				String expected=testStringHankakuZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringNull;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName2() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringKara;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName3() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringSpace;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName4() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringZenkakuSpace;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName5() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringHankaku;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName6() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringZenkaku;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testGetName7() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringHankakuZenkaku;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringNull;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName2() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringKara;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName3() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringSpace;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName4() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringZenkakuSpace;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName5() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringHankaku;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName6() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringZenkaku;
					test.setName(expected);

					assertEquals(expected, test.getName());
				}

	@Test
	public void testSetName7() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringHankakuZenkaku;

					test.setName(expected);

					assertEquals(expected, test.getName());
				}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringNull;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress2() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringKara;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress3() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringSpace;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress4() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringZenkakuSpace;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress5() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringHankaku;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress6() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringZenkaku;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testGetAddress7() {

			MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringHankakuZenkaku;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringNull;

					test.setAddress(expected);

					assertEquals(expected, test.getAddress());
				}

	@Test
	public void testSetAddress2() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
					String expected=testStringKara;

					test.setAddress(expected);

					assertEquals(expected, test.getAddress());
				}

	@Test
	public void testSetAddress3() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
						String expected=testStringSpace;

						test.setAddress(expected);

						assertEquals(expected, test.getAddress());
					}

	@Test
	public void testSetAddress4() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
							String expected=testStringZenkakuSpace;

							test.setAddress(expected);

							assertEquals(expected, test.getAddress());
						}

	@Test
	public void testSetAddress5() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
								String expected=testStringHankaku;

								test.setAddress(expected);

								assertEquals(expected, test.getAddress());
							}

	@Test
	public void testSetAddress6() {

		MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
									String expected=testStringZenkaku;

									test.setAddress(expected);

									assertEquals(expected, test.getAddress());
								}

	@Test
	public void testSetAddress7() {

		 MyPageOrderHistoryDTO test=new MyPageOrderHistoryDTO();
										String expected=testStringHankakuZenkaku;

										test.setAddress(expected);

										assertEquals(expected, test.getAddress());
									}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testInt0;

					test.setPrice(expected);

					assertEquals(expected, test.getPrice());
				}

	@Test
	public void testGetPrice2() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testIntMax;

					test.setPrice(expected);

					assertEquals(expected, test.getPrice());
				}

	@Test
	public void testGetPrice3() {

				MyPageOrderHistoryDTO test=new  MyPageOrderHistoryDTO();
					int expected=testIntMin;

					test.setPrice(expected);

					assertEquals(expected, test.getPrice());
				}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageOrderHistoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testInt0;

							test.setPrice(expected);

							assertEquals(expected, test.getPrice());
						}

	@Test
	public void testSetPrice2() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testIntMax;

							test.setPrice(expected);

							assertEquals(expected, test.getPrice());
						}

	@Test
	public void testSetPrice3() {

						 MyPageOrderHistoryDTO test=new   MyPageOrderHistoryDTO();
							int expected=testIntMin;

							test.setPrice(expected);

							assertEquals(expected, test.getPrice());
						}
}
