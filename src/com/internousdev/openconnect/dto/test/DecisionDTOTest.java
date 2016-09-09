package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.decision.dto.DecisionDTO;

public class DecisionDTOTest {


    /**
     * Registration のテスト・メソッド。
     */
    @Test
    public void testGetRegistration1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetRegistration2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetRegistration3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetLoginRegistration4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetLoginRegistration5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetRegistration6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetRegistration7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

    @Test
    public void testGetRegistration8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setRegistration(expected);

        assertEquals(expected, test.getRegistration());
    }

	/**
	 * UserIdのテスト・メソッド。
	 */
	@Test
    public void testGetId1() {
        DecisionDTO test = new DecisionDTO();
        int expected = 0;

        test.setUserId(expected);

        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetId2() {
        DecisionDTO test = new DecisionDTO();
        int expected = 2147483647;

        test.setUserId(expected);

        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetId3() {
        DecisionDTO test = new DecisionDTO();
        int expected = -2147483648;

        test.setUserId(expected);

        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetId4() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            test.setUserId(postalMin);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    @Test
    public void testGetId5() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMax = Integer.parseInt("2147483648");
            test.setUserId(postalMax);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"2147483648\"");
        }
    }

    private void assertThat3(String message, String string) {
    }

    /**
     * DecisionIdのためのテスト・メソッド。
     *
     */
    @Test
    public void testSetId1() {
        DecisionDTO test = new DecisionDTO();
        int expected = 0;

        test.setDecisionId(expected);
        int actual = test.getDecisionId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetId2() {
        DecisionDTO test = new DecisionDTO();
        int expected = 2147483647;

        test.setDecisionId(expected);
        int actual = test.getDecisionId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetId3() {
        DecisionDTO test = new DecisionDTO();
        int expected = -2147483648;

        test.setDecisionId(expected);
        int actual = test.getDecisionId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetId4() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            test.setDecisionId(postalMin);

        } catch (RuntimeException e) {
            assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    @Test
    public void testSetId5() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMax = Integer.parseInt("2147483648");
            test.setDecisionId(postalMax);

        } catch (RuntimeException e) {
            assertThat4(e.getMessage(), "For input string: \"2147483648\"");
        }
    }

    private void assertThat4(String message, String string) {
    }


	/**
	 * ProjectId のテスト・メソッド。
	 */
	@Test
    public void testGetUserId1() {
        DecisionDTO test = new DecisionDTO();
        int expected = 0;

        test.setProjectId(expected);

        assertEquals(expected, test.getProjectId());
    }

    @Test
    public void testGetProjectId2() {
        DecisionDTO test = new DecisionDTO();
        int expected = 2147483647;

        test.setProjectId(expected);

        assertEquals(expected, test.getProjectId());
    }

    @Test
    public void testGetProjectId3() {
        DecisionDTO test = new DecisionDTO();
        int expected = -2147483648;

        test.setProjectId(expected);

        assertEquals(expected, test.getProjectId());
    }

    @Test
    public void testGetProjectId4() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            test.setProjectId(postalMin);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    @Test
    public void testGetProjectId5() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMax = Integer.parseInt("2147483648");
            test.setProjectId(postalMax);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"2147483648\"");
        }
    }


    }




