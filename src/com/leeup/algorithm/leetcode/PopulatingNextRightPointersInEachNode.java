package com.leeup.algorithm.leetcode;

/**
 * @ClassName PopulatingNextRightPointersInEachNode
 * @Description 116
 * @Author clee
 * @Date 2020/12/14 14:18
 * @Version 1.0
 **/


public class PopulatingNextRightPointersInEachNode {

    //递归
    public Node connect1(Node root) {
        if (root==null){
            return null;
        }
        connectNode(root.left,root.left);
        return root;
    }

    void connectNode(Node node1,Node node2){
        if(node1==null || node2==null){
            return;
        }
        node1.next = node2;
        connectNode(node1.left,node1.right);
        connectNode(node2.left,node2.right);
        connectNode(node1.right,node2.left);
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};