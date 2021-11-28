package com.leeup.algorithm.leetcode;

/**
 * @ClassName ThreeConsecutiveOdds
 * @Description TODO
 * @Author clee
 * @Date 2020/11/18 11:06
 * @Version 1.0
 **/
public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1, 3, 2}));
    }

    /**
     * 首先定义一个头索引，从0开始，然后遍历数组，如果是偶数就跳过，如果全都是偶数直接退出循环，返回false，
     * 如果找到了第一个奇数，则判断这个数的后一个数是否为奇数，如果是偶数，继续进行上一步的循环操作，
     * 如果这个数的后一个和再后一个都是奇数，则返回true。找到答案
     *
     * @param arr
     * @return
     */
    public static boolean threeConsecutiveOdds(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int one = 0;
        int two = 1;
        int three = 2;

        for (int i = 0; i < arr.length-2; i++) {
            if (arr[one] % 2 != 0 || arr[two] % 2 != 0 || arr[three] % 2 != 0) {
                return true;
            }else {
                one++;
                two++;
                three++;
            }
        }
        return false;
    }
}
