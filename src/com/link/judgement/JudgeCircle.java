package com.link.judgement;

import com.link.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class JudgeCircle {
    public boolean hasCycle(ListNode head) {
        ListNode dummy= head;
        Set<ListNode> visitedNodes = new HashSet<ListNode>();
        while (dummy !=null){
            if(visitedNodes.contains(dummy)){
                return true;
            }else {
                visitedNodes.add(dummy);
                dummy=dummy.next;
            }
        }
       return false;
    }
}
