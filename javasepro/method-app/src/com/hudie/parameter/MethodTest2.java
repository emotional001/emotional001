package com.hudie.parameter;

public class MethodTest2 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {11,22,33,44};
        System.out.println(equals(arr1, arr2));
    }
    public static boolean equals(int[] arr1 , int[] arr2){
        //判断arr1和arr2是否都是null
        if (arr1 == null && arr2 == null){
            return true;
        }
        if (arr1 == null || arr2 == null){
            return false;
        }
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
