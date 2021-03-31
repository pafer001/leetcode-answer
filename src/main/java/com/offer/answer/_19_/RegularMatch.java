package com.offer.answer._19_;

public class RegularMatch {

    public boolean isMatch(String s, String p) {

        final char[] sArray = s.toCharArray();
        final char[] pArray = p.toCharArray();

        int sIndex = 0;
        int pIndex = 0;

        while (sIndex < sArray.length && pIndex < pArray.length) {

            if (pArray[pIndex] == '.') {
                sIndex++;
                pIndex++;
            } else if (pArray[pIndex] == '*') {
                if (pArray[pIndex + 1] != sArray[sIndex + 1]
                        && pIndex + 1 < pArray.length && sIndex + 1 < sArray.length) {
                    sIndex++;
                } else if (pArray[pIndex + 1] == sArray[sIndex + 1]
                        && pIndex + 1 < pArray.length && sIndex + 1 < sArray.length) {
                    sIndex++;
                    pIndex++;
                }
            } else if (sArray[sIndex] == pArray[pIndex]) {
                sIndex++;
                pIndex++;
            }
        }

        return false;
    }
}
