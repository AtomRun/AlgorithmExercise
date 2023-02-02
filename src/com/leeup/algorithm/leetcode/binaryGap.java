package com.leeup.algorithm.leetcode;

/**
 * @ClassName binaryGap
 * @Description 二进制间距      ERROR
 * @Author clee
 * @Date 2020/11/1 16:24
 * @Version 1.0
 **/
public class binaryGap {

    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }

    public static int binaryGap(int n) {
        int time = 0;

        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            char aChar = chars[i];
            char test = '1';
            if (aChar == test) {
                time += 1;
            }
        }
        return time;
    }
}
