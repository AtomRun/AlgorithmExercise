package com.leeup.algorithm.leetcode;

/**
 * @ClassName FindNumbers
 * @Description TODO
 * @Author clee
 * @Date 2020/11/20 15:14
 * @Version 1.0
 **/
public class FindNumbers {

    public static void main(String[] args) {
        System.out.println(findNumbers1(new int[]{12,345,2,6,7896}));
    }



    public static int findNumbers1(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            String temp = String.valueOf(nums[i]);
            if (temp.length()%2==0){
                result++;
            }
        }
        return result;
    }

    public static int findNumbers(int[] nums) {

        int result = 0;

        int ge = 0;
        int shi = 0;
        int bai = 0;
        int qian = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= 1000) {
                ge = nums[i]%10;
                shi = nums[i]/10%10;
                bai = nums[i]/100%10;
                qian =nums[i]/1000;
                if (ge%2==0||shi%2==0||bai%2==0||qian%2==0){
                    result++;
                }
            }
            if (nums[i] >= 100 && nums[i] < 1000) {
                ge = nums[i]%10;
                shi = nums[i]/10%10;
                bai = nums[i]/100%10;
                if (ge%2==0||shi%2==0||bai%2==0){
                    result++;
                }
            }
            if (nums[i] >= 10 && nums[i] < 100) {
                ge = nums[i]%10;
                shi = nums[i]/10%10;
                if (ge%2==0||shi%2==0){
                    result++;
                }
            }
            if (nums[i] >= 1 && nums[i] < 10) {
                ge = nums[i]%10;
                if (ge%2==0){
                    result++;
                }
            }
            ge = 0;
            bai = 0;
            shi = 0;
            qian = 0;
        }
        return result;
    }
}
