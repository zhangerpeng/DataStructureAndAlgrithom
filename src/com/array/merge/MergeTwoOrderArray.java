package com.array.merge;

import java.util.Arrays;
import java.util.Collections;

public class MergeTwoOrderArray {
    public static void main(String[] args) {

    }

    //给定递增数组A,B，合并A,B的元素，使合并过后的数组是递增的，并且存放在数组A中
    public static void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;

        while (end != 0 && i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[end--] = A[i--];
            } else {
                A[end--] = B[j--];
            }
        }
        while (j >= 0) {
            A[end--] = B[j--];
        }
    }


    public static  void merge2(int A[], int m, int B[], int n) {
        System.arraycopy(B,0,A,m,n);
        Arrays.sort(A);

    }
}
