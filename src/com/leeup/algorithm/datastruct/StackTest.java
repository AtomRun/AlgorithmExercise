package com.leeup.algorithm.datastruct;

import java.util.Stack;

/**
 * @ClassName Stack
 * @Description TODO
 * @Author clee
 * @Date 2020/11/9 17:07
 * @Version 1.0
 **/
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());//返回最上面的元素
        System.out.println(stack.pop());//最上面的3去掉
        System.out.println(stack);//toString
        System.out.println(stack.size());//size
    }
}
