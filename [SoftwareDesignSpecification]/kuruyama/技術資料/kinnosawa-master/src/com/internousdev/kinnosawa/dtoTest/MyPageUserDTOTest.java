/*
 * タイトル：MyPageUserDTOをテストする為の処理


 * 説明    ：MyPageUserDTOをテストする為の処理
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

import com.internousdev.kinnosawa.dto.MyPageUserDTO;
import com.opensymphony.xwork2.interceptor.annotations.Before;

/**
 * MyPageUserDTOをテストする為のクラス
 * @author K.Kamijo
 * @version 1.1
 * @since 1.0
 *
 */
public class MyPageUserDTOTest {
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
	 * @throws Exception @throws Exception 例外処理
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
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {

			 MyPageUserDTO test=new  MyPageUserDTO();
				int expected=testInt0;

				test.setId(expected);

				assertEquals(expected, test.getId());
			}

	@Test
	public void testGetId2() {

			 MyPageUserDTO test=new  MyPageUserDTO();
				int expected=testIntMax;

				test.setId(expected);

				assertEquals(expected, test.getId());
			}

	@Test
	public void testGetId3() {

			 MyPageUserDTO test=new  MyPageUserDTO();
				int expected=testIntMin;

				test.setId(expected);

				assertEquals(expected, test.getId());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {

				 MyPageUserDTO test=new  MyPageUserDTO();
					int expected=testInt0;

					test.setId(expected);

					assertEquals(expected, test.getId());
				}

	@Test
	public void testSetId2() {

				 MyPageUserDTO test=new  MyPageUserDTO();
					int expected=testIntMax;

					test.setId(expected);

					assertEquals(expected, test.getId());
				}

	@Test
	public void testSetId3() {

				 MyPageUserDTO test=new  MyPageUserDTO();
					int expected=testIntMin;

					test.setId(expected);

					assertEquals(expected, test.getId());
				}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringNull;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail2() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringKara;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail3() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringSpace;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail4() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringZenkakuSpace;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail5() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringHankaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail6() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringZenkaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testGetEmail7() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringHankakuZenkaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setEmail(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringNull;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail2() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringKara;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail3() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringSpace;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail4() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringZenkakuSpace;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail5() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringHankaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail6() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringZenkaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}

	@Test
	public void testSetEmail7() {

					 MyPageUserDTO test=new  MyPageUserDTO();
						String expected=testStringHankakuZenkaku;

						test.setEmail(expected);

						assertEquals(expected, test.getEmail());
					}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringNull;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	@Test
	public void testGetPassword2() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringKara;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	@Test
	public void testGetPassword3() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringSpace;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	@Test
	public void testGetPassword4() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringZenkakuSpace;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	@Test
	public void testGetPassword5() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringHankaku;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	@Test
	public void testGetPassword6() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringZenkaku;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}
	@Test
	public void testGetPassword7() {

						 MyPageUserDTO test=new  MyPageUserDTO();
							String expected=testStringHankakuZenkaku;

							test.setPassword(expected);

							assertEquals(expected, test.getPassword());
						}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringNull;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword2() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringKara;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword3() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringSpace;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword4() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringZenkakuSpace;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword5() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringHankaku;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword6() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringZenkaku;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	@Test
	public void testSetPassword7() {

		MyPageUserDTO test=new  MyPageUserDTO();
			String expected=testStringHankakuZenkaku;

			test.setPassword(expected);

			assertEquals(expected, test.getPassword());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetName1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testGetName7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetName1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	@Test
	public void testSetName7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setName(expected);

		assertEquals(expected, test.getName());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getNameKana()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameKana1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testGetNameKana7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setNameKana(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameKana1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	@Test
	public void testSetNameKana7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setNameKana(expected);

		assertEquals(expected, test.getNameKana());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getTelNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTelNum1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testGetTelNum7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setTelNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetTelNum1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	@Test
	public void testSetTelNum7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setTelNum(expected);

		assertEquals(expected, test.getTelNum());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testGetPostalCode7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setPostalCode(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	@Test
	public void testSetPostalCode7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setPostalCode(expected);

		assertEquals(expected, test.getPostalCode());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testGetAddress7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	@Test
	public void testSetAddress7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setAddress(expected);

		assertEquals(expected, test.getAddress());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getCardNum()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCardNum1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringNull;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringKara;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringSpace;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringZenkakuSpace;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringHankaku;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringZenkaku;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	@Test
	public void testGetCardNum7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String  expected=testStringHankakuZenkaku;

		test.setCardNum(expected);

		assertSame(expected, test.getCardNum());
		assertEquals(expected, test.getCardNum());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setCardNum(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCardNum1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCardNum7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setCardNum(expected);
		String actual = test.getCardNum();
		assertSame(expected, actual);
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getToken()} のためのテスト・メソッド。
	 */

	@Test
	public void testGetToken1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testGetToken7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setToken(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetToken1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	@Test
	public void testSetToken7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setToken(expected);

		assertEquals(expected, test.getToken());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testGetOauthId7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setOauthId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	@Test
	public void testSetOauthId7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setOauthId(expected);

		assertEquals(expected, test.getOauthId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getOauthName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testGetOauthName7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setOauthName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	@Test
	public void testSetOauthName7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testGetCreatedAt7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	@Test
	public void testSetCreatedAt7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setCreatedAt(expected);

		assertEquals(expected, test.getCreatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#getUpdatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testGetUpdatedAt2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testGetUpdatedAt3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}
	@Test
	public void testGetUpdatedAt4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testGetUpdatedAt5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testGetUpdatedAt6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testGetUpdatedAt7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageUserDTO#setUpdatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt1() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringNull;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt2() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringKara;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt3() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringSpace;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt4() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkakuSpace;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt5() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt6() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringZenkaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

	@Test
	public void testSetUpdatedAt7() {

		MyPageUserDTO test=new  MyPageUserDTO();
		String expected=testStringHankakuZenkaku;

		test.setUpdatedAt(expected);

		assertEquals(expected, test.getUpdatedAt());
	}

}
