package com.LBoy.practice;

public class no4 {
    public static void main() {
        int x = 15;
        int y = 32;
        int z = 8;
        if (x > y && x > z) {
            System.out.println("三个数中最大的是：" + x);
        } else if (y > x && y > z) {
            System.out.println("三个数中最大的是：" + y);
        } else {
            System.out.println("三个数中最大的是：" + z);
        }
    }
}