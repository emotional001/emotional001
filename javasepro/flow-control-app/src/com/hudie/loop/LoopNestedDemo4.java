package com.hudie.loop;

public class LoopNestedDemo4 {
    public static void main(String[] args) {

        //每次打印三行*****
        for (int i = 1 ; i <= 3 ; i++){

            for (int j = 1 ; j <= 4 ; j++){

                System.out.print("*");//print是不换行的意思
            }
            System.out.println();
        }
    }
}
