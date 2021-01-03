package com.leetcode.answer.str;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StrToLowerCase {

    public static String toLowerCase(String str) {

        final StringBuffer stringBuffer = new StringBuffer();
        final char[] charArray = str.toCharArray();
        for (char c : charArray) {

            if (c >= 'A' && c <='Z') {

                stringBuffer.append((char)(c +32)) ;
                continue;
            }

            stringBuffer.append(c) ;

        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {

        String s = "Here";

        System.out.println(toLowerCase(s));
    }
}
