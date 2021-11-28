package com.leeup.algorithm.leetcode;

/**
 * @ClassName MinimumSizeSubarraySum
 * @Description 209长度最小的子数组
 * @Author clee
 * @Date 2020/11/9 18:05
 * @Version 1.0
 **/

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

    }

    //滑动窗口（双指针）
    public int minSubArrayLen1(int s, int[] nums) {
        int i = 0;//左边指针
        int j = 0;//右边指针
        int result = nums.length + 1;//存最小值？
        int total = 0;//计算子数组的和
        while (j < nums.length) {
            //j!=nums.length说明没有到最后
            total += nums[j];
            j++;//每次赋值之后向后移动
            while (total > s) {
                //结果大于s
                result = Math.min(result, j - i);
            }
        }
        return -1;
    }

    //暴力法
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int size = 1; //子数组的长度
        while (size <= nums.length) {
            for (int i = 0; i < nums.length - size + 1; i++) {
                int total = 0;
                for (int j = i; j < i + size; j++) {
                    total += nums[i];
                }
                if (total >= s) {
                    return size;
                }
            }
            size++;
        }
        return 0;
    }

}
