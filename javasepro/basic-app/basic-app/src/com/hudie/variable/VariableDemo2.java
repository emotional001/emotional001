package com.hudie.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 掌握常见的基本数据变量
        // byte short int long 是整数变量
        byte age = 127;
        System.out.println(age);
        //btye age = 120 报错  byte的变量值是-128到127
        short a = 999;
        System.out.println(a);

        int aa = 999999999;
        System.out.println(aa);

        long aaa = 9999999999L;
        System.out.println(aaa);

        // float double 是小数变量
        float a1 = -21.2F;
        System.out.println(a1);

        double a2 = 333.1;
        System.out.println(a2);

        // char 是字符节变量
        char a3 = '王';
        System.out.println(a3);

        boolean a4 = false;
        System.out.println(a4);
    }
}
