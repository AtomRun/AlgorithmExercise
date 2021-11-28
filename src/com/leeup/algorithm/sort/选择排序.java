package com.leeup.algorithm.sort;

/**
 * @ClassName SelectSort1
 * @Description 选择排序
 * 选择排序每次排序只能找到一个最大值或者最小值
 * 每次排序的结果对下一次的排序没有任何帮助
 * 选择排序移动元素次数小，因为找到了再移动。但我觉得最坏情况下也要移动n次
 *
 * 并且选择排序对于已经排序后的数组也会进行比较
 * @Author clee
 * @Date 2020/12/20 10:27
 * @Version 1.0
 **/
public class 选择排序 {

    //升序
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;//每次循环将当前的i设置为最小值
            for (int j = i+1; j < N; j++) {
                //内循环一直比较剩下的值和当前min知道内循环结束，找到最小的给min
                //内循环结束交换j和min
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            //交换a数组的i和min
            exch(a,i,min);
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

    public static void exch(Comparable[] a,int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
