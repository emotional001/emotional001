package com.hudie.homework;

import java.time.Month;

//需求:用户购买机票时，机票原价会按照淡季、旺季，头等舱还还是经济舱的情况进行相应的优惠，
//优惠方案如下:5-10月为旺季，头等舱9折，经济舱8.5折;11月到来年4月为淡季，头等舱7折，经济舱6.5折，
//请开发程序计算出用户当前机票的优惠价。
public class Ticket {
    public static void main(String[] args) {
        double price = calculate(1000,8,"经济舱");
        System.out.println(price);
    }

    public static double calculate(double price, int month, String type) {
        //5到10为旺季的头等舱优惠以及经济舱的优惠 设置一个区间
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}