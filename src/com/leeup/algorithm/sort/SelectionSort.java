package com.leeup.algorithm.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author clee
 * @Date 2020/11/2 10:39
 * @Version 1.0
 **/
public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void sort(int [] arr){
        if (arr==null || arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;//找到最小数的下标
            for (int j = i+1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex]? j :minIndex;
            }
            swap(arr,i,minIndex);
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
