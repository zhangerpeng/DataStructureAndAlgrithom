package com.hash.times;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://www.nowcoder.com/practice/389fc1c3d3be4479a154f63f495abff8?tpId=295&tqId=1375231&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 描述
 * 一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 * 数据范围：数组长度 2\le n \le 10002≤n≤1000，数组中每个数的大小 0 < val \le 10000000<val≤1000000
 * 要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
 *
 * 提示：输出时按非降序排列。
 * 示例1
 * 输入：
 * [1,4,1,6]
 * 复制
 * 返回值：
 * [4,6]
 * 复制
 * 说明：
 * 返回的结果中较小的数排在前面
 * 示例2
 * 输入：
 * [1,2,3,3,2,9]
 * 复制
 * 返回值：
 * [1,9]
 */
public class ObtainTwoNumbers {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.remove(array[i]);
            }else {
                map.put(array[i],0);
            }
        }

      return map.keySet().stream().mapToInt(Integer::intValue).toArray();

    }
}
