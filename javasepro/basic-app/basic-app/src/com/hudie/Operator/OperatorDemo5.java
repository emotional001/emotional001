package com.hudie.Operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //逻辑运算符的使用
        //需求：满足手机必须大于等于6.8，且手机内存必须大于等于8；
        double size = 6.8;
        int storage = 16;
        boolean rs = size >= 6.9 & storage >= 8;
        System.out.println(rs);

        //需求：满足手机要么大于等于6.8，且手机内存要么大于等于8；
        boolean rs2 = size >= 6.98 | storage >= 8;
        System.out.println(rs2);

    }
}
