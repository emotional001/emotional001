package com.hudie.parameter;

public class MethodTest1 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };
        chance(arr);

    }
    public static void chance(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
