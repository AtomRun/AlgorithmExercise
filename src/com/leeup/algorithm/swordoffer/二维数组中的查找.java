package com.leeup.algorithm.swordoffer;

/**
 * @ClassName 二维数组中的查找
 * @Description TODO
 * @Author clee
 * @Date 2020/12/17 15:29
 * @Version 1.0
 **/
public class 二维数组中的查找 {

    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //判断二维数组是否为空
        if ((matrix == null || matrix.length == 0) || (matrix.length == 1 && matrix[0].length == 0)) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;// ij右上角
        while (i <= matrix.length - 1 && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            }
            //小于的那一列直接不要了
            //else if (target > matrix[i][j]) i++;
            else {
                i++;
            }
        }
        return false;
    }
}
