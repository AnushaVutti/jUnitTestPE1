package com.stackroute.unittest.pe1;

public class RepeatString {
    public String repeatString(String s,int n){
        String str=s;
        char[] ch = s.toCharArray();

        for (int i = 1; i <= n; i++) {
            for (int j = ch.length - n; j <= ch.length - 1; j++) {
                str=str+ch[j];
            }
        }
        return str;
    }
}
