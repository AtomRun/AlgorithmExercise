package com.leeup.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName Subsets
 * @Description 78子集
 * @Author clee
 * @Date 2020/11/21 11:18
 * @Version 1.0
 **/
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len, 0, path, res);
        return null;
    }

    private void dfs(int[] nums, int len, int index, Deque<Integer> path, List<List<Integer>> res) {
        if (index == len) {
            //到了递归的叶子节点
        }

    }
}
