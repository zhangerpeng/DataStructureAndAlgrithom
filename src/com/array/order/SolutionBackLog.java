package com.array.order;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SolutionBackLog {
    public static void main(String[] args) {
        System.out.println("Corresponding order by given condition");
        System.out.println("The example 1:" +
                "Given a position [56,13,26,35,32,42,72] " +
                "when the first three aisle all need to be picked");
        int[] initPositionExample1 = new int[]{56, 13, 26, 35, 32, 42, 72};
        System.out.println("The result of example 1 order by shape");
        System.out.println(Arrays.toString(returnTheNumberWithShapeOrder(initPositionExample1, false).toArray()));

        System.out.println();

        System.out.println("The example 2:" +
                "Given a position [18, 65, 77, 79, 5, 41, 57, 72] " +
                "when the second aisle does not need picking");
        int[] initPositionExample2 = new int[]{18, 65, 77, 79, 5, 41, 57, 72};
        System.out.println("The result of example 2 order by shape");
        System.out.println(Arrays.toString(returnTheNumberWithShapeOrder(initPositionExample2, true).toArray()));


    }

    private static List<Integer> returnTheNumberWithShapeOrder(int[] initPosition, boolean isSkipSecondAisle) {
        List<Integer> numberLInkedList = new LinkedList<>();
        Arrays.sort(initPosition);
        int aisleForNumber = 1;
        int indexLocation = 0;
        for (int i = 0; i < initPosition.length; i++) {
            if (i == 0) {
                aisleForNumber = returnAisleNumberByDataAndSkipStrategy(initPosition[i], isSkipSecondAisle);
                indexLocation = 0;
                numberLInkedList.add(initPosition[i]);
            } else {
                if (aisleForNumber == returnAisleNumberByDataAndSkipStrategy(initPosition[i], isSkipSecondAisle)) {
                    // judge the current avlue and indexLocation value which is nearer with start point
                    int indexLocationDataHigh = initPosition[indexLocation] / 10;
                    int currentLocationDataHigh = initPosition[i] / 10;

                    // the data location no change
                    if (aisleForNumber % 2 == 0) {
                        if (indexLocationDataHigh == currentLocationDataHigh) {
                            numberLInkedList.add(initPosition[i]);
                        } else {
                            if (initPosition[indexLocation] % 10 > initPosition[i] % 10) {
                                numberLInkedList.add(indexLocation, initPosition[i]);
                            } else {
                                numberLInkedList.add(initPosition[i]);
                            }
                        }

                    } else {
                        if (indexLocationDataHigh == currentLocationDataHigh) {
                            numberLInkedList.add(indexLocation, initPosition[i]);

                        } else {
                            if (initPosition[indexLocation] % 10 < initPosition[i] % 10) {
                                numberLInkedList.add(indexLocation, initPosition[i]);
                            } else {
                                numberLInkedList.add(initPosition[i]);
                            }
                            indexLocation = i;
                        }
                    }
                } else {
                    indexLocation = i;
                    aisleForNumber = returnAisleNumberByDataAndSkipStrategy(initPosition[i], isSkipSecondAisle);
                    numberLInkedList.add(initPosition[i]);

                }
            }

        }
        return numberLInkedList;
    }

    private static int returnAisleNumberByDataAndSkipStrategy(int number, boolean isSkipSecondAisle) {

        if (0 <= number && number < 20) {
            return 0;
        }
        if (number >= 20 && number < 40) {
            return 1;
        }
        if (number >= 40 && number < 60) {

            return isSkipSecondAisle ? 1 : 2;

        }
        if (number >= 60 && number < 80) {
            return isSkipSecondAisle ? 2 : 3;
        }
        if (number >= 80) {
            return isSkipSecondAisle ? 3 : 4;

        }
        return -1;
    }

}
