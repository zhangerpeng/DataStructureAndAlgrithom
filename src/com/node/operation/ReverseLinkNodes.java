package com.node.operation;

import com.node.model.Node;

import static com.node.util.NodeUtil.initData;
import static com.node.util.NodeUtil.printNode;


public class ReverseLinkNodes {
    public static void main(String[] args) {
        Node linkedNode1 = initData(new int[]{1, 2, 4,6});
        printNode(reverseNode(linkedNode1));
    }

    private static Node reverseNode(Node node) {
        Node reverseNode = null;
        Node curr = node;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = reverseNode;
            reverseNode= curr;
            curr = temp;
        }

        return reverseNode;
    }
}

