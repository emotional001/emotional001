package com.hudie.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        int rs = sum(10, 20);
        System.out.println("和是: " + rs);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
