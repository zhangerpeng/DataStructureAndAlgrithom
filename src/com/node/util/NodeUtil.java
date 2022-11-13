package com.node.util;

import com.node.model.Node;

public class NodeUtil {

    public static Node initData(int[] dataArray) {
        Node node = new Node();
        Node linkedNode = node;
        for (int i = 0; i < dataArray.length; i++) {
            Node no = new Node(dataArray[i]);
            node.next = no;
            node = node.next;
        }

        return linkedNode.next;
    }

    public static void printNode(Node node) {

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
