package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void checkPalindrome() throws Exception {
        Palindrome p = new Palindrome();
        assertEquals(true,p.checkPalindrome(1221));
        assertEquals(false,p.checkPalindrome(122));

    }
    @Test
    public void isGreaterThan25() throws Exception {
        Palindrome p1 = new Palindrome();
        assertEquals(true,p1.isGreaterThan25(2468642));
        assertEquals(false,p1.isGreaterThan25(24642));

    }


}