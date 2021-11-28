package com.leeup.algorithm.test;

/**
 * @ClassName Test
 * @Description TODO
 * @Author clee
 * @Date 2021/2/22 22:40
 * @Version 1.0
 **/
public class Test {

    static Test origin = new Test();

    public static void main(String[] args) {
        int a = Interface.a;
    }

    public static int test(int m) {
        return (m << 3) - m;
    }
}
