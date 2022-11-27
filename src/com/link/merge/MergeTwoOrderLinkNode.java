package com.link.merge;

import com.link.model.ListNode;

public class MergeTwoOrderLinkNode {
    public ListNode Merge(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        if (list1 == null && list2 != null) curr.next = list2;
        if (list2 == null && list1 != null) curr.next = list1;

        return dummyNode.next;

    }
}
