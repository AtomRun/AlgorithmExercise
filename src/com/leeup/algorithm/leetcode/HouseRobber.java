package com.leeup.algorithm.leetcode;

/**
 * @ClassName HouseRobber
 * @Description 198. 打家劫舍
 * @Author clee
 * @Date 2020/12/16 16:34
 * @Version 1.0
 **/
public class HouseRobber {

    public static void main(String[] args) {
        System.out.println(rob(new int[] {2, 7, 9, 3, 1}));
    }



    //太直白的傻逼做法~，其实漏洞百出，太单纯了
    public static int rob(int[] nums) {

        int oneMax = 0;
        int twoMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                oneMax+=nums[i];
            }else {
                twoMax+=nums[i];
            }
        }
        return Math.max(oneMax,twoMax);
    }

}
