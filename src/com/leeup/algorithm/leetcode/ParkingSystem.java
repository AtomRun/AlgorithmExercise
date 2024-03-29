package com.leeup.algorithm.leetcode;

/**
 * @ClassName ParkingSystem
 * @Description TODO
 * @Author clee
 * @Date 2021/3/20 14:01
 * @Version 1.0
 **/
public class ParkingSystem {


    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            big--;
            return big >= 0;
        } else if (carType == 2) {
            medium--;
            return medium >= 0;
        } else {
            small--;
            return small >= 0;
        }
    }
}
