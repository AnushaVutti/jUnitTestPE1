package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternLoopTest {
    @Test
            public void patterloop() throws Exception {
        PatternLoop p = new PatternLoop();
        assertEquals("122", p.patternLoop(2));
    }

}