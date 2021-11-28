package com.leeup.algorithm.acwing.topic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @ClassName 前缀和
 * @Description TODO
 * @Author clee
 * @Date 2021/1/25 11:08
 * @Version 1.0
 **/
public class 前缀和 {

    static final int N = 100010;
    static final int[] a = new int[N];
    static final int[] s = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = in.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        String[] s2 = in.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(s2[i-1]);
        }
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i];
        }


        while (m-- > 0) {
            String[] s3 = in.readLine().split(" ");
            int l = Integer.parseInt(s3[0]);
            int r = Integer.parseInt(s3[1]);
            System.out.println(s[r] - s[l-1]);
        }
    }
}
