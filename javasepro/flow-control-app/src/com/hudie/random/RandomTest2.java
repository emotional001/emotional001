package com.hudie.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        while(true){
            System.out.println("--------------------------");
            System.out.println("请您猜测1~100的数字: ");
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();

            if (guessNumber < 1 || guessNumber > 100){
                System.out.println("您输入的数字并不在1~100之间，请重新输入: ");
                continue;
            }

            if (guessNumber > luckNumber){
                System.out.println("您猜的数字过大");
            } else if (guessNumber < luckNumber) {
                System.out.println("您猜的数字过小");
            }else{
                System.out.println("恭喜你成功猜中数字！");
                break;
            }
            sc.close();
        }
    }
}
