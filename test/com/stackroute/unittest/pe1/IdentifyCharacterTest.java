package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyCharacterTest {
    @Test
    public void identifyele() {
        IdentifyCharacter e = new IdentifyCharacter();
        assertEquals("Small letter",e.identifyele('a'));

    }

    @Test
    public void identifyele1() {
        IdentifyCharacter e = new IdentifyCharacter();
        assertEquals("Capital letter",e.identifyele('A'));

    }

    @Test
    public void identifyele2() {
        IdentifyCharacter e = new IdentifyCharacter();
        assertEquals("Number",e.identifyele('1'));

    }

    @Test
    public void identifyele3() {
        IdentifyCharacter e = new IdentifyCharacter();
        assertEquals("Special character",e.identifyele('@'));

    }

}