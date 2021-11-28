package com.leeup.algorithm.swordoffer;

import java.util.Stack;
import java.util.TreeMap;

/**
 * @ClassName 从尾到头打印链表
 * @Description 06
 * @Author clee
 * @Date 2020/12/19 21:34
 * @Version 1.0
 **/
public class 从尾到头打印链表 {


    //压栈
    public int[] reversePrint1(ListNode head) {
        Stack<ListNode> stk = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {//一直指向最后一个
            stk.push(temp);
            temp = temp.next;
        }
        int n = stk.size();
        int [] res = new int [n];
        for (int i = 0; i < n; i++) {
            res[i] = stk.pop().val;
        }
        return res;
    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
