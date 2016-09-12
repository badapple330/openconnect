package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.projects.dto.ProjectsListDTO;

public class ProjectsDTOTest {



		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getProjectId()}
		 */
		@Test
		public void testGetProjectId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "0";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}

		@Test
		public void testGetProjectId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "-2147483648";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}

		@Test
		public void testGetProjectId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "2147483647";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}




		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setProjectId()}
		 */
		@Test
		public void testSetProjectId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "0";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}

		@Test
		public void testSetProjectId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "-2147483648";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}

		@Test
		public void testSetProjectId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "2147483647";

			test.setProjectId(expected);

			assertEquals(expected, test.getProjectId());
		}




		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getProjectName()}
		 */
		@Test
		public void testGetProjectName1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetProjectName8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setSiteName()}
		 */
		@Test
		public void testSetProjectName1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void tesSetProjectName7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetProjectName8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setProjectName(expected);
			String actual = test.getProjectName();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getManagerId()}
		 */
		@Test
		public void GetManagerId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void GetManagerId8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setManagerId()}
		 */
		@Test
		public void  testSetManagerId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void  testSetManagerId8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setManagerId(expected);
			String actual = test.getManagerId();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getSubManagerId()}
		 */
		@Test
		public void testGetSubManagerId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetSubManagerId8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setSubManagerId()}
		 */
		@Test
		public void testSetSubManagerId1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetSubManagerId7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetubManagerId8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setSubManagerId(expected);
			String actual = test.getSubManagerId();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getStartDate()}
		 */
		@Test
		public void testGetStartDate1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGeStartDate3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetStartDate8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setStartDate()}
		 */
		@Test
		public void testSetStartDate1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetStartDate8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setStartDate(expected);
			String actual = test.getStartDate();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getEndDate()}
		 */
		@Test
		public void testGetEndDate1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetEndDate8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setEndDate()}
		 */
		@Test
		public void testSetEndDate1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetEndDate8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEndDate(expected);
			String actual = test.getEndDate();

			assertEquals(expected, actual);
		}


		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#getEndDate()}
		 */
		@Test
		public void testGetNote1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setEndDate(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testGetNote8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.Stringernousdev.openconnect.dto.ProjectsListDTO#setNote()}
		 */
		@Test
		public void testSetNote1() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = null;

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote2() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote3() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = " ";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote4() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "　";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote5() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote6() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "あいう１２３";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote7() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "abc123あいう１２３";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}

		@Test
		public void testSetNote8() {
			ProjectsListDTO test = new ProjectsListDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setNote(expected);
			String actual = test.getNote();

			assertEquals(expected, actual);
		}


	}


