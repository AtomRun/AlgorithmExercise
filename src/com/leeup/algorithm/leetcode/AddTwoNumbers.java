package com.leeup.algorithm.leetcode;

/**
 * @ClassName AddTwoNumbers
 * @Description 两数相加
 * @Author clee
 * @Date 2020/10/31 9:30
 * @Version 1.0
 **/
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode();//接l1+l2的和
        ListNode cur = res;//cur用来移动，因为res不能移动，res是结果集
        int digit = 0;//十位数的数
        while (l1 != null || l2 != null) {
            int total = digit;//将每次上一轮的进位赋值给total和新的l1,l2相加
            //第一次都为0,如果dight不为空，即保存了上一轮的进位数，那就放到total里和下面的l1value相加
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            //求上面两个数相加的进位
            digit = total / 10;// 例如18/10 = 1
            cur.next = new ListNode(total % 10);//例如18%10 = 8 由于是逆序，所以将8保存，进1
            cur = cur.next;//指向下一个数进行
        }
        if (digit != 0) {
            cur.next = new ListNode(digit);
        }
        return res.next;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}