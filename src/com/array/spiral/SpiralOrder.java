package com.array.spiral;

import java.util.ArrayList;

/**
 * 给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
 * <p>
 * 数据范围：0 \le n,m \le 100≤n,m≤10，矩阵中任意元素都满足 |val| \le 100∣val∣≤100
 * 要求：空间复杂度 O(nm)O(nm) ，时间复杂度 O(nm)O(nm)
 * <p>
 * [[1,2,3],[4,5,6],[7,8,9]]
 * <p>
 * [1,2,3,6,9,8,7,4,5]
 * https://www.nowcoder.com/practice/7edf70f2d29c4b599693dc3aaeea1d31?tpId=196&tqId=37072&rp=1&ru=/exam/oj&qru=/exam/oj&sourceUrl=%2Fexam%2Foj%3Fdifficulty%3D2%26page%3D1%26pageSize%3D50%26search%3D%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D196&difficulty=2&judgeStatus=undefined&tags=578&title=
 */
public class SpiralOrder {
    public static void main(String[] args) {

    }

    private static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        if (matrix[0].length == 0) {
            return res;
        }

        // 边界遍历
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int i;
        while (true) {
            // 从左往右
            for (i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // 从上往下
            top = top + 1;
            if (top > down) return res;
            for (i = top; i < down; i++) {
                res.add(matrix[i][right]);
            }
            // 从右往左
            right = right - 1;
            if (right < left) return res;
            for (i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            // 从左往上
            down = down - 1;
            if (down < top) return res;
            for (i = down; i >= top; down--) {
                res.add(matrix[i][left]);
            }

            left = left + 1;
            if (left > right) return res;

        }

    }
}
