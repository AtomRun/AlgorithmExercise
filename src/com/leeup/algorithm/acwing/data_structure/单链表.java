package com.leeup.algorithm.acwing.data_structure;

import java.util.Scanner;

/**
 * 实现一个单链表，链表初始为空，支持三种操作：
 * <p>
 * 向链表头插入一个数；
 * 删除第 k 个插入的数后面的数；
 * 在第 k 个插入的数后插入一个数。
 * 现在要对该链表进行 M 次操作，进行完所有操作后，从头到尾输出整个链表。
 * <p>
 * 注意:题目中第 k 个插入的数并不是指当前链表的第 k 个数。
 * 例如操作过程中一共插入了 n 个数，则按照插入的时间顺序，这 n 个数依次为：第 1 个插入的数，第 2 个插入的数，…第 n 个插入的数。
 */
public class 单链表 {
    public static int N = 100000;

    // 记录链表某个节点的值
    public static int[] e = new int[N];
    // 记录链表某个节点的下一个节点的指针
    public static int[] ne = new int[N];
    // head是指向头节点的指针
    public static int head = -1;
    // 表示当前用到了哪个点？或者说下标、指针、地址
    public static int idx = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n-- > 0) {
            String operate = scanner.next();
            if (operate.equals("H")) {
                // H x，表示向链表头插入一个数 x
                int x = scanner.nextInt();
                insertHead(x);
            } else if (operate.equals("D")) {
                int k = scanner.nextInt();
                if (k == 0) {
                    // 删除头节点，指向head的next
                    head = ne[head];
                } else {
                    // 从0开始插入，所以需要k-1
                    delete(k - 1);
                }
            } else if (operate.equals("I")) {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                // 从0开始插入，所以需要k-1
                insert(k - 1, x);
            }
        }

        // 循环输出
        int i = head;
        while (i != -1) {
            System.out.print(e[i] + " ");
            i = ne[i];
        }
    }

    // 在第一个节点之前插入一个新节点，然后把head指针指向新的头节点
    public static void insertHead(int x) {
        /*
        如果把head理解为头节点的next就很好理解了，
        1. ne[idx] = head 表示新节点的next指向头节点的next
        2. head = idx     表示头节点的next等于新节点
        这样一来就能在第一个节点之前插入一个新节点了
         */
        e[idx] = x;
        // 新节点next 指向 head
        ne[idx] = head;
        head = idx;
        idx++;
    }

    // 将x插入到k后
    public static void insert(int k, int x) {
        // x的值给e[idx],idx是最新的节点计数
        e[idx] = x;
        // 最新节点的next指向k这个数之前的next也就是ne[k]
        ne[idx] = ne[k];
        // ne[k] 也就是k的next等于新的数
        ne[k] = idx;
        idx++;
    }

    // 删除下标为k的后面一个点
    public static void delete(int k) {
        // 将k的next修改为k.next.next
        ne[k] = ne[ne[k]];
    }
}
