package com.array.half;

import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int index = 0;
        int times = 0;
        while (index < array.length-1) {
            if (array[index] == array[index + 1]) {
                times = times + 1;
                if (times >= array.length / 2) break;
            } else {
                times = 0;
            }
            index=index+1;
        }
        return array[index];
    }
}
