package com.poker;

import java.util.LinkedList;

/**
 * 1. 从牌顶拿出一张牌，放到桌子上
 * 2. 从牌顶拿出一张牌，放在牌的底部
 * 3. 重复第一步，第二步操作，知道所有的牌都放到了桌子上
 * <p>
 * 问：已知桌子上牌的顺序是1,2,3,4,5,6,7,8,9,10,11,12,13
 * 牌原来的顺序是什么
 * <p>
 * 分析：如果这个操作倒着来
 * 1. 从牌底部拿一张牌放到牌顶
 * 2. 从桌子上拿一张牌放到牌顶
 */
public class PokerOrder {

    public static void main(String[] args) {
        System.out.println(obtainTThePokerOrder(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}));
    }

    public static LinkedList<Integer> obtainTThePokerOrder(int[] resultOrder) {
        LinkedList<Integer> originalOrder = new LinkedList<>();
        if (resultOrder.length == 0) {
            return originalOrder;
        } else {
            for (int i = resultOrder.length - 1; i >= 0; i--) {
                if (originalOrder.size() > 0) {
                    originalOrder.addFirst(originalOrder.removeLast());
                }
                originalOrder.addFirst(resultOrder[i]);
            }
        }
        return originalOrder;
    }
}
