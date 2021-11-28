package com.leeup.algorithm.acwing.topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @ClassName Main
 * @Description AcWing 104.货仓选址
 * @Author clee
 * @Date 2021/1/12 11:11
 * @Version 1.0
 **/
public class 货仓选址 {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];

        String[] s = input.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        int mid = (n - 1) / 2;
        int sum = 0;

        //取中位数
        for (int j = 0; j < n; j++) {
            sum += Math.abs((arr[mid] - arr[j]));
        }
        System.out.println(sum);

    }
}
