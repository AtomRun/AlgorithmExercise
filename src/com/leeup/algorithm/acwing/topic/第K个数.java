package com.leeup.algorithm.acwing.topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName 第K个数
 * @Description TODO
 * @Author clee
 * @Date 2021/1/30 11:26
 * @Version 1.0
 **/
public class 第K个数 {

    static final int N = 100010;
    //static final int[] q = new int[N];
    static final int[] q = new int[]{2, 4, 1, 5, 3};


    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //String[] s = input.readLine().split(" ");
        //读入数组长度和k个数
        //int n = Integer.parseInt(s[0]);
        //int k = Integer.parseInt(s[1]);
        int n = 5;
        int k = 3;

        //读入数组
        //String[] s1 = input.readLine().split(" ");
        //for (int i = 0; i < n; i++) {
        //    q[i] = Integer.parseInt(s1[i]);
        //}

        //排序并返回第k个数，从0-n-1，找第k小的数字
        System.out.printf(String.valueOf(quick_sort(0, n - 1, k)));

    }

    public static int quick_sort(int l, int r, int k) {
        //l==r的情况下，说明找到了k, return l或者r都可以
        if (l == r) {
            return q[l];
        }

        int x = q[l], i = l - 1, j = r + 1;

        //排序
        while (i < j) {
            while (q[++i] < x)
                ;
            while (q[--j] > x)
                ;
            if (i <= j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        //sl 左边的个数，k的大小和左边相比，如果小于左边，那就在左半边排序。
        int sl = j - l + 1;
        if (k <= sl) {
            return quick_sort(l, j, k);
        }
        return quick_sort(j + 1, r, k - sl);
    }
}
