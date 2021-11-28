package com.leeup.algorithm.acwing.template.quicksort;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author clee
 * @Date 2020/12/21 11:09
 * @Version 1.0
 **/
public class QuickSort {

    public static void quickSort(int q[], int l, int r) {

        //区间没有数，或者只有一个数，直接return
        if (l >= r) {
            return;
        }
        int x = q[l], i = l - 1, j = r + 1;
        //边界点取l，i和j取l和r的两侧，是为了每次循环前两个数字要移动一位正好到l和r上
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
        quickSort(q,l,j);
        quickSort(q,j+1,r);
    }
}
