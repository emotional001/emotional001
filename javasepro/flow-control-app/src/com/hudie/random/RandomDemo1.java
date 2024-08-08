package com.hudie.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9 ; i++){
            Random r = new Random();
            int data = r.nextInt(10);//0~9
            if (data == 4){
                System.out.println("在这一次随机到4的数字并删除了");
                continue;
            }
            System.out.println(data);
        }
        System.out.println("--------------------------------------------");
        for (int i =0; i <= 9 ; i++){
            Random r = new Random();
            int data = r.nextInt(10);
            System.out.println(data);
            if (data == 1){
                System.out.println("运行了多少次: " + i);
                break;
            }
            System.out.println("--------------------------------------------");
            int data2 = r.nextInt(10);

        }
    }
}
