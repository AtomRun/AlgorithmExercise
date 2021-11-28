package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName SquaresOfASortedArray
 * @Description 区间和的个数
 * @Author clee
 * @Date 2020/11/7 9:57
 * @Version 1.0
 **/
public class SquaresOfASortedArray {

    public static void main(String[] args) {
        sortedSquares1(new int[]{-4,-1,0,3,10});
    }

    /**
     * 双指针
     */
    public static int[] sortedSquares1(int[] A) {
        return null;
    }


    /**
     * paixu法
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        int [] nums =new int [A.length];
        for (int i = 0; i < A.length; i++) {
            nums[i] = A[i] * A[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
