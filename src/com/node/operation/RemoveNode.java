package com.node.operation;

import com.node.model.Node;

import static com.node.util.NodeUtil.initData;
import static com.node.util.NodeUtil.printNode;

public class RemoveNode {
    public static void main(String[] args) {
        Node node = initData(new int[]{1, 4, 5, 6, 7, 8});
        printNode(removePointNode(node,1));

    }
    private static Node removePointNode(Node nodeList, int nodeVaule) {
        Node cur = new Node();
        cur.next= nodeList;
        Node result = cur;
        Node temp = null;
        while (cur != null) {
             temp = cur.next;
             if(temp.val == nodeVaule) {
                 cur.next = temp.next;
                 break;
             }
            cur = cur.next;
        }

        return result.next;
    }
}
