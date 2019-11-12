package com.leetcode.answer.str;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * <p>
 * 示例:
 * <p>
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/restore-ip-addresses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RestoreIpAddresses {


    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {

        recursion(0, s.length(), 0, "", s);
        return res;
    }

    public void recursion(int start, int n, int count, String str, String s) {

        if (count == 4) {
            if (start >= n) {
                res.add(str);
            }

            return;
        }

        if (start >= n) {
            return;
        }

        for (int i = start + 1; i < start + 4 && i <= n; i++) {
            String ss = s.substring(start, i);
            int val = Integer.parseInt(ss);
            if (val <= 255 && !(ss.startsWith("0") && ss.length() != 1)) {
                if (count != 3) {
                    ss += ".";
                }
                recursion(i, n, count + 1, str + ss, s);
            }

        }
    }


}
