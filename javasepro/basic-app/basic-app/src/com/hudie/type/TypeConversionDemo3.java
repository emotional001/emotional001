package com.hudie.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        int a = 20;
        byte b = (byte) a;
        System.out.println(b);

        int aa = 10;
        short bb = 20;
        byte cc = (byte) (aa + bb);
        System.out.println(cc);

        long c = 99999;
        byte x = (byte) c;
        System.out.println(x);//报错

    }
}
