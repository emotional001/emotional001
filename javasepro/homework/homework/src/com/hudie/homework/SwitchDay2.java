package com.hudie.homework;

import java.util.Scanner;

public class SwitchDay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //提示用户输入第一个整数
        System.out.println("请输入第一个整数: ");
        int num1 = sc.nextInt();

        System.out.println("请输入运算符（+，-，*，/）: ");
        char operator = sc.next().charAt(0);

        //提示用户输入第二个整数
        System.out.println("请输入第二个整数: ");
        int num2 = sc.nextInt();

        //计算结果
        int result;
        switch (operator){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("错误：除数不能为零");
                    return;
                }
                break;
            default:
                System.out.println("无效的运算符,请输入正确的运算符");
                return;
        }
        System.out.println("结果是：" + result);

        sc.close();
    }
}
