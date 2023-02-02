package com.leeup.algorithm.leetcode;

/**
 * @ClassName MergeTwoSortedLists
 * @Description 合并两个有序链表
 * @Author clee
 * @Date 2020/11/4 10:49
 * @Version 1.0
 **/
public class MergeTwoSortedLists {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();//返回结果的链表
        ListNode cur = res;           //用来移动的cur

        while (l1 != null && l2 != null) {
            //l1<l2
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return res.next;
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeListNodes(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = l1, p2 = l2;

        while (l1 != null && l2 != null) {
            if (p1.val > p2.val) {
                p.next = p2;

                // 将p2后移一位
                p2 = p2.next;
            } else {
                p.next = p1;

                //同理每次位置接到p后，将p1后移用于下次比较
                p1 = p1.next;
            }

            //最后将p也后移，其实这里会为null，但是下次循环的时候就会赋值
            p = p.next;

        }

        // 上面循环结束后，如果有任何一个还不为空，直接放进去
        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }

}