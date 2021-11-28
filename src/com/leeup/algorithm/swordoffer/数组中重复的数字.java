package com.leeup.algorithm.swordoffer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @ClassName 数组中重复的数字
 * @Description TODO
 * @Author clee
 * @Date 2020/12/17 11:39
 * @Version 1.0
 **/
public class 数组中重复的数字 {

    public static void main(String[] args) {
        System.out.println(findRepeatNumber5(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }


    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //下标交换
        public static int findRepeatNumber5(int nums[]) {
            int n = nums.length;
            for (int num :
                    nums) {
                if (num < 0 || num > n) {
                    return -1;
                }
            }
            for (int i = 0; i < n; i++) {
                while (nums[i] != i && nums[nums[i]] != nums[i]) {
                    swap(nums,i,nums[i]);
                }
                if (nums[i] != i && nums[nums[i]]== nums[i]){
                    return nums[i];
                }
            }
            return -1;

    }

    //hashset
    public static int findRepeatNumber4(int nums[]) {
        HashSet set = new HashSet();
        int result = -1;
        for (int num : nums) {
            //添加失败，说明重复了
            if (!set.add(num)) {
                result = num;
                break;
            }
        }
        return result;
    }

    public static int findRepeatNumber3(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }


    //巧妙地想法， 0-n 那么下标不等于值的就是重复了
    public static int findRepeatNumber2(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return nums[i];
            }
        }
        return -1;
    }

    //hash O(N)
    public static int findRepeatNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], i);
        }
        return -1;
    }


    //O(nlogn)
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
