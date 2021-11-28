package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreePreorderTraversal
 * @Description 144. 二叉树的前序遍历
 * @Author clee
 * @Date 2021/1/9 11:24
 * @Version 1.0
 **/
public class BinaryTreePreorderTraversal {

    //递归方式
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> integers = new ArrayList<>(0);

        if (root==null){
            return integers;
        }
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }

    public static void preorder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}