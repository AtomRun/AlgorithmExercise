package com.leeup.algorithm.datastruct;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @ClassName HeapTest
 * @Description TODO
 * @Author clee
 * @Date 2020/11/9 17:19
 * @Version 1.0
 **/
public class HeapTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println(minPq.isEmpty());
        System.out.println(maxPq.isEmpty());
        minPq.add(1);
        minPq.add(2);
        minPq.add(3);
        maxPq.add(1);
        maxPq.add(2);
        maxPq.add(3);
        System.out.println(minPq.size());
        System.out.println(maxPq.size());
        System.out.println(minPq.peek());
        System.out.println(maxPq.peek());
        System.out.println(minPq.poll());
        System.out.println(maxPq.poll());
    }
}
