package com.offer.answer._17;


public class PrintNumbers {

    public static void main(String[] args) {

        final String s = new PrintNumbers().printNumbers(2);
        System.out.println(s);
    }

    int n;
    char[]  num, chArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    StringBuffer res = new StringBuffer();

    public String printNumbers(int n) {

        this.n = n;

        num = new char[n];

        dfs(0);
        res.deleteCharAt(res.length() - 1);
        return res.toString();

    }

    public void dfs(int i) {

        if (i == n) {
            final String numberStr = getNumberStr(num);
            if (numberStr.length() !=0 ) {
                res.append(numberStr + ",");
            }
            return;
        }

        for (char ch : chArray) {
            num[i] = ch;
            dfs(i + 1);
        }


    }

    private String getNumberStr(char[] array) {

        if (array[0] != '0') {
            return String.valueOf(array);
        }

        int i = 0;
        while (i++ < array.length && array[i] !='\0') {

            if (array[i] != '0') {
                break;
            }

        }

        final StringBuffer stringBuffer = new StringBuffer();
        while (i < array.length && array[i] !='\0') {


            stringBuffer.append(array[i]);
            i++;
        }
        return stringBuffer.toString();
    }
}
