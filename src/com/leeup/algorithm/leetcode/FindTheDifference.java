package com.leeup.algorithm.leetcode;

/**
 * @ClassName FindTheDifference
 * @Description TODO
 * @Author clee
 * @Date 2020/12/18 11:38
 * @Version 1.0
 **/
public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference2("a", "aa"));
    }

    //字符和相减
    public static char findTheDifference2(String s, String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            diff += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            diff += t.charAt(i);
        }
        return (char) diff;
    }

    ////笨B hash
    //public static char findTheDifference(String s, String t) {
    //    Map map = new HashMap();
    //    char[] charsArray = s.toCharArray();
    //    char[] chartArray = t.toCharArray();
    //
    //}
}
