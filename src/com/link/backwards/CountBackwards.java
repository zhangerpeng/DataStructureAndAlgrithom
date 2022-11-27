package com.link.backwards;

import com.link.model.ListNode;

import java.util.Stack;

public class CountBackwards {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        if (pHead == null || k == 0) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        while (pHead != null) {
            stack.add(pHead);
            pHead = pHead.next;

        }

        if (stack.size() < k) {
            return null;
        }
        ListNode firstNode = stack.pop();
        while (--k > 0) {
            ListNode te = stack.pop();
            te.next = firstNode;
            firstNode = te;
        }

        return firstNode;
    }
}
