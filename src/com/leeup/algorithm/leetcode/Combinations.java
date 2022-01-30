package com.leeup.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName Combinations
 * @Description 77.组合
 * @Author clee
 * @Date 2021/3/21 7:50
 * @Version 1.0
 **/
public class Combinations {

    public static void main(String[] args) {
        System.out.println(combine(4, 2).toString());
    }
    /**
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
     */
    static List<List<Integer>> result = new ArrayList<>();//存放符合条件结果的集合
    static Deque<Integer> path = new ArrayDeque<>();//存放符合条件的结果

    public static List<List<Integer>> combine(int n, int k) {

        result.add(Collections.singletonList(1));
        result.add(Collections.singletonList(2));
        result.add(Collections.singletonList(3));
        result.add(Collections.singletonList(4));

        //回溯三部曲
        //1. 递归函数的参数和返回值
        //2. 递归的终止条件
        //3. 确定单层递归的逻辑
        backTracking(n,k,1);
        return result;
    }

    public static void backTracking(int n, int k, int startIndex) {
        if (path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n-(k-path.size()); i++) {
            path.push(i);
            backTracking(n,k,i+1);
            path.pop();
        }
    }
}
