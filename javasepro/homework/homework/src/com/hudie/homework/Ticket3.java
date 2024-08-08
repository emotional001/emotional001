package com.hudie.homework;

import java.util.Scanner;

//需求多名评委打分，分数是0~100之间的int整数，
//选手最后得分去掉最高分和最低分剩余的分数取平均分
//多名评委设为n，打分的输入在方法里面进行，同时在得到最高分和最低分是先通过遍历得到数据再进行筛选
//思路是先定义一个动态化数组用于录入评委的打分
//提前定义三个变量,分别是sum,max,min
//遍历数组中的每个数据来找出最大值和最小值和总和
//最后进行计算返回值


public class Ticket3 {
    public static void main(String[] args) {
        System.out.println("平均分为: " + getAverageScore(6));

    }
    public static double getAverageScore(int number) {
        int[] scores = new int[number];
//        假设number是6
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
//            i = 0 1 2 3 4 5
            System.out.println("第" + (i + 1) + "个评委进行打分");
            int score = sc.nextInt();
            scores[i] = score;
        }

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

//            逻辑思路就是首先score的值会输入给max的第一个数组的值，然后进行第二次的循环
//            第二次的循环再次大于第一次输入的max的值，那就继续输入进去，反之如果没有，那就进行第三次的循环直到结束
//            求min的值相同的思路
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        //计算出平均分并返回
//        思路是先计算出总和然后再减去最大值max和最小值min 然后进行number的除于得到一个平均数进行返回
        return 1.0 * (sum - max - min) / (number - 2);
    }
}
