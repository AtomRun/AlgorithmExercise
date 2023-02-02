package com.leeup.algorithm.leetcode;

/**
 * @ClassName DesignHashset
 * @Description 705 设计Hash集合
 * @Author clee
 * @Date 2021/1/9 10:32
 * @Version 1.0
 **/
public class DesignHashset {

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.remove(2);
        boolean param_3 = obj.contains(2);
    }
}

class MyHashSet {

    boolean[] hashset = null;

    public MyHashSet() {
        hashset = new boolean[1000001];
    }

    public void add(int key) {
        hashset[key] = true;
    }

    public void remove(int key) {
        hashset[key] = false;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return hashset[key];
    }
}