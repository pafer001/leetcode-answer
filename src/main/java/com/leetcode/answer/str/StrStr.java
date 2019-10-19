package com.leetcode.answer.str;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StrStr {


    public static void main(String[] args) {

        System.out.println(new StrStr().strStr("aaaaa", "bba"));
//        haystack = "hello", needle = "ll"
        System.out.println(new StrStr().strStr("hello", "ll"));

        System.out.println(new StrStr().strStr("aaa", "aaaa"));

    }

    public int strStr(String haystack, String needle) {

        if (haystack == null || needle == null || "".equals(needle)) {

            return 0;
        }

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        int i = 0;

        int j = 0, m = i;

        while (j < needleArray.length && m < haystackArray.length) {
            if (haystackArray[m] != needleArray[j]) {
                i++;
                j = 0;
                m = i;
                continue;
            }

            if (j == needleArray.length - 1) {
                return i;
            }

            m++;
            j++;

        }

        return -1;

    }
}
