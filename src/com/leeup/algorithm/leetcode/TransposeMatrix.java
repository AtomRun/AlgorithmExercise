package com.leeup.algorithm.leetcode;

import java.util.Arrays;

/**
 * @ClassName TransposeMatrix
 * @Description TODO
 * @Author clee
 * @Date 2020/11/1 15:49
 * @Version 1.0
 **/
public class TransposeMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

    public static int[][] transpose(int[][] A) {

        int[][] B = new int[A[0].length][A.length];
        //遍历二维数组，假设行i,列j
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));//拿到一维数组
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(A[i][j]);//拿到当前一维数组的三个元素
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
