package com.leeup.algorithm.leetcode;

/**
 * @ClassName ReverseString
 * @Description 反转字符串
 * @Author clee
 * @Date 2020/11/6 11:20
 * @Version 1.0
 **/
public class ReverseString {

    public static void main(String[] args) {
        reverseString1(new char[]{'h', 'e', 'l', 'l', 'o'});
    }


    /**
     * 双指针
     */
    public static void reverseString1(char[] s) {
        int l = 0;
        int r = s.length - 1;

        for (int i = 0; i < s.length; i++) {
            if (l < r) {
                char temp = s[l];
                s[l] = s[r];
                s[r] = temp;

                l++;
                r--;
            }
        }
    }
}
