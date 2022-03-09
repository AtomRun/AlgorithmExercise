package com.leeup.algorithm.acwing.topic;

import java.io.*;

/**
 * @ClassName Merge_Sort
 * @Description TODO
 * @Author ........
 * @Date 2021/1/23 15:35
 * @Version 1.0
 **/
public class Merge_Sort {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());

        int[] arr = new int[n];

        String[] s = input.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        merge_sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge_sort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = l + r >> 1;

        merge_sort(q, l, mid);
        merge_sort(q, mid + 1, r);
        int[] temp = new int[r - l + 1];
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) {
                temp[k++] = q[i++];
            } else {
                temp[k++] = q[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = q[i++];
        }
        while (j <= r) {
            temp[k++] = q[j++];
        }
        for (i = l, j = 0; i <= r; i++, j++) {
            q[i] = temp[j];
        }
    }
}
