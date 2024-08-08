package com.hudie.homework;

import java.util.Random;

public class Ticket2 {
    public static void main(String[] args) {
        String sc = createCode(5);
        System.out.println(sc);
    }
    public static String createCode(int n){
        Random r =  new Random();
        String code = "";
        for(int i = 1 ; i <= n ; i++){
            int type = r.nextInt(3);//0 1 2
            switch (type){
                case 0:
                    //生成0~9的数字
                    code += r.nextInt(10);
                    break;
                case 1:
                    //生成大写字母字符
                    char ch1 = (char) (r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    //生成小写字母字符
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
        }
        }
        return code;
    }
}
