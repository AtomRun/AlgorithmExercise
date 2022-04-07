package com.leeup.algorithm.leetcode;

/**
 * @author 李闯
 * @date 2022/4/7 12:34
 */
public class 旋转字符串796 {
    public boolean rotateString(String s, String goal) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}
