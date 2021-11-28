package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RemoveElement
 * @Description 删除元素
 * @Author clee
 * @Date 2020/11/4 14:49
 * @Version 1.0
 **/
public class RemoveElement {


    public static void main(String[] args) {
        //System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));

        int i = removeElement2(new int[]{2}, 3);
        System.out.println(i);
    }


    /**
     * 重写一次
     */
    public static int removeElement3(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]!=val){
                left++;
            }
            if (nums[right]==val){
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = nums[temp];
        }
        return nums[left]==val?left:left+1;
    }

    /**
     * double pointer
     */
    public static int removeElement2(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            //l就是要找到val，只要不相等就会一直找
            while(l<r && nums[l] != val){
                l++;
            }
            //r就是要找到非val的值
            while(l<r && nums[r] == val){
                r--;
            }
            //每次循环结束交换值，将l的值赋值给r，r的给l
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        //循环结束的时候，l指针如果指向val，即l指向了r即l=r的情况下，我们直接返回l
        //因为l每次增加就说明增加一个不等于val的数，说白了就是计数器，l在val的前一位，因为从0开始所以要+1
        //为什么要考虑不为val的时候呢？假设只有数组只有一个元素，且和val不相等。l直接就是0,r也是0，不做这个+1判断
        //直接返回l就是0,是错误的。
        return nums[l] == val?l:l+1;
        //return l;
    }

    /**
     * 使用额外空间的方式
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        List<Integer> templates = new ArrayList<>();

        for (int num : nums) {
            if (val != num) {
                templates.add(num);
            }
        }
        return templates.size();
    }
}
