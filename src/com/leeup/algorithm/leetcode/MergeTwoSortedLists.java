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


        while (l1!=null && l2!=null){
            //l1<l2
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1==null){
            cur.next = l2;
        }
        if (l2==null){
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

}