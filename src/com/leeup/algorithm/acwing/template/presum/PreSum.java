package com.leeup.algorithm.acwing.template.presum;

/**
 * @ClassName PreSum
 * @Description 前缀和
 * @Author clee
 * @Date 2020/12/23 17:22
 * @Version 1.0
 **/
public class PreSum {

    static int[] nums = new int[]{1, 56, 5641, 234, 6, 3446, 6654, 33};
    static int[] res = new int[nums.length];

    public static void main(String[] args) {

    }

    public static void preSum(int m) {

        res[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }
    }
}
