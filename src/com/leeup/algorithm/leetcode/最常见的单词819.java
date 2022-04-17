package com.leeup.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李闯
 * @date 2022/4/17 10:43
 */
public class 最常见的单词819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] s = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String item : s) {
            boolean flag = false;
            for (String value : banned) {
                if (item.equals(value)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
