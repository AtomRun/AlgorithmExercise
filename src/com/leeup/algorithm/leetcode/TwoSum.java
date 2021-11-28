package com.leeup.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoNumber
 * @Description leetCode 第一题，两数之和
 * @Author clee
 * @Date 2020/10/30 10:50
 * @Version 1.0
 **/
public class TwoSum {

    /*
    给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    */
    public static void main(String[] args) {
        int[] index = getIndex1(new int[]{1, 2, 7, 6, 11}, 18);
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }

    //暴力循环
    public static int[] getIndex1(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i]);
                    System.out.println(array[j]);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    //使用hashMap
    public static int[] getIndex2(int[] array, int target) {

        //使用hashMap存储遍历过的数据
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < array.length; ++i) {
            //从第一个数遍历数组

            //如果hashmap里有target-array[i]的数据，即该数+array[i] = target
            if (hashtable.containsKey(target - array[i])) {
                //直接返回
                return new int[]{hashtable.get(target - array[i]), i};
            }
            //否则就放到hashmap的key中，key是数组的值，value是数组的下标
            //这样遍历一遍之后，假设第一遍没有命中，那么所有的元素都会被放到hashmap中，HashMap的存取复杂度都是O(1)整个算法复杂度O(n)
            hashtable.put(array[i], i);
        }
        return new int[0];
    }

    //手写一遍hash方式
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}