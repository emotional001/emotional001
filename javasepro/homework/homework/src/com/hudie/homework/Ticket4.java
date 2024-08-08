package com.hudie.homework;

//需求:某系统的数字密码可自定义密码数量，为了安全，需要加密后再传输，
//加密规则是:对密码中的每位数都加5,再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，
//请设计出满足本需求的加密程序!

//思路：
//定义一个动态数组可以保证每次的数字组不一样
//需要接收数据 然后在方法里面建立一个数组，再进行遍历数组位置，再进行Scanner进行输入数组的数字
//然后再进行第一步的加密 通过定义i的数组位置来+5
//进行第二步加密，通过已经加完5的数字再进行取余10
//进行最后一步加密，将数组的位置进行调换

import java.util.Scanner;

public class Ticket4 {
    public static void main(String[] args) {
        System.out.println(encrypt(4));

    }
    public static String encrypt(int number){
        //定义一个动态数组
        int[] scores = new int[number];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < scores.length; i++){
            System.out.println("请依次输入要加密的数字: ");
            int score = sc.nextInt();
            scores[i] = score;
        }
        //进行输入后的值的数组加5
        for(int i=0; i < scores.length; i++){
            int number1 = 5;
            scores[i] += number1;

        }
        //进行输入后的值取余
        for(int i=0; i < scores.length; i++){
            int number2 = 10;
            scores[i] %= number2;
        }
        //进行数组的值进行反转
        for(int i = 0, j = scores.length - 1 ; i < j; i++, j--){
            int temp = scores[i];
            scores[i] = scores[j];
            scores[j] = temp;
        }
        //进行加密后的数字的排列
        String data = "";
        for(int i=0; i < scores.length; i++){
            data += scores[i];
        }
        return data;
    }
}
