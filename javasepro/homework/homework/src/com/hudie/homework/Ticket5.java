package com.hudie.homework;

//需求:某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，
//加密规则是:对密码中的每位数都加5,再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，
//请设计出满足本需求的加密程序!

//思路：
//定义一个动态数组可以保证每次的数字组不一样
//需要接收数据 然后创建一个新方法将数字进行拆分
//然后再进行第一步的加密 通过定义i的数组位置来+5
//进行第二步加密，通过已经加完5的数字再进行取余10
//进行最后一步加密，将数组的位置进行调换

public class Ticket5 {
    public static void main(String[] args) {
        System.out.println(encrypt(1983));
    }

    public static String encrypt(int number) {
        //把number的数字进行拆分，然后进行加密
        int[] numbers = split(number);

        //遍历数组中的每个数字，进行加密处理
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //对数组反转，把对数组的反转交给一个独立的方法
        reverse(numbers);

        //拼接数组的数字
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    //reverse方法进行反转数字
    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length -1 ; i < j; i++, j--) {
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }
    }


    //split方法用于拆分数字
    public static int[] split(int number){
        //1983
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
