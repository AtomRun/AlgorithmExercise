package com.leeup.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LongestSubstringWithoutRepeatingCharacters
 * @Description 3. 无重复字符的最长子串
 * @Author clee
 * @Date 2020/11/11 11:51
 * @Version 1.0
 **/
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int front = 0;
        int back = 0;
        int max = 0;

        Set<Character> chars = new HashSet<>();
        while (front < charArray.length){
            char currentChar = s.charAt(front);
            if (!chars.contains(currentChar)){
                chars.add(currentChar);//放到set里

            }
        }
        return 0;
    }
}
