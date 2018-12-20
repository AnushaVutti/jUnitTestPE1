package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    @Test
    public void checkEvenOrOdd(){
        TomJerry t = new TomJerry();
        assertEquals("Tom",t.checkEvenOrOdd(21));
        assertEquals("Jerry",t.checkEvenOrOdd(22));
        assertEquals("neither",t.checkEvenOrOdd(32));
    }


}