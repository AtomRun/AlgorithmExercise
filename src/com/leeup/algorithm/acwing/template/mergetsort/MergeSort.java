package com.leeup.algorithm.acwing.template.mergetsort;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * @Author clee
 * @Date 2020/12/22 19:14
 * @Version 1.0
 **/
public class MergeSort {

    static int[] temp = new int[]{};

    public static void merge_sort(int[] q, int l, int r) {

        if (l >= r) {
            return;
        }
        //1. 确定边界
        int mid = l + r >> 1;

        //2. 分左右
        merge_sort(q, l, mid);
        merge_sort(q, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) {
                temp[k++] = q[i++];
            } else {
                temp[k++] = q[j++];
            }
        }

        //假设左右半边没有循环完，直接拿过来
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
