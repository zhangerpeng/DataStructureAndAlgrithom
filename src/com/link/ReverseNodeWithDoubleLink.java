package com.link;

import com.link.model.ListNode;

public class ReverseNodeWithDoubleLink {
    /**
     * 双链表求解是把原链表的结点一个个摘掉，每次摘掉的链表都让他成为新的链表的头结点，然后更新新链表。下面以链表
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            // 记录当前节点下一个节点的位置，便于接下来的拼接
            ListNode tempNode = head.next;
            // 当前节点的next指向创建newHead
            head.next = newHead;
            // newHead 节点前移，以便后续节点的挂载
            newHead = head;
            // 移动到下一个节点
            head = tempNode;
        }
        return newHead;
    }
}
