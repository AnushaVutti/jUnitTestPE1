package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.Collections;

public class CheckSumGreaterThan15 {
    public String sortNumber(int originalNumber) {
        int n = originalNumber;
        int rem = 0;
        int rev = 0;
        String str = "";
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int j = 0;
        int sum = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            arrayList.add(rem);
            n = n / 10;
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        for (int k = 0; k < arrayList.size(); k++)
            str = str + arrayList.get(k);
        return str;
    }
   public String isEvenSumGreaterThan15(int num){
        int n = num;
        int rem = 0;
        int rev = 0;
        String str = "";
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int j = 0;
        int sum = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            arrayList.add(rem);
            n = n / 10;
        }
        for (int k = 0; k < arrayList.size(); k++) {
            if (arrayList.get(k)%2==0)
                sum=sum+arrayList.get(k);
        }
        if (sum>15)
           return "true";
            return "false";
    }
    }

