package com.leeup.algorithm.pib;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李闯
 * @date 2022/4/5 19:00
 */
public class 判定字符是否唯一 {

    public boolean isUnique(String astr) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                return false;
            }
            map.put(chars[i], i);
        }
        return true;
    }
}
