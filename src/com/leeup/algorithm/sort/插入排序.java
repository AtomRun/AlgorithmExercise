package com.leeup.algorithm.sort;

/**
 * @ClassName 插入排序
 * @Description TODO
 * @Author clee
 * @Date 2020/12/20 11:35
 * @Version 1.0
 **/
public class 插入排序 {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[i]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i <= a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean less(Comparable v, Comparable w) {
        //v<w 返回-1
        //v=w 返回0
        //v>w 返回1
        //return的时候判断是否小于0，即v<w为true
        //这里在isSorted的作用是判断i是不是比i-1的位置大
        //如果大，即if不会执行，因为v>w或者v=w返回的true，isSorted返回true。
        //如果小，则返回false，表明排序没成功。
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
