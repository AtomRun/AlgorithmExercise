package com.leeup.algorithm.leetcode;

/**
 * @ClassName PlusOne
 * @Description 66. 加一
 * @Author clee
 * @Date 2020/11/12 18:58
 * @Version 1.0
 **/
public class PlusOne {

    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }

        }
        //如果所有位都是进位，则长度+1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
