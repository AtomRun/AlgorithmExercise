package com.leeup.algorithm.leetcode;

/**
 * @ClassName SortArrayByParityII
 * @Description 922. 按奇偶排序数组 II
 * @Author clee
 * @Date 2020/11/12 10:40
 * @Version 1.0
 **/
public class SortArrayByParityII {


    public int[] sortArrayByParityII1(int[] A) {
        int[] result = new int[A.length];

        int ji = 1;
        int ou = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[ou] = A[i];
                ou += 2;
            } else {
                result[ji] = A[i];
                ji += 2;
            }
        }
        return result;
    }


    public int[] sortArrayByParityII(int[] A) {
        int[] temp = new int[A.length];

        int i = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                temp[i] = num;
                i += 2;
            }
        }

        i = 1;
        for (int num : A) {
            if (num % 2 != 0) {
                temp[i] = num;
                i += 2;
            }
        }
        return temp;
    }
}
