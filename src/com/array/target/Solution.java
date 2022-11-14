package com.array.target;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 * 给出一个整型数组 numbers 和一个目标值 target，请在数组中找出两个加起来等于目标值的数的下标，返回的下标按升序排列。
 * （注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）
 * <p>
 * 数据范围：2\leq len(numbers) \leq 10^52≤len(numbers)≤10
 * 5
 * ，-10 \leq numbers_i \leq 10^9−10≤numbers
 * i
 * ​
 * ≤10
 * 9
 * ，0 \leq target \leq 10^90≤target≤10
 * 9
 * <p>
 * 要求：空间复杂度 O(n)O(n)，时间复杂度 O(nlogn)O(nlogn)
 * <p>
 * https://www.nowcoder.com/practice/20ef0972485e41019e39543e8e895b7f?tpId=196&tqId=37090&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Fdifficulty%3D2%26page%3D1%26pageSize%3D50%26search%3D%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196&difficulty=2&judgeStatus=undefined&tags=578&title=
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i + 1;
                    res[1] = j + 1;
                    break;
                }
            }
        }

        return res;
        // write code here
    }

    public int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                return new int[]{hashMap.get(target - numbers[i]) + 1, i + 1};
            } else {
                 hashMap.put(numbers[i],i);
            }
        }

        return null;
    }

}
