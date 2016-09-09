package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.decision.dto.DecisionDTO;

public class DecisionDTOTest {


    /**
     * {@link com.Stringernousdev.Stringernousdev.dto.DecisionDTO#getRegistration()} のためのテスト・メソッド。
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
}