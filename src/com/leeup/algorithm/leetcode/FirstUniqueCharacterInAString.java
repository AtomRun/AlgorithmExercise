package com.leeup.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FirstUniqueCharacterInAString
 * @Description 387. 字符串中的第一个唯一字符
 * @Author clee
 * @Date 2020/12/23 10:15
 * @Version 1.0
 **/
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s) {

        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
