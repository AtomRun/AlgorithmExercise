package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cLee
 * @description
 * @date 2022/1/30 17:57
 */
public class UncommonWordsFromTwoSentences {

    /**
     * 使用原生库
     *
     * @param s1
     * @param s2
     * @return
     */
    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        Map<String, Integer> map = new HashMap(array1.length + array2.length);
        for (String value : array1) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        for (String value : array2) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        List<String> strings = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v <= 1) {
                strings.add(k);
            }
        });

        String[] result = new String[strings.size()];
        strings.toArray(result);

        return result;
    }

    public static void main(String[] args) {
        String[] strings = uncommonFromSentences("this apple is sweet", "this apple is sour");
    }
}
