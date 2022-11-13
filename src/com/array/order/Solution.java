package com.array.order;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        int[] initPosition = new int[]{56, 13, 26, 35, 32, 42, 72};
        Arrays.sort(initPosition);
        returnTheNumberWithShapeOrder(initPosition).stream().forEach(e -> {
            System.out.println(e);
        });


    }

    private static List<Integer> returnTheNumberWithShapeOrder(int[] initPosition) {
        // use the linked list so that insert the value in the specific location
        List<Integer> numberLInkedList = new LinkedList<>();

        Arrays.sort(initPosition);
        // template to note the aisle number that is used to judging the insert data order from max to min or reverse
        int aisleForNumber = 1;

        int indexLocation = 0;

        for (int i = 0; i < initPosition.length; i++) {
            if (i == 0) {
                aisleForNumber = returnAisleNumberForThroughSecond(initPosition[i]);
                indexLocation = 0;
                numberLInkedList.add(initPosition[i]);
            } else {
                if (aisleForNumber == returnAisleNumberForThroughSecond(initPosition[i])) {
                    // the data location no change since we all ready from min to max
                    if (aisleForNumber % 2 == 0) {
                        numberLInkedList.add(initPosition[i]);
                    } else {

                        // judge the current avlue and indexLocation value which is nearer with start point
                        int indexLocationDataHigh = initPosition[indexLocation] / 10;
                        int currentLocationDataHigh = initPosition[i] / 10;
                        if (indexLocationDataHigh == currentLocationDataHigh) {
                            numberLInkedList.add(indexLocation, initPosition[i]);

                        } else {
                            numberLInkedList.add(initPosition[i]);
                            indexLocation = i;
                        }
                    }
                } else {
                    // the first change the aisle
                    indexLocation = i;
                    aisleForNumber = returnAisleNumberForThroughSecond(initPosition[i]);
                    numberLInkedList.add(initPosition[i]);

                }
            }

        }
        return numberLInkedList;
    }

    private static int returnAisleNumberForThroughSecond(int number) {

        if (0 <= number && number < 20) {
            return 0;
        }
        if (number >= 20 && number < 40) {

            return 1;
        }
        if (number >= 40 && number < 60) {
            return 2;

        }
        if (number >= 60 && number < 80) {
            return 3;
        }
        if (number >= 80) {
            return 4;

        }
        return 100;
    }


}
