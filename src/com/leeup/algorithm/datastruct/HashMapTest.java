package com.leeup.algorithm.datastruct;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @ClassName HashMapTest
 * @Description TODO
 * @Author clee
 * @Date 2020/11/11 20:08
 * @Version 1.0
 **/
public class HashMapTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("","");
        hashMap.put(null,"asdasd");
        hashMap.put(null,"12453");

        System.out.println(hashMap.get(null));

        Hashtable hashtable = new Hashtable();
        hashtable.put(null,"Asdasd");
        hashtable.put("asdasd",null);
    }
}
