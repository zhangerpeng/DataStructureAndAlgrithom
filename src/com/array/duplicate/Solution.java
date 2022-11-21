package com.array.duplicate;

import java.util.Arrays;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。存在不合法的输入的话输出-1
 *
 * 数据范围：0\le n \le 10000 \0≤n≤10000
 * 进阶：时间复杂度O(n)\O(n) ，空间复杂度O(n)\O(n)
 * https://www.nowcoder.com/practice/6fe361ede7e54db1b84adc81d09d8524?tpId=196&tqId=39734&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Fdifficulty%3D2%26page%3D1%26pageSize%3D50%26search%3D%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196&difficulty=2&judgeStatus=undefined&tags=578&title=
 */
public class Solution {

    public int duplicate (int[] numbers) {
        Arrays.sort(numbers);
        int index=0;
        int res =-1;
        while (index<numbers.length){
            if(numbers[index]==numbers[index+1]){
                res = numbers[index];
                break;
            }
            index=index+1;
        }
        return res;
    }
}
