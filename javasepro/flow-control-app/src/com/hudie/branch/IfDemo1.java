package com.hudie.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        double t = 37.2;
        if (t > 37){
            System.out.println("温度异常！");
        }
        int a1 = 15;
        int a2 = 44;
        int a3 = 72;
        if (a1 > a2 && a1 > a3){
            System.out.println("最大值为: " + a1);
        }else if (a2 > a1 && a2 > a3){
            System.out.println("最大值为: " + a2);
        }else if (a3 > a1 && a3 > a2){
            System.out.println("最大值为: " + a3);
        }
    }
}
