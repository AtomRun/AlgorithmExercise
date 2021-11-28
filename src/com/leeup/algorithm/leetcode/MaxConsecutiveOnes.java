package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName MaxConsecutiveOnes
 * @Description 485. 最大连续1的个数
 * @Author clee
 * @Date 2020/11/16 9:26
 * @Version 1.0
 **/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    //n logn 排序法
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else if (++count > max) {
                max = count;
            }
        }
        return max;
    }

    public static int findMaxConsecutiveOnes1(int[] nums) {

        int mark = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp = Math.max(temp, mark);
                mark = 0;
            }else {
                mark++;
            }
        }

        return Math.max(temp, mark);
    }
}
