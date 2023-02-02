package com.leeup.algorithm.leetcode;

/**
 * @ClassName SubtractTheProductAndSumOfDigitsOfAnInteger
 * @Description 整数的各位积和之差
 * @Author clee
 * @Date 2020/12/8 14:26
 * @Version 1.0
 **/
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        int add = 0;
        int mul = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            add += digit;
            mul += digit;
        }
        return mul - add;
    }
}
