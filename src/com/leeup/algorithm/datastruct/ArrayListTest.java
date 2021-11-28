package com.leeup.algorithm.datastruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArrayListTest
 * @Description TODO
 * @Author clee
 * @Date 2020/11/10 20:57
 * @Version 1.0
 **/
public class ArrayListTest {

    public static void main(String[] args) {
        //ArrayList arrayList = new ArrayList();
        //arrayList.add(12);
        //System.out.println(arrayList.size());

        //ArrayList<Integer> arrayList = new ArrayList<>(-1);
        //System.out.println(arrayList.toString());
        //System.out.println(arrayList.size());

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(new Integer(12),new Integer(213)));
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        arrayList1.add(123);
        System.out.println(arrayList1.toString());
        System.out.println(arrayList1.size());
    }
}
