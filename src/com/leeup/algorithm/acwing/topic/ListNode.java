package com.leeup.algorithm.acwing.topic;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author clee
 * @Date 2021/3/20 9:58
 * @Version 1.0
 **/
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode() {

    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
