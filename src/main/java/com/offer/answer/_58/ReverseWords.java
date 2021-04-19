package com.offer.answer._58;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {

        String a = "a good  example";

        final String s = new ReverseWords().reverseWords(a);
        System.out.println(s);
    }

    public String reverseWords(String s) {

        final String[] strArray = s.split(" ");

        final StringBuffer buffer = new StringBuffer();


        for (int i = strArray.length - 1; i >= 0; i--) {

            final String s1 = strArray[i];

            if (s1.isEmpty()) {

            } else {
                buffer.append(strArray[i] +" ");
            }
        }

        return buffer.toString().trim();
    }
}
