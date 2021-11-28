package com.leeup.algorithm.leetcode;

import java.util.Arrays;
import java.util.logging.Level;

/**
 * @ClassName MoveZeroes
 * @Description TODO
 * @Author clee
 * @Date 2020/11/19 9:42
 * @Version 1.0
 **/
public class MoveZeroes {

    /**
     * 使用双指针，左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
     * 右指针不断向右移动，每次右指针指向非零数，则将左右指针对应的数交换，同时左指针右移。
     * 注意到以下性质：
     * 左指针左边均为非零数；
     * 右指针左边直到左指针处均为零。
     * 因此每次交换，都是将左指针的零与右指针的非零数交换，且非零数的相对顺序并未改变。
     * @param args
     */

    public static void main(String[] args) {
        int[] ints = moveZeroes1(new int[]{1, 1, 0, 3, 12});
        for (int i :
                ints) {
            System.out.println(i);
        }
    }


    public static int[] moveZeroes1(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        return nums;
    }

    /**
     * 无排序非零
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length < 2) {
            return;
        }

        while (left < right) {
            if (nums[right] == 0) {
                right--;
            }
            if (nums[left] == 0) {
                swap(nums, left, right);
                left++;
            }
            right--;
            left++;
        }
    }

    public static void swap(int[] arr, int i, int j) {

    }
}
