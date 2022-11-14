package com.array.count;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataString = sc.nextLine();
        Collections.sort(Arrays.asList(dataString));
        int[] dataArray = Arrays.stream(dataString.split(" "))
                .mapToInt(Integer::parseInt).toArray();

        countNumberTimes(dataArray).forEach((key, val) -> {
            System.out.println("key=" + key + "，value=" + val);
        });
    }


    private static Map<Integer, Integer> countNumberTimes(int[] dataArray) {
        Map<Integer, Integer> dataNumberTimesMap = new HashMap<>();
        for (int i = 0; i < dataArray.length; i++) {
            if (dataNumberTimesMap.containsKey(dataArray[i])) {
                Integer times = dataNumberTimesMap.get(dataArray[i]);
                dataNumberTimesMap.put(dataArray[i], ++times);
            } else {
                dataNumberTimesMap.put(dataArray[i], 1);
            }
        }

        return dataNumberTimesMap;
    }


}
