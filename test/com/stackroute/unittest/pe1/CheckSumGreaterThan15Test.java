package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSumGreaterThan15Test {
 @Test
    public void checkSumGreaterThan15Test () {
     CheckSumGreaterThan15 c = new CheckSumGreaterThan15();
     assertEquals("321",c.sortNumber(123));
 }
    @Test
    public void checkSumGreaterThan15Test1 () {
        CheckSumGreaterThan15 c = new CheckSumGreaterThan15();
        assertEquals("false",c.isEvenSumGreaterThan15(234534));
    }
    @Test
    public void checkSumGreaterThan15Test2 () {
        CheckSumGreaterThan15 c = new CheckSumGreaterThan15();
        assertEquals("true",c.isEvenSumGreaterThan15(234834));
    }
}