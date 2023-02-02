package com.leeup.algorithm.acwing.topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName 子数组的和
 * @Description TODO
 * @Author clee
 * @Date 2021/1/26 11:28
 * @Version 1.0
 **/
public class 子数组的和 {

    final static int N = 1010;
    static int[][] a = new int[N][N];
    static int[][] s = new int[N][N];

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = in.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int q = Integer.parseInt(s1[2]);

        for (int i = 1; i <= n; i++) {

            String[] s2 = in.readLine().split(" ");

            for (int j = 1; j <= m; j++) {
                s[i][j] = Integer.parseInt(s2[j - 1]);
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] += s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1];
            }
        }
        while (q-- > 0) {
            String[] s3 = in.readLine().split(" ");
            int x1 = Integer.parseInt(s3[0]);
            int y1 = Integer.parseInt(s3[1]);
            int x2 = Integer.parseInt(s3[2]);
            int y2 = Integer.parseInt(s3[3]);
            System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
        }
    }
}
