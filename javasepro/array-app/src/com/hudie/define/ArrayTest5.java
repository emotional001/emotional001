package com.hudie.define;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        //创建一个名为scores的动态数组
        double[] scores = new double[6];
        //导入Scanner扫描器
        Scanner sc = new Scanner(System.in);

        //在外循环定义一个求和的变量
        double sum = 0;

        //循环录入六位评委的的分数并录入分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "个评委的分数: ");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        System.out.println("平均分为:" + (sum / scores.length));
    }
}