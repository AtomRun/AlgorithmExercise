package com.leeup.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李闯
 * @date 2022/3/12 14:20
 */
public class 寻找重复数 {

    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], i);
        }
        return -1;
    }
}
