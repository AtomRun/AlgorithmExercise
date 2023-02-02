package com.leeup.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FindMajorityElementLcci
 * @Description TODO
 * @Author clee
 * @Date 2020/11/1 17:13
 * @Version 1.0
 **/
public class FindMajorityElementLcci {

    public static void main(String[] args) {
        System.out.println(majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement1(int[] nums) {

        int times = 1;

        int mid = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                times++;
            }
            map.put(nums[i], times);
        }
        map.forEach((k, v) -> {
            System.out.println(k + "-----" + v);
        });

        int temp = 0;

        for (int key : map.keySet()) {
            Integer value = map.get(key);
            temp = temp > value ? temp : value;

            if (temp > mid) {
                return key;
                //todo 如何拿到最后面的key，不让满足条件的提前返回
            }
        }
        return -1;
    }

    public static int majorityElement(int[] nums) {
        // 投票算法
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp) {
                count++;
            }
            if (count == t) {
                return temp;
            }
        }
        return -1;
    }
}
