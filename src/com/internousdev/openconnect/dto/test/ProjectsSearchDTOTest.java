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
		String expected = null;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setProjectId()}
	 */

	@Test
	public void testSetProjectId1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setProjectId(expected);
		String actual = test.getProjectId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetManagerId1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
	 */

	@Test
	public void testSetManagerId1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setManagerId(expected);
		String actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubManagerId1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
	 */

	@Test
	public void testSetSubManagerId1() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = null;

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId2() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId3() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = " ";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId4() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "　";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId5() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId6() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "あいう１２３";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId7() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう１２３";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId8() {
		ProjectsSearchDTO test = new ProjectsSearchDTO();
		String expected = "abc123あいう漢字";

		test.setSubManagerId(expected);
		String actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#getHandleName()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.ProjectsSearchDTO#setHandleName()}
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
