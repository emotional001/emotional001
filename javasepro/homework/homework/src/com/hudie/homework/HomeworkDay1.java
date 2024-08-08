package com.hudie.homework;

import java.util.Scanner;

public class HomeworkDay1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //依次录入整数
        System.out.println("请输入第一个整数: ");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个整数: ");
        int num2 = sc.nextInt();

        System.out.println("请输入第三个整数: ");
        int num3 = sc.nextInt();

        //比较整数最大值;
        if (num1 > num2 && num1 > num3){
            System.out.println("最大值为: " + num1);
        }else if (num2 > num1 && num2 >num3){
            System.out.println("最大值为: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("最大值为: " + num3);
        }

    }
}
