package com.internousdev.openconnect.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.openconnect.attendance.dto.AttendanceDTO;

public class AttendanceDTOTest {
	/**
     * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getDate()} のためのテスト・メソッド。
     */
    @Test
    public void testGetDate1() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = null;

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate2() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate3() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = " ";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate4() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "　";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate5() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate6() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "あいう１２３";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate7() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123あいう１２３";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate8() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123あいう漢字";

        test.setDate(expected);

        assertEquals(expected, test.getDate());
    }






    public void testSetDate1() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = null;

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate2() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate3() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = " ";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate4() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "　";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate5() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate6() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "あいう１２３";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate7() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123あいう１２３";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate8() {
        AttendanceDTO test = new AttendanceDTO();
        String expected = "abc123あいう漢字";

        test.setDate(expected);
        String actual = test.getDate();

        assertEquals(expected, actual);
    }

    /**
     * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getUserId()} のためのテスト・メソッド。
     */
    @Test
        public void testGetUserId1() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = 0;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());
        }

        @Test
        public void testGetUserId2() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = 2147483647;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());
        }

        @Test
        public void testGetUserId3() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = -2147483648;

            test.setUserId(expected);

            assertEquals(expected, test.getUserId());
        }

        @Test
        public void testGetUserId4() throws Exception {
            AttendanceDTO test = new AttendanceDTO();
            try {
                int postalMin = Integer.parseInt("-2147483649");
                test.setUserId(postalMin);

            } catch (RuntimeException e) {
                assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
            }
        }

        @Test
        public void testGetUserId5() throws Exception {
            AttendanceDTO test = new AttendanceDTO();
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
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getUserId()}
         * のためのテスト・メソッド。
         */
        @Test
        public void testSetUserId1() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = 0;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetUserId2() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = 2147483647;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetUserId3() {
            AttendanceDTO test = new AttendanceDTO();
            int expected = -2147483648;

            test.setUserId(expected);
            int actual = test.getUserId();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetUserId4() throws Exception {
            AttendanceDTO test = new AttendanceDTO();
            try {
                int postalMin = Integer.parseInt("-2147483649");
                test.setUserId(postalMin);

            } catch (RuntimeException e) {
                assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
            }
        }

        @Test
        public void testSetUserId5() throws Exception {
            AttendanceDTO test = new AttendanceDTO();
            try {
                int postalMax = Integer.parseInt("2147483648");
                test.setUserId(postalMax);

            } catch (RuntimeException e) {
                assertThat4(e.getMessage(), "For input string: \"2147483648\"");
            }
        }
        private void assertThat4(String message, String string) {
        }

        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getYear()} のためのテスト・メソッド。
         */
        @Test
        public void testGetYear1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

        @Test
        public void testGetYear8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setYear(expected);

            assertEquals(expected, test.getYear());
        }

    /**
     *  {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getYear()} のためのテスト・メソッド。
     */

    @Test
        public void testSetYear1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetYear8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setYear(expected);
            String actual = test.getYear();

            assertEquals(expected, actual);
        }
        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getMonth()} のためのテスト・メソッド。
         */
        @Test
        public void testGetMonth1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

        @Test
        public void testGetMonth8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setMonth(expected);

            assertEquals(expected, test.getMonth());
        }

    /**
     *  {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getMonth()} のためのテスト・メソッド。
     */

    @Test
        public void testSetMonth1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetMonth8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setMonth(expected);
            String actual = test.getMonth();

            assertEquals(expected, actual);
        }

        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getFamilyNameKanji()} のためのテスト・メソッド。
         */
        @Test
        public void testGetFamilyNameKanji1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

        @Test
        public void testGetFamilyNameKanji8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setFamilyNameKanji(expected);

            assertEquals(expected, test.getFamilyNameKanji());
        }

    /**
     *  {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getFamilyNameKanji()} のためのテスト・メソッド。
     */

    @Test
        public void testSetFamilyNameKanji1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetFamilyNameKanji8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setFamilyNameKanji(expected);
            String actual = test.getFamilyNameKanji();

            assertEquals(expected, actual);
        }

        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getGivenNameKanji()} のためのテスト・メソッド。
         */
        @Test
        public void testGetGivenNameKanji1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

        @Test
        public void testGetGivenNameKanji8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setGivenNameKanji(expected);

            assertEquals(expected, test.getGivenNameKanji());
        }

    /**
     * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getGivenNameKanji()} のためのテスト・メソッド。
     */

    @Test
        public void testSetGivenNameKanji1() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = null;

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji2() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji3() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = " ";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji4() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "　";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji5() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji6() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "あいう１２３";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji7() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう１２３";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }

        @Test
        public void testSetGivenNameKanji8() {
            AttendanceDTO test = new AttendanceDTO();
            String expected = "abc123あいう漢字";

            test.setGivenNameKanji(expected);
            String actual = test.getGivenNameKanji();

            assertEquals(expected, actual);
        }


        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getAttendance()} のためのテスト・メソッド。
         */
        @Test
            public void testGetAttendance1() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = 0;

                test.setAttendance (expected);

                assertEquals(expected, test.getAttendance ());
            }

            @Test
            public void testGetAttendance2() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = 2147483647;

                test.setAttendance (expected);

                assertEquals(expected, test.getAttendance ());
            }

            @Test
            public void testGetAttendance3() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = -2147483648;

                test.setAttendance (expected);

                assertEquals(expected, test.getAttendance ());
            }

            @Test
            public void testGetAttendance4() throws Exception {
                AttendanceDTO test = new AttendanceDTO();
                try {
                    int postalMin = Integer.parseInt("-2147483649");
                    test.setAttendance (postalMin);

                } catch (RuntimeException e) {
                    assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
                }
            }

            @Test
            public void testGetAttendance5() throws Exception {
                AttendanceDTO test = new AttendanceDTO();
                try {
                    int postalMax = Integer.parseInt("2147483648");
                    test.setAttendance (postalMax);

                } catch (RuntimeException e) {
                    assertThat3(e.getMessage(), "For input string: \"2147483648\"");
                }
            }




            /**
             * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getAttendance()}のためのテスト・メソッド。
             *
             */
            @Test
            public void testSetAttendance1() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = 0;

                test.setAttendance (expected);
                int actual = test.getAttendance ();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendance2() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = 2147483647;

                test.setAttendance (expected);
                int actual = test.getAttendance ();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendance3() {
                AttendanceDTO test = new AttendanceDTO();
                int expected = -2147483648;

                test.setAttendance (expected);
                int actual = test.getAttendance ();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendance4() throws Exception {
                AttendanceDTO test = new AttendanceDTO();
                try {
                    int postalMin = Integer.parseInt("-2147483649");
                    test.setAttendance (postalMin);

                } catch (RuntimeException e) {
                    assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
                }
            }

            @Test
            public void testSetAttendance5() throws Exception {
                AttendanceDTO test = new AttendanceDTO();
                try {
                    int postalMax = Integer.parseInt("2147483648");
                    test.setAttendance (postalMax);

                } catch (RuntimeException e) {
                    assertThat4(e.getMessage(), "For input string: \"2147483648\"");
                }
            }

            /**
             * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getAttendanceString()} のためのテスト・メソッド。
             */
            @Test
            public void testGetAttendanceString1() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = null;

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString2() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString3() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = " ";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString4() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "　";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString5() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString6() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "あいう１２３";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString7() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123あいう１２３";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

            @Test
            public void testGetAttendanceString8() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123あいう漢字";

                test.setAttendanceString(expected);

                assertEquals(expected, test.getAttendanceString());
            }

        /**
         * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getAttendanceString()} のためのテスト・メソッド。
         */

        @Test
            public void testSetAttendanceString1() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = null;

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString2() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString3() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = " ";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString4() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "　";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString5() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString6() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "あいう１２３";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString7() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123あいう１２３";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            @Test
            public void testSetAttendanceString8() {
                AttendanceDTO test = new AttendanceDTO();
                String expected = "abc123あいう漢字";

                test.setAttendanceString(expected);
                String actual = test.getAttendanceString();

                assertEquals(expected, actual);
            }

            /**
             * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getInterview()} のためのテスト・メソッド。
             */
            @Test
                public void testGetInterview1() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = 0;

                    test.setInterview(expected);

                    assertEquals(expected, test.getInterview());
                }

                @Test
                public void testGetInterview2() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = 2147483647;

                    test.setInterview(expected);

                    assertEquals(expected, test.getInterview());
                }

                @Test
                public void testGetInterview3() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = -2147483648;

                    test.setInterview(expected);

                    assertEquals(expected, test.getInterview());
                }

                @Test
                public void testGetInterview4() throws Exception {
                    AttendanceDTO test = new AttendanceDTO();
                    try {
                        int postalMin = Integer.parseInt("-2147483649");
                        test.setInterview(postalMin);

                    } catch (RuntimeException e) {
                        assertThat3(e.getMessage(), "For input string: \"-2147483649\"");
                    }
                }

                @Test
                public void testGetInterview5() throws Exception {
                    AttendanceDTO test = new AttendanceDTO();
                    try {
                        int postalMax = Integer.parseInt("2147483648");
                        test.setInterview(postalMax);

                    } catch (RuntimeException e) {
                        assertThat3(e.getMessage(), "For input string: \"2147483648\"");
                    }
                }

                /**
                 * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getInterview()} のためのテスト・メソッド。
                 *
                 */
                @Test
                public void testSetInterview1() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = 0;

                    test.setInterview(expected);
                    int actual = test.getInterview();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterview2() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = 2147483647;

                    test.setInterview(expected);
                    int actual = test.getInterview();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterview3() {
                    AttendanceDTO test = new AttendanceDTO();
                    int expected = -2147483648;

                    test.setInterview(expected);
                    int actual = test.getInterview();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterview4() throws Exception {
                    AttendanceDTO test = new AttendanceDTO();
                    try {
                        int postalMin = Integer.parseInt("-2147483649");
                        test.setInterview(postalMin);

                    } catch (RuntimeException e) {
                        assertThat4(e.getMessage(), "For input string: \"-2147483649\"");
                    }
                }

                @Test
                public void testSetInterview5() throws Exception {
                    AttendanceDTO test = new AttendanceDTO();
                    try {
                        int postalMax = Integer.parseInt("2147483648");
                        test.setInterview(postalMax);

                    } catch (RuntimeException e) {
                        assertThat4(e.getMessage(), "For input string: \"2147483648\"");
                    }
                }


                /**
                 * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getInterviewString()} のためのテスト・メソッド。
                 */
                @Test
                public void testGetInterviewString1() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = null;

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString2() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString3() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = " ";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString4() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "　";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString5() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString6() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "あいう１２３";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString7() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123あいう１２３";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

                @Test
                public void testGetInterviewString8() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123あいう漢字";

                    test.setInterviewString(expected);

                    assertEquals(expected, test.getInterviewString());
                }

            /**
             * {@link com.internousdev.ProjectStatusDTO.dto.AttendanceDTO#getInterviewString()} のためのテスト・メソッド。
             */

            @Test
                public void testSetInterviewString1() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = null;

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString2() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString3() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = " ";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString4() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "　";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString5() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString6() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "あいう１２３";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString7() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123あいう１２３";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }

                @Test
                public void testSetInterviewString8() {
                    AttendanceDTO test = new AttendanceDTO();
                    String expected = "abc123あいう漢字";

                    test.setInterviewString(expected);
                    String actual = test.getInterviewString();

                    assertEquals(expected, actual);
                }



                }









