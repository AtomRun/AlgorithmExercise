package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName 二叉树的迭代遍历
 * @Description TODO
 * @Author clee
 * @Date 2021/3/21 17:01
 * @Version 1.0
 **/
public class 二叉树的迭代遍历 {

    public List<Integer> IteratorTreeElement(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //前序遍历,先放root
        stack.push(root.val);
        while (stack != null) {
            result.add(stack.peek());
            stack.pop();
            //result.add(root)
        }
        return null;
    }
}
