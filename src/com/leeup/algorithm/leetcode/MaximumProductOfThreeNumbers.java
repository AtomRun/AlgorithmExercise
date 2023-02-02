package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName MaximumProductOfThreeNumbers
 * @Description TODO
 * @Author clee
 * @Date 2020/11/12 17:44
 * @Version 1.0
 **/
public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {

        System.out.println(maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
        //return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    }
}
