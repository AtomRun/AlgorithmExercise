package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 二叉树的递归遍历
 * @Description TODO
 * @Author clee
 * @Date 2021/3/21 16:50
 * @Version 1.0
 **/
public class 二叉树的递归遍历 {

    public List<Integer> getTreeKey(TreeNode root){
         List<Integer> returnElement = new ArrayList<>();
         if (root==null){
             return returnElement;
         }
         List<Integer> result = new ArrayList<>();
         treeIterator(root,result);
         return result;
    }

    private void treeIterator(TreeNode root, List<Integer> result) {
        if (root==null){
            return;
        }
        result.add(root.val);
        treeIterator(root.left,result);
        treeIterator(root.right,result);
    }
}
