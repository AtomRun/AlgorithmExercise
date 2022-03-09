package com.leeup.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName ContainsDuplicate
 * @Description 217. 存在重复元素
 * @Author clee
 * @Date 2020/11/11 11:33
 * @Version 1.0
 **/
public class ContainsDuplicate {

    /**
     * HashSet不重复
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        HashSet set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() == nums.length;
    }
}
