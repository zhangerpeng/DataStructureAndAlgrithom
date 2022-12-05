package com.link.remove;

import com.link.model.ListNode;

/**
 * https://www.nowcoder.com/practice/f95dcdafbde44b22a6d741baf71653f6?tpId=295&tqId=727&ru=/exam/oj&qru=/ta/format-top101/question-ranking&sourceUrl=%2Fexam%2Foj
 * 描述
 * 给定一个链表，删除链表的倒数第 n 个节点并返回链表的头指针
 * 例如，
 * 给出的链表为: 1\to 2\to 3\to 4\to 51→2→3→4→5, n= 2n=2.
 * 删除了链表的倒数第 nn 个节点之后,链表变为1\to 2\to 3\to 51→2→3→5.
 * <p>
 * 数据范围： 链表长度 0\le n \le 10000≤n≤1000，链表中任意节点的值满足 0 \le val \le 1000≤val≤100
 * 要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
 * 备注：
 * 题目保证 nn 一定是有效的
 */
public class RemoveNodeByReverseOrder {
    /**
     * @param head ListNode类
     * @param n    int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode dummyNode = head;
        ListNode p = dummyNode;
        while (dummyNode != null) {
            length++;
            dummyNode = dummyNode.next;
        }

        if (length < 2) return null;

        if (n == length) {
            p = p.next;
        }

        int i = 0;
        while (head != null) {
            i=i+1;
            if(i==length-n){
                head.next = head.next.next;
                break;
            }
            head=head.next;
        }

        return p;
    }
}
