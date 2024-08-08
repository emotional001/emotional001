package com.hudie.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        int[] arrs = {20,200,666,444};
        chance(arrs);
        System.out.println(arrs[1]);

    }
    public static void chance(int[] arrs){
        System.out.println("方法内1: " + arrs[2]);
        arrs[1] = 222;
        System.out.println(arrs[1]);
    }
}
