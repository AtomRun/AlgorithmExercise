package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你个整数数组 arr，其中每个元素都 不相同。
 * <p>
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。 需要考虑的情况是：只返回最小的，如果有相同的，那么只需要一个，升序返回
 */
public class 最小绝对差1200 {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int length = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int bestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < length - 1; ++i) {
            int temp = arr[i + 1] - arr[i];
            if (temp < bestNumber) {
                result.clear();
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                tempList.add(arr[i + 1]);
                result.add(tempList);
                bestNumber = temp;
            } else if (temp == bestNumber) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                tempList.add(arr[i + 1]);
                result.add(tempList);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{1, 2, 4, 4}));
    }
}
