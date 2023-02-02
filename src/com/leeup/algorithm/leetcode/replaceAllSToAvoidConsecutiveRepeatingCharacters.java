package com.leeup.algorithm.leetcode;

/**
 * @ClassName replaceAllSToAvoidConsecutiveRepeatingCharacters
 * @Description 替换所有的问号
 * @Author clee
 * @Date 2020/11/8 15:02
 * @Version 1.0
 **/
public class replaceAllSToAvoidConsecutiveRepeatingCharacters {


    public static void main(String[] args) {
        modifyString("s?sz");
    }

    public String modifyString2(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '?') {
                char left = 'a';
                char right = 'a';//先定义这两个是为了好给？在最前边和最后边的赋值
                if (i != 0) {//当不在第一个时
                    left = ch[i - 1];
                }
                if (i != s.length() - 1) {//当不在最后一个时
                    right = ch[i + 1];
                }

                char temp = 'a';
                while (left == temp || right == temp) {
                    temp++;
                }
                ch[i] = temp;
            }
        }
        return new String(ch);
    }

    public static String modifyString(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                //说明是第一个
                char head = i == 0 ? ' ' : charArray[i - 1];
                char last = i == charArray.length - 1 ? ' ' : charArray[i + 1];
                char temp = 'a';
                while (temp == head || temp == last) {
                    temp++;
                }
                charArray[i] = temp;
            }
        }
        return new String(charArray);
    }
}
