package com.leeup.algorithm.acwing.topic;

/**
 * @ClassName 反转链表
 * @Description TODO
 * @Author clee
 * @Date 2021/3/18 12:31
 * @Version 1.0
 **/
public class 反转链表 {

    public static ListNode recursionListNode(ListNode current, ListNode prev) {
        if (null == current) {
            return prev;
        }

        ListNode temp = current.next;
        current.next = prev;
        return recursionListNode(temp, current);
    }

    public ListNode reverse(ListNode current) {
        return recursionListNode(current, null);
    }

    public static ListNode reverseListTest(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        while (null != current) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode curr = head;
        ListNode prev = curr.next;
        while (prev != null) {
            ListNode next = prev.next;
            prev.next = curr;
            curr = prev;
            prev = next;
        }
        head.next = null;
        return curr;
    }


    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

