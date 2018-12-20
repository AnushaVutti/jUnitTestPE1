package com.stackroute.unittest.pe1;

public class ReverseString {
    public String reverseString(String s){ ;
        char[] ch=s.toCharArray();
        String str="";
        char[] chNew = new char[s.length()];
        for (int i=ch.length-1; i>=0; i--) {
            System.out.print(ch[i]);
            str=str+ch[i];
        }
        return str;
    }
}
