package com.leeup.algorithm.leetcode;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName RemoveLinkedListElements
 * @Description 203.
 * @Author clee
 * @Date 2020/12/11 11:22
 * @Version 1.0
 **/
public class RemoveLinkedListElements {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (head!=null){
            //链表不为空并且不止有一个数据
            if (head.val==val){
                prev.next = head.next;
                head = head.next;
            }else {
                prev = head;
                head = head.next;
            }
        }
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
