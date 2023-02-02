package com.leeup.algorithm.leetcode;

/**
 * @ClassName FindPeakElement
 * @Description 162. 寻找峰值
 * @Author clee
 * @Date 2020/11/8 16:42
 * @Version 1.0
 **/
public class FindPeakElement {


    //SB办法
    public int findPeakElement1(int[] nums) {

        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }


    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
