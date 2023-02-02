package com.leeup.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName MissingNumber
 * @Description 丢失的数字
 * @Author clee
 * @Date 2020/11/11 10:41
 * @Version 1.0
 **/
public class MissingNumber {


    public static void main(String[] args) {
        missingNumber2(new int[]{3, 0, 1});
    }


    /**
     * math
     *
     * @param nums
     * @return
     */
    public static int missingNumber2(int[] nums) {
        int sum = 0;
        int total = (nums.length * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum != total) {
            return total - sum;
        }
        return 0;
    }

    /**
     * HashSet
     *
     * @param nums
     * @return
     */
    public int missingNumber1(int[] nums) {
        HashSet set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 排序法 O(Nlogn)
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
            last = i;
        }
        return last + 1;
    }

}
