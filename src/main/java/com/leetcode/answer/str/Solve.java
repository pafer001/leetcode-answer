package com.leetcode.answer.str;

import java.util.ArrayList;
import java.util.*;

public class Solve {

    public static void main(String[] args) {

    }
    public String solve (String s, String t) {
        List<String> list = new ArrayList<String>();
        char[] sArray =  s.toCharArray();
        char[] tArray =  t.toCharArray();

        int sIndex = sArray.length -1;
        int tIndex = tArray.length -1;

        int tmpVal = 0;
        while (sIndex >= 0 || tIndex >= 0 ) {

            int sVal = sIndex >= 0 ? sArray[sIndex] : 0;
            int tVal = tIndex >= 0 ? tArray[tIndex] : 0;

            int sum = sVal + tVal + tmpVal;
            list.add(0, "" + (sum % 10));
            tmpVal = sum / 10;
            sIndex --;
            tIndex--;
        }

        if(tmpVal !=0) {
            list.add(0, "" + tmpVal);


        }


        return String.join("", list);

    }
}
