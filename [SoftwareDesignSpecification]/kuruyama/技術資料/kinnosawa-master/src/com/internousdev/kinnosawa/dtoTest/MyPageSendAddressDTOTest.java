/*
 * タイトル：MyPageSendAddressDTOをテストする為の処理


 * 説明    ：MyPageSendAddressDTOをテストする為の処理
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

import com.internousdev.kinnosawa.dto.MyPageSendAddressDTO;

/**
 * MyPageSendAddressDTOをテストする為のクラス
 * @author K.Kamijo
 * @version 1.0
 * @since 1.0
 *
 */
public class MyPageSendAddressDTOTest {

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
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#getId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetId1() {

	 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testInt0;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}
	@Test
	public void testGetId2() {

	 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMax;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}
	@Test
	public void testGetId3() {
	 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMin;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}
	/**
	 *
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#setId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetId1() {
		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testInt0;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}
	@Test
	public void testSetId2() {
		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMax;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	@Test
	public void testSetId3() {
		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMin;

		test.setId(expected);

		assertEquals(expected, test.getId());
	}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testInt0;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}
	@Test
	public void testGetUserId2() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testIntMax;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}
	@Test
	public void testGetUserId3() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testIntMin;

			test.setUserId(expected);

			assertEquals(expected, test.getUserId());
		}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testInt0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	@Test
	public void testSetUserId2() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMax;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}
	@Test
	public void testSetUserId3() {

		 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
		int expected=testIntMin;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#getPostalCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostalCode1() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
				int expected=testInt0;

				test.setPostalCode(expected);

				assertEquals(expected, test.getPostalCode());
			}

	@Test
	public void testGetPostalCode2() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
				int expected=testIntMax;

				test.setPostalCode(expected);

				assertEquals(expected, test.getPostalCode());
			}

	@Test
	public void testGetPostalCode3() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
				int expected=testIntMin;

				test.setPostalCode(expected);

				assertEquals(expected, test.getPostalCode());
			}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#setPostalCode(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostalCode1() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testInt0;

			test.setPostalCode(expected);

			assertEquals(expected, test.getPostalCode());
		}

	@Test
	public void testSetPostalCode2() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testIntMax;

			test.setPostalCode(expected);

			assertEquals(expected, test.getPostalCode());
		}

	@Test
	public void testSetPostalCode3() {

			 MyPageSendAddressDTO test=new  MyPageSendAddressDTO();
			int expected=testIntMin;

			test.setPostalCode(expected);

			assertEquals(expected, test.getPostalCode());
		}
	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringNull;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress2() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringKara;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress3() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress4() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringZenkakuSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress5() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringHankaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress6() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testGetAddress7() {

		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringHankakuZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#setAddress(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringNull;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress2() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringKara;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress3() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress4() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringZenkakuSpace;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress5() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringHankaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress6() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}

	@Test
	public void testSetAddress7() {
		MyPageSendAddressDTO test=new MyPageSendAddressDTO();
			String expected=testStringHankakuZenkaku;

			test.setAddress(expected);

			assertEquals(expected, test.getAddress());
		}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#getCreatedAt()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringNull;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testGetCreatedAt2() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringKara;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testGetCreatedAt3() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testGetCreatedAt4() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringZenkakuSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testGetCreatedAt5() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringHankaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testGetCreatedAt6() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}@Test
	public void testGetCreatedAt7() {

				MyPageSendAddressDTO test=new MyPageSendAddressDTO();
					String expected=testStringHankakuZenkaku;

					test.setCreatedAt(expected);

					assertEquals(expected, test.getCreatedAt());
				}


	/**
	 * {@link com.internousdev.kinnosawa.DTO.MyPageSendAddressDTO#setCreatedAt(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringNull;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedAt2() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringKara;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedA3t() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedAt4() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringZenkakuSpace;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedAt5() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringHankaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedAt6() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}
	@Test
	public void testSetCreatedAt7() {

			MyPageSendAddressDTO test=new MyPageSendAddressDTO();
				String expected=testStringHankakuZenkaku;

				test.setCreatedAt(expected);

				assertEquals(expected, test.getCreatedAt());
			}

}
