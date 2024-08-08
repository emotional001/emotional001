package com.hudie.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        //初始变量
        int i = 0;
        //进行循环条件
        while (i < 5) {
            System.out.println("牛逼克拉斯");
            i++;
        }
        System.out.println("------------------------------------");

        double peakHeight = 8848860;//山峰高度
        double paperTheickness = 0.1;//纸张厚度

        //定义一个变量conut用于记住纸张折叠了多少次
        int conut = 0;

        //进行循环条件
        while (paperTheickness < peakHeight) {
            //把纸张进行折叠，把纸张变为原来的两倍
            paperTheickness = paperTheickness * 2;
            conut++;
        }
        System.out.println("需要折叠多少次: " + conut);
        System.out.println("-------------------------------------");

        //使用for的书写格式来进行重现上述题目
        double peakHeight1 = 8848860;//山峰高度
        double paperTheickness1 = 0.1;//纸张高度
        //定义一个变量count1折叠了多少次
        int count1 = 0;

        for ( ; paperTheickness1 < peakHeight1 ; count1++) {
            paperTheickness1 = paperTheickness1 * 2;
        }
        System.out.println("需要折叠多少次: " + count1);
        System.out.println("最终的纸张的厚度是: " + paperTheickness1);
    }
}