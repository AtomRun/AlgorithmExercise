package com.leeup.algorithm.swordoffer;

import java.util.Arrays;

/**
 * @ClassName 反转单词顺序
 * @Description TODO
 * @Author clee
 * @Date 2020/12/21 21:02
 * @Version 1.0
 **/
public class 反转单词顺序 {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
        System.out.println(Arrays.toString(testString("a good   example")));
    }

    public static String reverseWords(String s) {
        if (s.length() == 0) {
            return s;
        }
        s = s.trim();//去头尾的空格
        String[] strings = s.split(" ");//根据空格把单词切割为数组
        StringBuilder sb = new StringBuilder();//减少重复new string的消耗，但是貌似+连接符也会被优化为Stringbuilder
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals("")) {  //不是空单词就+“ ”
                sb.append(strings[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String[] testString(String s) {
        return s.split(" ");
    }
}
