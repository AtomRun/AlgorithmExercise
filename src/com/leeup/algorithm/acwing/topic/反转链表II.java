package com.leeup.algorithm.acwing.topic;

/**
 * @ClassName 反转链表II
 * @Description TODO
 * @Author clee
 * @Date 2021/3/20 9:58
 * @Version 1.0
 **/
public class 反转链表II {

    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        //left取头结点的话，头结点的指向可能会发生变化，所以我们创建一个虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode a = dummy;

        //从虚拟头节点开始走，走left-1步，就能找到left的前一个节点
        for (int i = 0; i < left - 1; i++) {
            a = a.next;
        }
        //循环结束a就是left前一个位置
        //走的步数就是right-left步
        ListNode b = a.next, c = b.next;
        for (int i = 0; i < right - left; i++) {
            ListNode d = c.next;
            c.next = b;
            b = c;
            c = d;
        }
        a.next.next = c;
        a.next = b;
        return dummy.next;
    }
}
