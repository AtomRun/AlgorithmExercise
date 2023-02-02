package com.leeup.algorithm.acwing.template.binarysearch;

/**
 * 当我们将区间[l, r]划分成[l, mid]和[mid + 1, r]时， 其更新操作是r = mid或者l = mid + 1;，计算mid时不需要加1。
 */
public class TemplateOne {

    int bsearch(int l, int r) {
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    boolean check(int x) {
        return false;
    }
}
