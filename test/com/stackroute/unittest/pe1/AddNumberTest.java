package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberTest {
    @Test
    public void sumOfNumber() {
        AddNumber a1=new AddNumber();
        assertEquals(39,a1.sumOfNumber("12 13 14"));
    }

    @Test
    public void sumOfNumber1() {
        AddNumber a1=new AddNumber();
        assertEquals(9,a1.sumOfNumber("2 3 4"));
    }

    @Test
    public void sumOfNumber2() {
        AddNumber a1=new AddNumber();
        assertEquals(30,a1.sumOfNumber("20 6 4"));
    }

}