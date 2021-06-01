package com.leetcode.answer.str;

public class Trans {

    public String trans(String s, int n) {

        String[] array =  s.split(" ", -1);

        int low = 0, high = array.length -1;

        while(low < high) {

            String tmp = array[low];

            array[low] =  convert(array[high]);

            array[high] = convert(tmp);
            low ++;
            high --;
        }
        if (low == high) {
            array[low] =  convert(array[low]);
        }

        return  String.join(" ", array);
    }

    private String convert(String s) {

        char[] array =  s.toCharArray();

        for(int i=0; i < array.length; i++) {

            char ch = array[i];
            if(ch >= 'a' && ch <= 'z') {
                array[i] = (char)((int)array[i] - 32);
            }

            if(ch >= 'A' && ch <= 'Z') {
                array[i] = (char)((int)array[i] + 32);
            }
        }

        return new String(array);
    }

    public static void main(String[] args) {

        final String aA = new Trans().trans("h i ", 4);
        System.out.println(aA);
    }
}
