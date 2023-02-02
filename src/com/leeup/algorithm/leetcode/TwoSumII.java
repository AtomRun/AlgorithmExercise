package com.leeup.algorithm.leetcode;

/**
 * @ClassName TwoSumII
 * @Description TODO
 * @Author clee
 * @Date 2020/12/25 18:49
 * @Version 1.0
 **/
public class TwoSumII {

    static TwoSumII twoSumII;

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (target - numbers[l] == numbers[r]) {
                return new int[]{l, r};
            } else {
                l++;
            }
        }
        return null;
    }
}