package com.leeup.algorithm.leetcode;

/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author clee
 * @Date 2020/11/8 16:04
 * @Version 1.0
 **/
public class BinarySearch {

    public static void main(String[] args) {
        search1(new int[]{-1,0,3,5,9,12},9);
    }

    //二分
    public static int search1(int[] nums,int target){
        if (nums.length==0){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right -left)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

    //常规
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
