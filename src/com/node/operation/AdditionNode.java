package com.node.operation;

import com.node.model.Node;

import static com.node.util.NodeUtil.initData;
import static com.node.util.NodeUtil.printNode;

public class AdditionNode {

    public static void main(String[] args) {
        Node linkedNode = initData(new int[]{1, 3, 4});
        Node node = new Node(2);

        printNode(addNode(linkedNode, node));
    }

    private static Node addNode(Node linkedNodes, Node node) {
        Node curr = linkedNodes;
        Node result = curr;
        Node temp = null;
        while (curr != null) {
            temp = curr.next;
            if (curr.val <= node.val && node.val <= temp.val) {
                curr.next = node;
                node.next = temp;
                break;
            }
            curr = curr.next;
        }
        return result;
    }
}
