package com.node.operation;

import com.node.model.Node;

import static com.node.util.NodeUtil.initData;
import static com.node.util.NodeUtil.printNode;


public class MergerLInkNodes {
    public static void main(String[] args) {
        Node linkedNode1 = initData(new int[]{1, 2, 4});
        Node linkedNode2 = initData(new int[]{1, 3, 4});
        printNode(mergeTwoLinked(linkedNode1,linkedNode2));
    }

    private static Node mergeTwoLinked(Node linkedNode1, Node linkedNode2) {
        Node node = new Node();
        Node mergeNode = node;
        while (linkedNode1 != null && linkedNode2 != null) {
            if (linkedNode1.val <= linkedNode2.val) {
                node.next = linkedNode1;
                linkedNode1 = linkedNode1.next;
            } else {
                node.next = linkedNode2;
                linkedNode2 = linkedNode2.next;
            }
            node = node.next;
        }

        if (linkedNode1 == null) {
            node.next = linkedNode2;
        }

        if (linkedNode2 == null) {
            node.next = linkedNode1;

        }
        return mergeNode.next;
    }
}
