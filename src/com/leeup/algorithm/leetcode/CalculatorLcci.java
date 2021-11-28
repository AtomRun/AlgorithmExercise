package com.leeup.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName CalculatorLcci
 * @Description 面试题 16.26. 计算器
 * @Author clee
 * @Date 2020/11/14 10:54
 * @Version 1.0
 **/
public class CalculatorLcci {

    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));
    }

    public static int calculate(String s) {
        Deque<Character> deque = new LinkedList<>();
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            while (s.contains("*") || s.contains("/")) {
                if (chars[i] == '*') {
                    result += chars[i - 1] * chars[i + 1];
                }
                if (chars[i] == '/') {
                    result += chars[i - 1] / chars[i + 1];
                }
            }
            if (chars[i] == '+') {
                result += chars[i - 1] + chars[i + 1];
            }
            if (chars[i] == '-') {
                result += chars[i - 1] - chars[i + 1];
            }
        }
        return result;
    }
}
