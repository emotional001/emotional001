package com.hudie.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] array = {20,61,51,22,33};

        //最大索引值

        System.out.println(array.length - 1);

        System.out.println(array.length);

        //赋值
        array[2] = 50;
        array[3] = 60;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }
}
