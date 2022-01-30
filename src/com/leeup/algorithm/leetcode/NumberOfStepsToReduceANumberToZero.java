package com.leeup.algorithm.leetcode;

/**
 * @Description 1342. 将数字变成 0 的操作次数
 * @Date 2022/1/31 0:16
 * @Author cLee
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        int temp = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            temp++;
        }
        return temp;
    }
}
