package com.leeup.algorithm.datastruct;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName DQ
 * @Description 双端队列
 * @Author clee
 * @Date 2020/11/9 16:49
 * @Version 1.0
 **/
public class DQ {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        System.out.println(deque.isEmpty());
        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque.toString());
        System.out.println(deque.size());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.toString());
        System.out.println(deque.pollLast());
        System.out.println(deque.toString());
    }
}
