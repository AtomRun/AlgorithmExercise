package com.leeup.algorithm.acwing.topic;

import java.util.Arrays;

/**
 * @ClassName 冒泡排序
 * @Description TODO
 * @Author clee
 * @Date 2021/2/26 12:57
 * @Version 1.0
 **/
public class 冒泡排序 {

    public static void main(String[] args) {

        bubbleSort(new int[]{1, 1235, 34, 543, 12, 66, 534, 234, 2, 5});
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }


    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
