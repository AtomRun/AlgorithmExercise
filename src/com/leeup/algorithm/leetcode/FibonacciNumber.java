package com.leeup.algorithm.leetcode;

/**
 * @ClassName FibonacciNumber
 * @Description 509. 斐波那契数
 * @Author clee
 * @Date 2020/11/12 11:26
 * @Version 1.0
 **/
public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    public static int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
