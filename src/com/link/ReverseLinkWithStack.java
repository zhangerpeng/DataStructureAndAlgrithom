package com.link;


import com.link.model.ListNode;

import java.util.Stack;

/**
 * 描述
 * 给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，长度为n，反转该链表后，返回新链表的表头。
 * <p>
 * 数据范围： 0\leq n\leq10000≤n≤1000
 * 要求：空间复杂度 O(1)O(1) ，时间复杂度 O(n)O(n) 。
 * <p>
 * 如当输入链表{1,2,3}时，
 * 经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
 */
public class ReverseLinkWithStack {
    /**
     * 链表反转
     * 方案1：使用栈，使得节点进行翻转
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if (head == null) return null;
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode node = stack.pop();
        ListNode reverseNode = node;

        while (!stack.empty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }

        node.next = null;
        return reverseNode;
    }
}
