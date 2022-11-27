package com.greed;


import java.util.Arrays;

public class MinmumNumberOfHost {
    public int minmumNumberOfHost(int n, int[][] startEnd) {
        int[] start = new int[n];
        int[] end = new int[n];
        int ans = 0;
        for (int i = 0; i < startEnd.length; i++) {
            start[i] = startEnd[i][0];
            end[i] = startEnd[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int j = 0;
        for (int i = 0; i < start.length; i++) {
            if (start[i] >= end[j]) {
                j++;
            } else {
                ans = ans + 1;
            }
        }

        return ans;
    }
}
