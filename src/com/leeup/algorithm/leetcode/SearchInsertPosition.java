package com.leeup.algorithm.leetcode;

/**
 * @ClassName SearchInsertPosition
 * @Description 搜索插入位置
 * @Author clee
 * @Date 2020/11/5 10:01
 * @Version 1.0
 **/
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 4));
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     */

    /**
     * 遍历法
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target) {

        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return i;
    }

    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        //new int[]{1, 3, 5, 6}, 2
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left+ (right - left )/2;
            if (nums[mid] == target){
                return mid;
            }else if (target<nums[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        //new int[]{1, 3, 5, 6}, 2 这种情况下，mid为3，target为2，2<3 left和right直接就指向了1
        //直接return left就是错误的。所以我们在循环外判断，当循环结束的时候left一定是>=right了，所以这种情况下，
        //我们判断left指向的值是否比target的值小，如果小那就插入到left+1的地方，如果不小，那就插入到left的地方
        return nums[left]<target?left+1:left;
    }
}