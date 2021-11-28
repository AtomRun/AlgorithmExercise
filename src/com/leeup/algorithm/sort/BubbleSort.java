package com.leeup.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author clee
 * @Date 2020/11/2 10:28
 * @Version 1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
        sort(new int []{1,1235,34,543,12,66,534,234,2,5});
    }

    public static void  sort(int[] arr ){
        if (arr==null || arr.length<2){
            return;
        }
        for (int end = arr.length-1; end > 0  ; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
