package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.projects.dto.ProjectsSearchDTO;

public class ProjectsSearchDTOTest {

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getProjectId()} のためのテスト・メソッド。
	 */
	@Test
	    public void testGetProjectId1() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 0;

	        test.setProjectId(expected);

	        assertEquals(expected, test.getProjectId());
	    }

	    @Test
	    public void testGetProjectId2() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 2147483647;

	        test.setProjectId(expected);

	        assertEquals(expected, test.getProjectId());
	    }

	    @Test
	    public void testGetProjectId3() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = -2147483648;

	        test.setProjectId(expected);

	        assertEquals(expected, test.getProjectId());
	    }

	    @Test
	    public void testGetProjectId4() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMin = Integer.parseInt("-2147483649");
	            test.setProjectId(postalMin);

	        } catch (RuntimeException e) {
	            assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
	        }
	    }

	    @Test
	    public void testGetProjectId5() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMax = Integer.parseInt("2147483648");
	            test.setProjectId(postalMax);

	        } catch (RuntimeException e) {
	            assertThat3(e.getMessage(), "For input string: \"2147483648\"");
	        }
	    }
	    private void assertThat3(String message, String string) {
	    }



	    /**
	     * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setProjectId()}
	     * のためのテスト・メソッド。
	     */
	    @Test
	    public void testSetProjectId1() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 0;

	        test.setProjectId(expected);
	        int actual = test.getProjectId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetProjectId2() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 2147483647;

	        test.setProjectId(expected);
	        int actual = test.getProjectId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetProjectId3() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = -2147483648;

	        test.setProjectId(expected);
	        int actual = test.getProjectId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetProjectId4() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMin = Integer.parseInt("-2147483649");
	            test.setProjectId(postalMin);

	        } catch (RuntimeException e) {
	            assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
	        }
	    }

	    @Test
	    public void testSetProjectId5() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMax = Integer.parseInt("2147483648");
	            test.setProjectId(postalMax);

	        } catch (RuntimeException e) {
	            assertThat4(e.getMessage(), "For input string: \"2147483648\"");
	        }
	    }
	    private void assertThat4(String message, String string) {
	    }


	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getProjectName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectName1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setProjectName()}
	 */

	@Test
	public void testSetProjectName1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getManagerId()} のためのテスト・メソッド。
	 */
	@Test
	    public void testGetManagerId1() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 0;

	        test.setManagerId(expected);

	        assertEquals(expected, test.getManagerId());
	    }

	    @Test
	    public void testGetManagerId2() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 2147483647;

	        test.setManagerId(expected);

	        assertEquals(expected, test.getManagerId());
	    }

	    @Test
	    public void testGetManagerId3() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = -2147483648;

	        test.setManagerId(expected);

	        assertEquals(expected, test.getManagerId());
	    }

	    @Test
	    public void testGetManagerId4() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMin = Integer.parseInt("-2147483649");
	            test.setManagerId(postalMin);

	        } catch (RuntimeException e) {
	            assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
	        }
	    }

	    @Test
	    public void testGetManagerId5() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMax = Integer.parseInt("2147483648");
	            test.setManagerId(postalMax);

	        } catch (RuntimeException e) {
	            assertThat3(e.getMessage(), "For input string: \"2147483648\"");
	        }
	    }




	    /**
	     * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setManagerId()}
	     * のためのテスト・メソッド。
	     */
	    @Test
	    public void testSetManagerId1() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 0;

	        test.setManagerId(expected);
	        int actual = test.getManagerId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetManagerId2() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = 2147483647;

	        test.setManagerId(expected);
	        int actual = test.getManagerId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetManagerId3() {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        int expected = -2147483648;

	        test.setManagerId(expected);
	        int actual = test.getManagerId();

	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetManagerId4() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMin = Integer.parseInt("-2147483649");
	            test.setManagerId(postalMin);

	        } catch (RuntimeException e) {
	            assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
	        }
	    }

	    @Test
	    public void testSetManagerId5() throws Exception {
	        ProjectsSearchDTO test = new ProjectsSearchDTO();
	        try {
	            int postalMax = Integer.parseInt("2147483648");
	            test.setManagerId(postalMax);

	        } catch (RuntimeException e) {
	            assertThat4(e.getMessage(), "For input string: \"2147483648\"");
	        }
	    }


	    /**
	     * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getSubManagerId()} のためのテスト・メソッド。
	     */
	    @Test
	        public void testGetSubManagerId1() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = 0;

	            test.setSubManagerId(expected);

	            assertEquals(expected, test.getSubManagerId());
	        }

	        @Test
	        public void testGetSubManagerId2() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = 2147483647;

	            test.setSubManagerId(expected);

	            assertEquals(expected, test.getSubManagerId());
	        }

	        @Test
	        public void testGetSubManagerId3() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = -2147483648;

	            test.setSubManagerId(expected);

	            assertEquals(expected, test.getSubManagerId());
	        }

	        @Test
	        public void testGetSubManagerId4() throws Exception {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            try {
	                int postalMin = Integer.parseInt("-2147483649");
	                test.setSubManagerId(postalMin);

	            } catch (RuntimeException e) {
	                assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
	            }
	        }

	        @Test
	        public void testGetSubManagerId5() throws Exception {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            try {
	                int postalMax = Integer.parseInt("2147483648");
	                test.setSubManagerId(postalMax);

	            } catch (RuntimeException e) {
	                assertThat3(e.getMessage(), "For input string: \"2147483648\"");
	            }
	        }




	        /**
	         * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setSubManagerId()}
	         * のためのテスト・メソッド。
	         */
	        @Test
	        public void testSetSubManagerId1() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = 0;

	            test.setSubManagerId(expected);
	            int actual = test.getSubManagerId();

	            assertEquals(expected, actual);
	        }

	        @Test
	        public void testSetSubManagerId2() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = 2147483647;

	            test.setSubManagerId(expected);
	            int actual = test.getSubManagerId();

	            assertEquals(expected, actual);
	        }

	        @Test
	        public void testSetSubManagerId3() {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            int expected = -2147483648;

	            test.setSubManagerId(expected);
	            int actual = test.getSubManagerId();

	            assertEquals(expected, actual);
	        }

	        @Test
	        public void testSetSubManagerId4() throws Exception {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            try {
	                int postalMin = Integer.parseInt("-2147483649");
	                test.setSubManagerId(postalMin);

	            } catch (RuntimeException e) {
	                assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
	            }
	        }

	        @Test
	        public void testSetSubManagerId5() throws Exception {
	            ProjectsSearchDTO test = new ProjectsSearchDTO();
	            try {
	                int postalMax = Integer.parseInt("2147483648");
	                test.setSubManagerId(postalMax);

	            } catch (RuntimeException e) {
	                assertThat4(e.getMessage(), "For input string: \"2147483648\"");
	            }
	        }



	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getStartDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStartDate1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setStartDate()}
	 */

	@Test
	public void testSetStartDate1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getEndDate()}
	 */
	@Test
	public void testGetEndDate1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setEndDate()}
	 */

	@Test
	public void testSetEndDate1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getNote()}
	  */
	@Test
	public void testGetNote1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setNote()}
	 */

	@Test
	public void testSetNote1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}



}
