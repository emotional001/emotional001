package com.hudie.Operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 20;
        a++;
        System.out.println(a);

        int aa = 20;
        int bb = aa++;
        System.out.println(bb);
        System.out.println(aa);

        System.out.println("---------------------------------------");

        int aa1 =20;
        int bb1 = ++aa1;
        int rs = aa1 + bb1;
        System.out.println(bb1);
        System.out.println(aa1);
        System.out.println(rs);

        System.out.println("------------------------------------------");

        int c =10;
        int d= 5;
        int rs3 = c++ + ++c - --d - ++d +1 +c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);
    }
}
