package com.string.reverse;

/**
 * 描述
 * 对于一个长度为 n 字符串，我们需要对它做一些变形。
 * <p>
 * 首先这个字符串中包含着一些空格，就像"Hello World"一样，然后我们要做的是把这个字符串中由空格隔开的单词反序，同时反转每个字符的大小写。
 * <p>
 * 比如"Hello World"变形后就变成了"wORLD hELLO"。
 * <p>
 * 数据范围: 1\le n \le 10^61≤n≤10
 * 6
 * , 字符串中包括大写英文字母、小写英文字母、空格。
 * 进阶：空间复杂度 O(n)O(n) ， 时间复杂度 O(n)O(n)
 * 输入描述：
 * 给定一个字符串s以及它的长度n(1 ≤ n ≤ 10^6)
 * 返回值描述：
 * 请返回变形后的字符串。题目保证给定的字符串均由大小写字母和空格构成。
 */
public class WordsReverse {
    public static void main(String[] args) {
        System.out.println(trans(" hello world   ", 11));
    }

    public static String trans(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        StringBuilder ans = new StringBuilder();
        int end = 0;
        int i = 0;
        while (i < reverse.length()) {
            i = end;
            if (i<reverse.length() && reverse.charAt(i) == ' ') {
                i = i + 1;
                end = end + 1;
                ans = ans.append(" ");
            }
            while (end<reverse.length() && reverse.charAt(end) !=' ') {
                end = end + 1;
            }
            for (int wordEnd = end - 1; wordEnd >= i; wordEnd--) {
                ans = ans.append(reverse.charAt(wordEnd));
            }
        }

        return ans.toString();

    }
}
