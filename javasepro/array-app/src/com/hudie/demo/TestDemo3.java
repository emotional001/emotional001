package com.hudie.demo;

import java.util.Random;
import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        //需求:做一个可依次录入员工的工号，然后展示出一组随机的排名顺序
        Scanner sc = new Scanner(System.in);

        int[] codes = new int[5];
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请您输入第" + (i + 1) + "个员工的工号");
            int code = sc.nextInt();
            codes[i] = code;
        }
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int random = r.nextInt(codes.length);
            int temp = codes[random];
            codes[random] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }

    }
}
