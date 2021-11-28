package com.leeup.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

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
        this.big =big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1) {
            big--;
            if(big<0) return false;
            return true;
        }
        else if(carType == 2) {
            medium--;
            if(medium<0) return false;
            return true;
        }
        else {
            small--;
            if(small<0) return false;
            return true;
        }
    }
}
