package com.leeup.algorithm.sort;

/**
 * @ClassName InsertSort
 * @Description 插入排序
 * @Author clee
 * @Date 2020/11/2 10:47
 * @Version 1.0
 **/
public class InsertSort {

    public static void main(String[] args) {

    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //从1开始，不排序1
        for (int i = 1; i < arr.length; i++) {
            //从i-1的位置开始排序，并且j>=0判断不越界
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
