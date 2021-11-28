package com.leeup.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName combinationSumIII
 * @Description 组合III，和为n的k个数
 * @Author clee
 * @Date 2021/3/21 9:24
 * @Version 1.0
 **/
public class combinationSumIII {

    List<List<Integer>> result = new ArrayList<>();
    Deque<Integer> path = new ArrayDeque<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n,k,0,1);
        return result;
    }

    public void backTracking(int targetNum, int k,int sum,int startIndex) {
        if (path.size() == k) {
            if (sum == targetNum)
                result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            sum += i;
            path.push(i);
            backTracking(targetNum, k , sum,i + 1);
            sum -= i;
            path.pop();
        }
    }
}
