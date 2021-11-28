package com.leeup.algorithm.acwing.template.binarysearch;
/**
 * 当我们将区间[l, r]划分成[l, mid - 1]和[mid, r]时，
 * 其更新操作是r = mid - 1或者l = mid;
 * 此时为了防止死循环，计算mid时需要加1。
 */
public class TemplateTwo {

    int bsearch(int l, int r) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)){
                l = mid;
            }else {
                r = mid-1;
            }
        }
        return l;
    }

    boolean check(int x){
        return false;
    }
}
