package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName ValidAnagram
 * @Description TODO
 * @Author clee
 * @Date 2020/11/22 10:42
 * @Version 1.0
 **/
public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("\"\"", "\"\""));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] ArrayS = s.toCharArray();
        char[] ArrayT = t.toCharArray();
        Arrays.sort(ArrayS);
        Arrays.sort(ArrayT);
        return Arrays.equals(ArrayS, ArrayT);
    }
}
