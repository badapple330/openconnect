package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.projectProgress.dto.ProjectProgressDTO;

public class ProjectProgressDTOTest {
	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getProjectId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setProjectId(expected);

		assertEquals(expected, test.getProjectId());
	}

	@Test
	public void testGetProjectId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProjectId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProjectId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
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
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setProjectId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetProjectId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setProjectId(expected);
		int actual = test.getProjectId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProjectId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProjectId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
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
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getManagerId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetManagerId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setManagerId(expected);

		assertEquals(expected, test.getManagerId());
	}

	@Test
	public void testGetManagerId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setManagerId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetManagerId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setManagerId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setManagerId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetManagerId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setManagerId(expected);
		int actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setManagerId(expected);
		int actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setManagerId(expected);
		int actual = test.getManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetManagerId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setManagerId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetManagerid5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setManagerId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getSubManagerId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubManagerId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setSubManagerId(expected);

		assertEquals(expected, test.getSubManagerId());
	}

	@Test
	public void testGetSubManagerId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setSubManagerId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetSubManagerId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setSubManagerId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setSubManagerId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubManagerId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setSubManagerId(expected);
		int actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setSubManagerId(expected);
		int actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setSubManagerId(expected);
		int actual = test.getSubManagerId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubManagerId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setSubManagerId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetSubManagerId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setSubManagerId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getProgressId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProgressId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setProgressId(expected);

		assertEquals(expected, test.getProgressId());
	}

	@Test
	public void testGetProgressId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setProgressId(expected);

		assertEquals(expected, test.getProgressId());
	}

	@Test
	public void testGetProgressId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setProgressId(expected);

		assertEquals(expected, test.getProgressId());
	}


	@Test
	public void testGetProgressId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProgressId(postalMin);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProgressId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setProgressId(postalMax);

		} catch (RuntimeException e) {
			assertThat3(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setProgressId()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetProgressId1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 0;

		test.setProgressId(expected);
		int actual = test.getProgressId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProgressId2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = 2147483647;

		test.setProgressId(expected);
		int actual = test.getProgressId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProgressId3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		int expected = -2147483648;

		test.setProgressId(expected);
		int actual = test.getProgressId();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProgressId4() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProgressId(postalMin);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetProgressId5() throws Exception {
		ProjectProgressDTO test = new ProjectProgressDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setProgressId(postalMax);

		} catch (RuntimeException e) {
			assertThat4(e.getMessage(), "For input string: \"2147483648\"");
		}
	}




	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectDay1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	@Test
	public void testGetProjectDay8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectDay(expected);

		assertEquals(expected, test.getProjectDay());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetProjectDay1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectDay8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectDay(expected);
		String actual = test.getProjectDay();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectName1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	@Test
	public void testGetProjectName8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);

		assertEquals(expected, test.getProjectName());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetProjectName1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectName8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectName(expected);
		String actual = test.getProjectName();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectPlan1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	@Test
	public void testGetProjectPlan8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectPlan(expected);

		assertEquals(expected, test.getProjectPlan());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetProjectPlan1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectPlan8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectPlan(expected);
		String actual = test.getProjectPlan();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetProjectResult1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	@Test
	public void testGetProjectResult8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectResult(expected);

		assertEquals(expected, test.getProjectResult());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetProjectResult1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetProjectResult8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setProjectResult(expected);
		String actual = test.getProjectResult();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOther1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	@Test
	public void testGetOther8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setOther(expected);

		assertEquals(expected, test.getOther());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetOther1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetOther8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setOther(expected);
		String actual = test.getOther();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStartDate1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	@Test
	public void testGetStartDate8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setStartDate(expected);

		assertEquals(expected, test.getStartDate());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetStartDate1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetStartDate8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setStartDate(expected);
		String actual = test.getStartDate();

		assertEquals(expected, actual);
	}



	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetEndDate1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	@Test
	public void testGetEndDate8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setEndDate(expected);

		assertEquals(expected, test.getEndDate());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetEndDate1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetEndDate8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setEndDate(expected);
		String actual = test.getEndDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#getHandleName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNote1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	@Test
	public void testGetNote8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setNote(expected);

		assertEquals(expected, test.getNote());
	}

	/**
	 * {@link com.internousdev.openconnect.projetProgress.dto.ProjectProgressDTO#setHandleName()}
	 */

	@Test
	public void testSetNote1() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = null;

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote2() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote3() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = " ";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote4() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "　";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote5() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote6() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "あいう１２３";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote7() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう１２３";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}

	@Test
	public void testSetNote8() {
		ProjectProgressDTO test = new ProjectProgressDTO();
		String expected = "abc123あいう漢字";

		test.setNote(expected);
		String actual = test.getNote();

		assertEquals(expected, actual);
	}
}
