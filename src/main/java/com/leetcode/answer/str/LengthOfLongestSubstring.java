package com.leetcode.answer.str;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
//        bbbbb
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));

    }

    public int lengthOfLongestSubstring(String s) {

        int length = s.length();

        Set<Character> set = new HashSet<Character>();

        int start = 0, end = 0;

        int res = 0;

        while (start < length && end < length) {

            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                res = Integer.max(res, end - start);
            }

        }

        return res;

    }
}
