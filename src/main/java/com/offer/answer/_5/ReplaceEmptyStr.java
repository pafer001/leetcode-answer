package com.offer.answer._5;

public class ReplaceEmptyStr {

    public String replaceSpace(String s) {
        final char[] chArray = s.toCharArray();

        int emptyCount = 0;
        for (char ch : chArray) {
            if (ch == ' ') {
                emptyCount++;
            }
        }
        char[] resArray = new char[s.length() + emptyCount * 2];
        int index = 0;
        for (int i =0; i<s.length(); i++) {
            if (chArray[i] == ' ') {
                resArray[index++] = '%';
                resArray[index++] = '2';
                resArray[index++] = '0';
                continue;
            }
            resArray[index++] = chArray[i];

        }

        return new String(resArray);
    }

}
