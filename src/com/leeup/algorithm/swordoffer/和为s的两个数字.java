package com.leeup.algorithm.swordoffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName 和为s的两个数字
 * @Description 剑指 Offer 57. 和为s的两个数字
 * @Author clee
 * @Date 2020/12/23 21:38
 * @Version 1.0
 **/
public class 和为s的两个数字 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int [] {map.get(target-nums[i]),nums[i]};
            }
            map.put(nums[i],nums[i]);
        }
        return new int[0];
    }
}
