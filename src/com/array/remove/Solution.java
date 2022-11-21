package com.array.remove;


/**
 * 双指针法
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length) {
          if(nums[p]!=nums[q]){
              nums[p+1] = nums[q];
              p=p+1;
          }else {
              q=q+1;
          }

        }
        return p+1;
    }
}
