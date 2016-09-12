package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.decision.dto.DecisionDTO;

public class DecisionDTOTest {


    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getRegistration()} のためのテスト・メソッド。
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
	 * {@link com.internousdev.internousdev.dto.DecisionDTO#getUserId()} のためのテスト・メソッド。
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
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getDecisionId()} のためのテスト・メソッド。
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
	 *
	 * {@link com.internousdev.internousdev.dto.DecisionDTO#getProjectId()} のためのテスト・メソッド。
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

    /**
	 *
	 *      * {@link com.internousdev.internousdev.dto.DecisionDTO#getDecisionId()} のためのテスト・メソッド。
	 */
	@Test
    public void testGetDecisionId1() {
        DecisionDTO test = new DecisionDTO();
        int expected = 0;

        test.setDecisionId(expected);

        assertEquals(expected, test.getDecisionId());
    }

    @Test
    public void testGetDecisionId2() {
        DecisionDTO test = new DecisionDTO();
        int expected = 2147483647;

        test.setDecisionId(expected);

        assertEquals(expected, test.getDecisionId());
    }

    @Test
    public void testGetDecisionId3() {
        DecisionDTO test = new DecisionDTO();
        int expected = -2147483648;

        test.setDecisionId(expected);

        assertEquals(expected, test.getDecisionId());
    }

    @Test
    public void testGetDecisionId4() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMin = Integer.parseInt("-2147483649");
            test.setDecisionId(postalMin);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
        }
    }

    @Test
    public void testGetDecisionId5() throws Exception {
        DecisionDTO test = new DecisionDTO();
        try {
            int postalMax = Integer.parseInt("2147483648");
            test.setDecisionId(postalMax);

        } catch (RuntimeException e) {
            assertThat3(e.getMessage(), "For input string: \"2147483648\"");
        }
    }



    /**
     * DecisionNameのテスト・メソッド。
     */
    @Test
    public void testGetDecisionName1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }

    @Test
    public void testGetDecisionName8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setDecisionName(expected);

        assertEquals(expected, test.getDecisionName());
    }



    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getDetail()} のためのテスト・メソッド。
     */
    @Test
    public void testGetDetail1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }

    @Test
    public void testGetDetail8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setDetail(expected);

        assertEquals(expected, test.getDetail());
    }






    public void testSetDetail1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDetail8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setDetail(expected);
        String actual = test.getDetail();

        assertEquals(expected, actual);
    }

    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getIDraftingId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetIDraftingId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }

    @Test
    public void testGetIDraftingId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIDraftingId(expected);

        assertEquals(expected, test.getIDraftingId());
    }






    public void testSetIDraftingId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIDraftingId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIDraftingId(expected);
        String actual = test.getIDraftingId();

        assertEquals(expected, actual);
    }
    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getIApprovalId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetIApprovalId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }

    @Test
    public void testGetIApprovalId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIApprovalId(expected);

        assertEquals(expected, test.getIApprovalId());
    }






    public void testSetIApprovalId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIApprovalId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIApprovalId(expected);
        String actual = test.getIApprovalId();

        assertEquals(expected, actual);
    }

    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getADraftingId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetADraftingId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }

    @Test
    public void testGetADraftingId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setADraftingId(expected);

        assertEquals(expected, test.getADraftingId());
    }






    public void testSetADraftingId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetADraftingId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setADraftingId(expected);
        String actual = test.getADraftingId();

        assertEquals(expected, actual);
    }
    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getCdId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetCdId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }






    public void testSetCdId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId31() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId41() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId51() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId61() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId71() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId81() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }
    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getCdId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetCdId11() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId21() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId31() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId41() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId51() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId61() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId71() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }

    @Test
    public void testGetCdId81() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setCdId(expected);

        assertEquals(expected, test.getCdId());
    }






    public void testSetCdId11() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId21() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCdId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setCdId(expected);
        String actual = test.getCdId();

        assertEquals(expected, actual);
    }

    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getIADId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetIADId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }

    @Test
    public void testGetIADId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIADId(expected);

        assertEquals(expected, test.getIADId());
    }






    public void testSetIADId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIADId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIADId(expected);
        String actual = test.getIADId();

        assertEquals(expected, actual);
    }
    /**
     * {@link com.internousdev.internousdev.dto.DecisionDTO#getIAId()} のためのテスト・メソッド。
     */
    @Test
    public void testGetIAId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }

    @Test
    public void testGetIAId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIAId(expected);

        assertEquals(expected, test.getIAId());
    }






    public void testSetIAId1() {
        DecisionDTO test = new DecisionDTO();
        String expected = null;

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId2() {
        DecisionDTO test = new DecisionDTO();
        String expected = "";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId3() {
        DecisionDTO test = new DecisionDTO();
        String expected = " ";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId4() {
        DecisionDTO test = new DecisionDTO();
        String expected = "　";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId5() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId6() {
        DecisionDTO test = new DecisionDTO();
        String expected = "あいう１２３";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId7() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう１２３";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIAId8() {
        DecisionDTO test = new DecisionDTO();
        String expected = "abc123あいう漢字";

        test.setIAId(expected);
        String actual = test.getIAId();

        assertEquals(expected, actual);
    }


    }




