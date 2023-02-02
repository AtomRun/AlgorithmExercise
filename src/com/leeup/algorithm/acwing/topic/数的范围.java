package com.leeup.algorithm.acwing.topic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName 数的范围
 * @Description TODO
 * @Author clee
 * @Date 2021/1/24 12:56
 * @Version 1.0
 **/
public class 数的范围 {

    static final int N = 100010;
    static int[] q = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] str = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(str[i]);
        }

        //询问次数
        while (m-- > 0) {
            //询问元素
            int x = Integer.parseInt(in.readLine());
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;

                //如果q[mid] >= 询问元素，说明mid在右半边，答案在左半边
                //r = mid 的情况下，答案就在l->mid=r这边
                if (q[mid] >= x) {
                    r = mid;
                } else {
                    //q[mid] <= 询问元素，mid在左半边，答案在右半边
                    //l=mid+1,因为=x在上面会判断，这里除去=mid的情况，mid+1
                    l = mid + 1;
                }
            }
            if (q[l] != x) {
                System.out.print("-1 -1");
            } else {
                System.out.print(l + " ");
                l = 0;
                r = n - 1;
                while (l < r) {
                    int mid = (l + r >> 1) + 1;
                    if (q[mid] <= x) {
                        l = mid;
                    } else {
                        r = mid - 1;
                    }
                }
                System.out.println(l + " ");
            }
        }
    }
}
