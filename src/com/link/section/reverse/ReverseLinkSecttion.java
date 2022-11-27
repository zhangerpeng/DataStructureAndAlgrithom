package com.link.section.reverse;

import com.link.model.ListNode;

public class ReverseLinkSecttion {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode curr = pre.next;
        ListNode Cur_next;
        for (int i = 0; i < n - m; i++) {
            Cur_next = curr.next;
            curr.next = Cur_next.next;
            Cur_next.next = pre.next;
            pre.next = Cur_next;
        }

        return dummyNode.next;
    }
}
