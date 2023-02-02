package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MergeIntervals
 * @Description 合并区间
 * @Author clee
 * @Date 2020/11/6 9:43
 * @Version 1.0
 **/
public class MergeIntervals {


    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();
        if (intervals.length == 0) {
            return intervals;
        }

        //根据每个数组的第一个元素排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);//基于第一个元素从小到大排序
        for (int[] interval : intervals) {

            //判断result是不是空，第一次为空所以直接放进去，没人比较
            if (result.size() == 0 || interval[0] > result.get(result.size() - 1)[1]) {
                //interval[0]，即开始的元素，类似[1,3]的1
                //result.get(result.size()-1)[1] 即类似[6,7]的7
                result.add(interval);//两者不重叠，添加到result中
            } else {
                //将result的最后一位和interval的的最后一位比较取最大，并且设置为result的最后一位
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
