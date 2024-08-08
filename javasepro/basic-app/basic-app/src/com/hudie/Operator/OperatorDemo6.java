package com.hudie.Operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 需求：找出两个整数中的较大值，并输出
        int a = 19;
        int b = 88;
        String rs = a > b ? "a是较大值" : "b是较大值";
        System.out.println(rs);


        System.out.println("--------------------------------------------");

        int a1 = 99;
        int a2 = 55;
        int a3 = 22;
        int temp = a1 > a2 ? a1 : a2;
        int rs2 = temp > a3 ? temp : a3;
        System.out.println(rs2);

    }
}