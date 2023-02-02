package com.leeup.algorithm.leetcode;

/**
 * @ClassName PalindromeNumber
 * @Description 判断回文数
 * @Author clee
 * @Date 2021/1/22 21:41
 * @Version 1.0
 **/
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        while (left <= right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
