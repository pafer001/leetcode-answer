package com.offer.answer._50;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    public static void main(String[] args) {

        final char leetcode = new FirstUniqChar().firstUniqChar("leetcode");
        System.out.println(leetcode);
    }
    public char firstUniqChar(String s) {

        final char[] charArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : charArray) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : charArray) {

            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';

    }
}
