package com.hudie.demo;

public class TestDemo2 {
    public static void main(String[] args) {

        //需求:某组的数据有5个数据：10,20,30,40,50,请将这个数据反转
        int[] Number = {10,20,30,40,50};

        for (int i = 0 , j = Number.length - 1; i < j; i++ , j--) {

            int temp = Number[j];

            Number[j] = Number[i];

            Number[i] = temp;
            
        }
        for (int i = 0 ; i < Number.length; i++) {
            System.out.println(Number[i]);
        }
    }
}
