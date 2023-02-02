package com.leeup.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName 分割回文串
 * @Description TODO
 * @Author clee
 * @Date 2021/4/1 10:40
 * @Version 1.0
 **/
public class 分割回文串 {

    Deque<String> path = new ArrayDeque<>();
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        return new ArrayList<>();
    }

    public void backTracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {

        }
    }

}
