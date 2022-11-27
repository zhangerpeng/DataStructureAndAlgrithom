package com.array.revolve;

/**
 * https://www.nowcoder.com/practice/e19927a8fd5d477794dac67096862042?tpId=295&tqId=1024689&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 描述
 * 一个数组A中存有 n 个整数，在不允许使用另外数组的前提下，将每个整数循环向右移 M（ M >=0）个位置，即将A中的数据由（A0 A1 ……AN-1 ）变换为（AN-M …… AN-1 A0 A1 ……AN-M-1 ）（最后 M 个数循环移至最前面的 M 个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
 *
 * 数据范围：0 < n \le 1000<n≤100，0 \le m \le 10000≤m≤1000
 * 进阶：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
 * 示例1
 * 输入：
 * 6,2,[1,2,3,4,5,6]
 * 复制
 * 返回值：
 * [5,6,1,2,3,4]
 * 复制
 * 示例2
 * 输入：
 * 4,0,[1,2,3,4]
 * 复制
 * 返回值：
 * [1,2,3,4]
 */
public class ArrayRevolve {

    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
       m=m%n;
       reverse(a,0,n);
       reverse(a,0,m-1);
       reverse(a,m,n-1);
       return a;
    }

    private void reverse(int[]array,int start,int end){
        while (start<end){
            swap(array,start++,end--);
        }
    }

    private void swap(int[] array, int start, int end) {
        int temp= array[start];
        array[start]= array[end];
        array[end]= temp;
    }
}
