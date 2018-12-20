package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseString(){
        ReverseString r = new ReverseString();
        assertEquals("mam",r.reverseString("mam"));
    }
    @Test
    public void reverseString1(){
        ReverseString r = new ReverseString();
        assertEquals("ahsunA",r.reverseString("Anusha"));
    }

}