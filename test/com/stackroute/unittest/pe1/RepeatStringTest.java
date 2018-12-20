package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    @Test
    public void repeatString() {
        RepeatString r= new RepeatString();
        assertEquals("Stackrouterouterouterouterouteroute",r.repeatString("Stackroute",5));
    }


}