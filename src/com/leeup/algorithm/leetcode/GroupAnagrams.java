package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName GroupAnagrams
 * @Description 49 字母异位分组
 * @Author clee
 * @Date 2020/11/5 11:11
 * @Version 1.0
 **/
public class GroupAnagrams {

    /**
     * 给定一个字符串数组，将字母异位词组合在一起。
     * 字母异位词指字母相同，但排列不同的字符串。

    输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
    输出:
            [
            ["ate","eat","tea"],
            ["nat","tan"],
            ["bat"]
            ]
     */

    public static void main(String[] args) {
        List<List<String>> lists = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        //使用hashmap存放排序后的key,然后将相同字母value存进去
        HashMap<String,ArrayList> map = new HashMap<>();
        for (String s:strs) {//遍历拿出来所有的字符串
            //将字符串转为字符单独处理
            char[] temp = s.toCharArray();
            //从a-z排序
            Arrays.sort(temp);
            System.out.println(temp);
            //转为string做key
            String key = new String(temp);
            //当前map没有这个key。直接创建一个，并且开辟一个list空间
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            //根据key找到空间，并且将本次原本的s放进去
            map.get(key).add(s);
        }
        //return
        return new ArrayList(map.values());
    }
}
