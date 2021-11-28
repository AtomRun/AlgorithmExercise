package com.leeup.algorithm.datastruct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Queue
 * @Description 队列
 * @Author clee
 * @Date 2020/11/9 16:04
 * @Version 1.0
 **/
public class QueueTest {

    //Queue是接口，实现使用LinkedList而不是ArrayList，因为ArrayList适合读多写少的情况，而LinkedList相反
//    实现的队列一般都是增删功能多，改查少，所以使用LinkedList
    static Queue<Integer> q = new LinkedList<>();//Queue做成LinkedList的样子

    public static void main(String[] args) {
        System.out.println(q.size());
        q.add(1);
        System.out.println(q.size());
        System.out.println(q.toString());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.toString());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.toString());
        System.out.println(q.isEmpty());
    }
}
