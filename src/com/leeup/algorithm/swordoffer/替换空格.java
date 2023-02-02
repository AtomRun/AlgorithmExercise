package com.leeup.algorithm.swordoffer;

/**
 * @ClassName 替换空格
 * @Description 05
 * @Author clee
 * @Date 2020/12/19 21:26
 * @Version 1.0
 **/
public class 替换空格 {

    public static void main(String[] args) {
        System.out.println(replaceSpace("we are happy"));
        char[] c = {'h', '2'};
        String t = "435245";
        t.equals(c);
    }

    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
