package com.hudie.define;

public class MethodTest1 {
    public static void main(String[] args) {
        int rs = add(50);
        System.out.println("1~50的和是: " + rs);


        int rs2 = add(1000);
        System.out.println("1~1000的和是: " + rs2);
    }
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
