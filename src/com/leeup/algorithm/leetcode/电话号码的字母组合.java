package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 电话号码的字母组合
 * @Description TODO
 * @Author clee
 * @Date 2021/3/21 10:21
 * @Version 1.0
 **/
public class 电话号码的字母组合 {

    String[] letterMap = new String[]{" ", "*", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> result = new ArrayList<>();
    String s;


    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        backTracking(digits, new StringBuilder(), 0);
        return result;
    }

    void backTracking(String str, StringBuilder letter, int index) {
        if (index == str.length()) {
            result.add(s);
            return;
        }

        char c = str.charAt(index);
        int pos = c - '0';
        String map_string = letterMap[pos];
        for (int i = 0; i < str.length(); i++) {
            letter.append(map_string.charAt(i));
            backTracking(str, letter, index + 1);
            letter.deleteCharAt(letter.length() - 1);
        }
    }
}
