package com.hudie.define;

import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] args) {
        judge();

    }

    public static void judge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int Number = sc.nextInt();
        if (Number % 2 == 0){
            System.out.println("您输入的数字为偶数");
        }else {
            System.out.println("你输入的数字为奇数");
        }
    }
}
