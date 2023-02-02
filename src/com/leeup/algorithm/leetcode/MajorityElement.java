package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName MajorityElement
 * @Description 169. 多数元素
 * @Author clee
 * @Date 2020/11/15 10:33
 * @Version 1.0
 **/
public class MajorityElement {


    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement(int[] nums) {
        return 0;
    }
}
