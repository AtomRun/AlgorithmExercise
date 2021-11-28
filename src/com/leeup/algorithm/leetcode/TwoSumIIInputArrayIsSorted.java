package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName TwoSumIIInputArrayIsSorted
 * @Description TODO
 * @Author clee
 * @Date 2021/1/20 11:49
 * @Version 1.0
 **/
public class TwoSumIIInputArrayIsSorted {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }

    //暴力枚举
    public static int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = index1 + 1;
        if (numbers.length <= 2) {
            return new int[]{};
        }
        if (numbers.length == 2) {
            return new int[]{1, 2};
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }

    //双指针
    public static int[] twoSum2(int[] numbers, int target) {

        //定义两个变量，low是左边的数值小
        int low = 0;
        //high右边，数值大，因为数组是升序排列的
        int high = numbers.length - 1;

        //如果左边比右边小
        while (low < high) {
            //左边加右边等于目标值，直接+1返回
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] < target) {
                //小于目标值，我们将左边的移动一位，因为右边的更大
                low = low + 1;
            } else if (numbers[low] + numbers[high] > target) {
                high = high - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
