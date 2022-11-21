package com.string.prefix;

/**
 * https://www.nowcoder.com/practice/28eb3175488f4434a4a6207f6f484f47?tpId=295&tqId=732&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 描述
 * 给你一个大小为 n 的字符串数组 strs ，其中包含n个字符串 , 编写一个函数来查找字符串数组中的最长公共前缀，返回这个公共前缀。
 *
 * 数据范围： 0 \le n \le 50000≤n≤5000， 0 \le len(strs_i) \le 50000≤len(strs
 * i
 * ​
 *  )≤5000
 * 进阶：空间复杂度 O(1)O(1)，时间复杂度 O(n*len)O(n∗len)
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix_method(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        int rows = strs.length;
        int cols = strs[0].length();

        for (int i = 0; i < cols; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < rows; j++) {
                if (ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }

        }

        return strs[0];
    }
}
