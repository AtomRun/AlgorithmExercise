package com.leeup.algorithm.nowcoder;

/**
 * @ClassName 第二大的数
 * @Description TODO
 * @Author clee
 * @Date 2021/2/22 0:24
 * @Version 1.0
 **/
public class 第二大的数 {

    public static void main(String[] argv) {
        int[] table = {1, 5, 8, 6, 19, 30, 29, 28};
        int max = table[0];
        int second = table[0];
        for (int i = 0; i < table.length; i++) {
            if (table[i] > max) {
                second = max;
                max = table[i];
            } else if (table[i] > second) {
                second = table[i];
            }
        }
        System.out.println(second);
    }
}
