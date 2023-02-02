package com.leeup.algorithm.acwing.topic;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @ClassName 高精度加法
 * @Description TODO
 * @Author clee
 * @Date 2021/1/25 9:55
 * @Version 1.0
 **/
public class 高精度加法 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger[] bigIntegers = a.divideAndRemainder(b);
        System.out.println(bigIntegers[0]);
        if (bigIntegers[1] != null) {
            System.out.println(bigIntegers[1]);
        }
        scanner.close();
    }
}
