package com.string.sum;

/**
 * 描述
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 *
 * 数据范围：s.length,t.length \le 100000s.length,t.length≤100000，字符串仅由'0'~‘9’构成
 * 要求：时间复杂度 O(n)O(n)
 * https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tpId=295&tqId=1024725&ru=%2Fexam%2Foj&qru=%2Fta%2Fformat-top101%2Fquestion-ranking&sourceUrl=%2Fexam%2Foj
 */
public class NumPlus {
    public String solve(String s, String t) {
        // write code here
        if (s.length() == 0 && t.length() != 0) {
            return t;
        }

        if (s.length() != 0 && t.length() == 0) {
            return s;
        }

        if (s.length() == 0 && t.length() == 0) {
            return "";
        }

        int s1 = s.length() - 1;
        int t1 = t.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (s1 >= 0 || t1 >= 0 || carry > 0) {
            int n1 = s1<0? 0: (s.charAt(s1--)-'0');
            int n2 = t1<0?0:(t.charAt(t1--)-'0');

            int sum = n1+n2+carry;
            carry = sum/10;
            sum = sum%10;

            sb.insert(0,sum);
        }
        return sb.toString();
    }
}
