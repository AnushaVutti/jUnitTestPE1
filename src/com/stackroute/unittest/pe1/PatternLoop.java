package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.Scanner;

public class PatternLoop {

     public String patternLoop(int num) {
        int k=0;
        String str="";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                str = str + Integer.toString(i);
            }
        }
        return str;
    }
}
