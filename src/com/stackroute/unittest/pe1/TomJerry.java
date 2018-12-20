package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class TomJerry {
    public static void main (String[] args) {
        // write your code here
        Scanner sn=new Scanner(System.in);
        int num=sn.nextInt();
        TomJerry t = new TomJerry();
        t.checkEvenOrOdd(num);

    }
    public String checkEvenOrOdd(int num){
        if(num%2==0 && num>20 && num<30)
            return "Jerry";
        if(num%2==1 && num>20 && num<30)
            return "Tom";
        return "neither";
    }
}
