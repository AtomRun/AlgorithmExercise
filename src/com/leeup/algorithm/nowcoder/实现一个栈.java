package com.leeup.algorithm.nowcoder;

import java.util.ArrayList;

/**
 * @author 李闯
 * @date 2022/4/5 18:49
 */
public class 实现一个栈 {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> nums = new ArrayList<>();

    public void push(Integer point) {
        nums.add(point);
    }

    public String pop() {
        if (null == nums.get(0)) {
            return "error";
        }
        nums.remove(0);
        return nums.get(0).toString();
    }

    public String top() {
        if (null == nums.get(0)) {
            return "error";
        }
        return nums.get(0).toString();
    }
}
