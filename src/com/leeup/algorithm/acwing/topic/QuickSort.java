package com.leeup.algorithm.acwing.topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName QuickSort
 * @Description 705快排
 * @Author clee
 * @Date 2020/12/21 16:38
 * @Version 1.0
 **/
public class QuickSort {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //几个数字

        String s1 = input.readLine();
        String[] s = s1.split(" ");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        quick_sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick_sort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }
        //确定分界点
        int x = q[(l + r) >> 1];

        //指向两侧，每次交换之后移动一格，从一开始就移动，所以先提前-1
        int i = l - 1;
        int j = r + 1;
        while (i < j) {
            do {
                i++;
            }
            while (q[i] < x);

            do {
                j--;
            }
            while (q[j] > x);

            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

    public static void quickSort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }

        int i = l - 1;
        int j = r + 1;

        int x = q[(l + r) >> 1];

        while (i < j) {
            do {
                i++;
            }
            while (q[i] < x);
            do {
                j--;
            }
            while (q[j] > x);

            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }
}
